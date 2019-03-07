package no.noroff.DataHibernate.controllers;

import no.noroff.DataHibernate.GamerHibernateApplication;
import no.noroff.DataHibernate.jpa.heroclass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import no.noroff.DataHibernate.jpa.gamers;
import java.util.List;


@Controller
public class heroClassController {

    // Display all heroclasses
    @RequestMapping(value = "/heroclass", method = RequestMethod.GET)
    @ResponseBody
    public List<heroclass> getHeroClassInfo() {
        return GamerHibernateApplication.getHeroClass();
    }

    // Display 1 heroclass by name
    @RequestMapping(value = "/heroclass/{name}", method = RequestMethod.GET)
    @ResponseBody
    // public gamers = return gamers
    public heroclass getHeroClassById(
            @PathVariable("name") String name) {
        for(heroclass c: GamerHibernateApplication.getHeroClass()){
            if(c.getHeroClassName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }



}
