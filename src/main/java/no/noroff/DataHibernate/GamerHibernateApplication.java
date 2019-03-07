package no.noroff.DataHibernate;


import no.noroff.DataHibernate.jpa.gamers;
import no.noroff.DataHibernate.jpa.hero;
import no.noroff.DataHibernate.jpa.heroclass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@SpringBootApplication
public class GamerHibernateApplication {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("mamps");

    public static void main(String[] args) {

        // #################  MAIN  ##############################
        //addGamer("Ms. Marble", "marble@solveyourcrimes.com", "the butler did it!");
        //addHero("Pip", 60, 2, "Warlock");
        //addHeroClass("Shaman", "Restoration", 5);

        // Gamer loop
        for (gamers g: getGamer()) {
            // toString -> override to print everything in gamer class
            System.out.println(g.toString());
        }
        // Hero loop
        for (hero h: getHero()) {
            // toString -> override to print everything in gamer class
            System.out.println(h.toString());
        }
        // Heroclass loop
        for (heroclass c: getHeroClass()) {
            // toString -> override to print everything in gamer class
            System.out.println(c.toString());
        }

        SpringApplication.run(GamerHibernateApplication.class, args);
    }

    // Get all gamers
    public static List<gamers> getGamer(){
        List<gamers> gamerList = null;

        EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try{
            transaction = manager.getTransaction();
            transaction.begin();

            gamerList = manager.createQuery("SELECT s FROM gamers s", gamers.class).getResultList();

            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally {
            manager.close();
        }

        return gamerList;
    }

    // Add Gamer
    public static void addGamer(String gamer_name, String gamer_email, String gamer_password){
        EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try{
            transaction = manager.getTransaction();
            transaction.begin();

            // Create new gamer object
            gamers newGamer = new gamers();
            newGamer.setGamer_name(gamer_name);
            newGamer.setGamer_email(gamer_email);
            newGamer.setGamer_password(gamer_password);

            manager.persist(newGamer);

            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally {
            manager.close();
        }
    }

    // Add Hero
    public static void addHero(String hero_name, int hero_lvl, int hero_ownerid, String hero_class){
        EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try{
            transaction = manager.getTransaction();
            transaction.begin();

            // Create new gamer object
            hero newHero = new hero();
            newHero.setHero_name(hero_name);
            newHero.setHero_lvl(hero_lvl);
            newHero.setHero_ownerId(hero_ownerid);
            newHero.setHero_class(hero_class);

            manager.persist(newHero);

            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally {
            manager.close();
        }
    }
    // Get all heroes
    public static List<hero> getHero(){
        List<hero> heroList = null;

        EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try{
            transaction = manager.getTransaction();
            transaction.begin();

            heroList = manager.createQuery("SELECT s FROM hero s", hero.class).getResultList();

            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally {
            manager.close();
        }

        return heroList;
    }

    // Add HeroClass
    private static void addHeroClass(String heroclass_name, String heroclass_ability, int heroclass_ownerid){
        EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try{
            transaction = manager.getTransaction();
            transaction.begin();

            // Create new heroclass object
            heroclass newHeroClass = new heroclass();
            newHeroClass.setHeroClassName(heroclass_name);
            newHeroClass.setHeroClassAbility(heroclass_ability);
            newHeroClass.setHeroClassOwnerId(heroclass_ownerid);

            manager.persist(newHeroClass);

            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally {
            manager.close();
        }
    }

    // Get all heroclasses
    public static List<heroclass> getHeroClass(){
        List<heroclass> heroClassList = null;

        EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try{
            transaction = manager.getTransaction();
            transaction.begin();

            heroClassList = manager.createQuery("SELECT s FROM heroclass s", heroclass.class).getResultList();

            transaction.commit();
        }catch (Exception e){
            if(transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
        finally {
            manager.close();
        }

        return heroClassList;
    }

}
