package br.ufjf.dcc193.trb1.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.trb1.Models.Atividade;
import br.ufjf.dcc193.trb1.Models.Membro;
import br.ufjf.dcc193.trb1.Models.Sede;
import br.ufjf.dcc193.trb1.Repositories.AtividadeRepository;
import br.ufjf.dcc193.trb1.Repositories.MembroRepository;
import br.ufjf.dcc193.trb1.Repositories.SedeRepository;

@Controller
public class SedeController {

    @Autowired
    SedeRepository sedeRepo;

    @Autowired
    MembroRepository membroRepo;

    @Autowired
    AtividadeRepository ativRepo;

    @RequestMapping(method = RequestMethod.GET, path = "sedes.html")
    ModelAndView listaSedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        List<Sede> repoRes = sedeRepo.findAll();
        mv.addObject("sedes", repoRes);
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "sedes.html")
    @Transactional
    RedirectView deletaSede(@RequestParam Integer id) {
        List<Membro> membros = membroRepo.findByFkIdSede(id);
        for(Membro m: membros) {
            membroRepo.deleteById(m.getId());
        }
        List<Atividade> ativ = ativRepo.findByFkIdSede(id);
        for(Atividade a: ativ) {
            ativRepo.deleteById(a.getId());
        }
        sedeRepo.deleteById(id);
        return new RedirectView("sedes.html");
    }

    @RequestMapping(method=RequestMethod.GET, path="novaSede.html")
    ModelAndView novaSede() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("novaSede");
        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, path="novaSede.html")
    RedirectView salvarSede(Sede sede) {
        sedeRepo.save(sede);
        return new RedirectView("sedes.html");
    }

    @RequestMapping(method=RequestMethod.GET, path="detalhesSede.html")
    ModelAndView detalhesSede(@RequestParam Integer id) {
        ModelAndView mv = new ModelAndView();
        Sede s = sedeRepo.getOne(id);
        mv.addObject("sede", s);
        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, path="detalhesSede.html")
    RedirectView updateSede(@RequestParam Integer id, Sede sede) {
        Sede s = sedeRepo.getOne(id);
        BeanUtils.copyProperties(sede, s, "id");
        sedeRepo.save(s);
        return new RedirectView("detalhesSede.html?id=" + s.getId());
    }

    @RequestMapping("relatorio.html")
    ModelAndView gerarRelatorio() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("relatorio");
        List<Sede> sedes = sedeRepo.findAll();
        List<String[]> dadosRelat = new ArrayList<String[]>();
        for(Sede s: sedes) {
            List<Atividade> ativs = ativRepo.findByFkIdSede(s.getId());
            Integer[] totalHoras = {0,0,0,0};
            for(Atividade a: ativs) {
                totalHoras[0]+=a.getHoras_assistencial();
                totalHoras[1]+=a.getHoras_juridica();
                totalHoras[2]+=a.getHoras_financeira();
                totalHoras[3]+=a.getHoras_executiva();
            }
            String[] str = {s.getNome_fantasia(), totalHoras[0].toString(), totalHoras[1].toString(), totalHoras[2].toString(), totalHoras[3].toString()};
            dadosRelat.add(str);
        }
        mv.addObject("dados", dadosRelat);
        return mv;
    }
}