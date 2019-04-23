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

import br.ufjf.dcc193.trb1.Models.Sede;
import br.ufjf.dcc193.trb1.Repositories.SedeRepository;

@Controller
public class SedeController {

    @Autowired
    SedeRepository sedeRepo;

    @RequestMapping("sedes.html")
    ModelAndView listaSedes(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        List<Sede> repoRes = sedeRepo.findAll();
        for(Sede s: repoRes) {
            System.out.println(s.getNome_fantasia());
        }
        mv.addObject("sedes", repoRes);
        return mv;
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
        System.out.println(id);
        Sede s = sedeRepo.getOne(id);
        BeanUtils.copyProperties(sede, s, "id");
        sedeRepo.save(s);
        return new RedirectView("detalhesSede.html?id=" + s.getId());
    }
}