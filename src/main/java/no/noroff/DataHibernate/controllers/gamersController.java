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

import java.util.ArrayList;
import java.util.List;

import static no.noroff.DataHibernate.GamerHibernateApplication.addGamer;
import static no.noroff.DataHibernate.GamerHibernateApplication.getGamer;


@Controller
public class gamersController {

    // Display all gamers
    @RequestMapping(value = "/gamers", method = RequestMethod.GET)
    @ResponseBody
    public List<gamers> getGamerInfo() {
        return GamerHibernateApplication.getGamer();
    }

    // Display 1 gamer by id
    @RequestMapping(value = "/gamers/{id}", method = RequestMethod.GET)
    @ResponseBody
    // public gamers = return gamers
    public gamers getGamerById(
            @PathVariable("id") int id) {
            for(gamers g: GamerHibernateApplication.getGamer()){
                if(g.getGamerId() == id){
                    return g;
                }
            }
            return null;
    }

    // POST new gamer
    @PostMapping(value = "/gamers")
    @ResponseBody
    public gamers postNewGamer(@ModelAttribute gamers theNewGamer){
        addGamer(theNewGamer.getGamerName(), theNewGamer.getGamerEmail(), theNewGamer.getGamerPassword());

        return theNewGamer;
    }

    // Display gamer's characters based on owner id and gamer id
    // Ownerid is automatically set to zero = problem
    @RequestMapping(value = "/test/{userName}", method = RequestMethod.GET)
    @ResponseBody
    public List<Object> findAllCharactersFromUser(@PathVariable String userName){
        List<Object> userHeroList = new ArrayList<>();
        for (hero h : GamerHibernateApplication.getHero()) {
            for (gamers g : GamerHibernateApplication.getGamer()) {
                if (h.getHeroOwnerId() == g.getGamerId() && g.getGamerName().equalsIgnoreCase(userName)) {
                    userHeroList.add(h);
                }
            }
        }
        return userHeroList;
    }

}
