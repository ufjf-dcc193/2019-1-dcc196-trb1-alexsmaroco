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

import br.ufjf.dcc193.trb1.Models.Membro;
import br.ufjf.dcc193.trb1.Repositories.MembroRepository;

@Controller
public class MembroController {

    @Autowired
    private MembroRepository membroRepo;

    @RequestMapping(method = RequestMethod.GET, path = "membros.html")
    ModelAndView listaMembros(@RequestParam Integer id_sede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");
        List<Membro> repoRes = membroRepo.findByFkIdSede(id_sede);
        mv.addObject("id_sede", id_sede);
        mv.addObject("membros", repoRes);
        return mv;
    }

    @RequestMapping(method=RequestMethod.GET, path="novoMembro.html")
    ModelAndView novoMembro(@RequestParam Integer id_sede) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("id_sede", id_sede);
        mv.setViewName("novoMembro");
        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, path="novoMembro.html")
    RedirectView salvarMembro(@RequestParam Integer id_sede, Membro m) {
        m.setFkIdSede(id_sede);
        membroRepo.save(m);
        return new RedirectView("membros.html?id_sede=" + id_sede);
    }

    @RequestMapping(method = RequestMethod.POST, path = "membros.html")
    RedirectView deletaMembro(@RequestParam Integer id_membro, @RequestParam Integer id_sede) {
        System.out.println(id_sede);
        membroRepo.deleteById(id_membro);
        return new RedirectView("membros.html?id_sede=" + id_sede);
    }

    @RequestMapping(method=RequestMethod.GET, path="detalhesMembro.html")
    ModelAndView detalhesMembro(@RequestParam Integer id) {
        ModelAndView mv = new ModelAndView();
        Membro m = membroRepo.getOne(id);
        mv.addObject("membro", m);
        return mv;
    }

    @RequestMapping(method=RequestMethod.POST, path="detalhesMembro.html")
    RedirectView updateMembro(@RequestParam Integer id, Membro membro) {
        Membro m = membroRepo.getOne(id);
        String[] ignore = {"id", "fkIdSede"};
        BeanUtils.copyProperties(membro, m, ignore);
        membroRepo.save(m);
        return new RedirectView("detalhesMembro.html?id=" + m.getId());
    }
    
}