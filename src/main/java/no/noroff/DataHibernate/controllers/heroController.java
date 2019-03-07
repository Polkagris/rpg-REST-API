package no.noroff.DataHibernate.controllers;

import no.noroff.DataHibernate.GamerHibernateApplication;
import no.noroff.DataHibernate.jpa.hero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import no.noroff.DataHibernate.jpa.gamers;
import java.util.List;

import static no.noroff.DataHibernate.GamerHibernateApplication.addHero;


@Controller
public class heroController {

    // Display all heroes
    @RequestMapping(value = "/hero", method = RequestMethod.GET)
    @ResponseBody
    public List<hero> getHeroInfo() {
        return GamerHibernateApplication.getHero();
    }

    // Display 1 hero by id
    @RequestMapping(value = "/hero/{id}", method = RequestMethod.GET)
    @ResponseBody
    // public hero = return hero
    public hero getGamerById(
            @PathVariable("id") int id) {
        for(hero h: GamerHibernateApplication.getHero()){
            if(h.getHeroId() == id){
                return h;
            }
        }
        return null;
    }

    // POST new hero
    @PostMapping(value = "/hero")
    @ResponseBody
    public hero postNewHero(@ModelAttribute hero theNewHero){
        addHero(theNewHero.getHeroName(), theNewHero.getHeroLvl(), theNewHero.getHeroOwnerId(), theNewHero.getHeroClass());

        // reads the DB new gamer
        System.out.println(theNewHero);

        return theNewHero;
    }



}
