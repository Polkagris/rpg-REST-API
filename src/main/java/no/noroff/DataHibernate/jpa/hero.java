package no.noroff.DataHibernate.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hero")
public class hero implements Serializable {

    // Getters and setters
    // ID
    public int getHeroId() {
        return hero_id;
    }
    public void setHero_Id(int hero_id) { this.hero_id = hero_id; }
    // Name
    public String getHeroName() { return hero_name; }
    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }
    // Lvl
    public int getHeroLvl() { return hero_lvl; }
    public void setHero_lvl(int hero_lvl) {
        this.hero_lvl = hero_lvl;
    }
    // Owner ID
    public int getHeroOwnerId() { return hero_ownerid; }
    public void setHero_ownerId(int hero_ownerid) {
        this.hero_ownerid = hero_ownerid;
    }
    // Class
    public String getHeroClass() { return hero_class; }
    public void setHero_class(String hero_class) {
        this.hero_class = hero_class;
    }


    @Override
    public String toString() {
        return hero_id + "\t" + hero_name + "\t" + hero_lvl + "\t" + hero_ownerid + "\t" + hero_class;
    }

    @Id
    @Column(name = "hero_id", unique = true)
    private int hero_id;

    @Column(name = "hero_name", nullable = false)
    private String hero_name;

    @Column(name = "hero_lvl", nullable = false)
    private int hero_lvl;

    @Column(name = "hero_ownerid", nullable = false)
    private int hero_ownerid;

    @Column(name = "hero_class", nullable = false)
    private String hero_class;

}
