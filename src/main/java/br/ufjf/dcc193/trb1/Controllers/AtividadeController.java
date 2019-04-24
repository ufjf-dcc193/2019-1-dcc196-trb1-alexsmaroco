package br.ufjf.dcc193.trb1.Controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.trb1.Models.Atividade;
import br.ufjf.dcc193.trb1.Repositories.AtividadeRepository;


@Controller
public class AtividadeController {

    @Autowired
    private AtividadeRepository ativRepo;

    @RequestMapping(method = RequestMethod.GET, path = "atividades.html")
    ModelAndView listaAtividades(@RequestParam Integer id_sede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Atividade> repoRes = ativRepo.findByFkIdSede(id_sede);
        mv.addObject("id_sede", id_sede);
        mv.addObject("atividades", repoRes);
        return mv;
    }

    @RequestMapping(method=RequestMethod.GET, path="novaAtividade.html")
    ModelAndView novaAtividade(@RequestParam Integer id_sede) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("id_sede", id_sede);
        mv.setViewName("novaAtividade");
        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, path="novaAtividade.html")
    RedirectView salvarAtividade(@RequestParam Integer id_sede, Atividade a) {
        a.setFkIdSede(id_sede);
        ativRepo.save(a);
        return new RedirectView("atividades.html?id_sede=" + id_sede);
    }

    @RequestMapping(method = RequestMethod.POST, path = "atividades.html")
    RedirectView deletaAtividade(@RequestParam Integer id_ativ, @RequestParam Integer id_sede) {
        ativRepo.deleteById(id_ativ);
        return new RedirectView("atividades.html?id_sede=" + id_sede);
    }

    @RequestMapping(method=RequestMethod.GET, path="detalhesAtividade.html")
    ModelAndView detalhesAtividade(@RequestParam Integer id) {
        ModelAndView mv = new ModelAndView();
        Atividade a = ativRepo.getOne(id);
        mv.addObject("atividade", a);
        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, path="detalhesAtividade.html")
    RedirectView updateAtividade(@RequestParam Integer id, Atividade ativ) {
        Atividade a = ativRepo.getOne(id);
        String[] ignore = {"id", "fkIdSede"};
        BeanUtils.copyProperties(ativ, a, ignore);
        ativRepo.save(a);
        return new RedirectView("detalhesAtividade.html?id=" + a.getId());
    }
    
}