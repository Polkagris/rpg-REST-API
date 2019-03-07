package no.noroff.DataHibernate.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heroclass")
public class heroclass implements Serializable {

    // Getters and setters
    // ID
    public int getHeroClassId() { return heroclass_id; }
    public void setHeroClassId(int heroclass_id) { this.heroclass_id = heroclass_id; }
    // Name
    public String getHeroClassName() { return heroclass_name; }
    public void setHeroClassName(String heroclass_name) {
        this.heroclass_name = heroclass_name;
    }
    // Ability
    public String getHeroClassAbility() { return heroclass_ability; }
    public void setHeroClassAbility(String heroclass_ability) {
        this.heroclass_ability = heroclass_ability;
    }
    // Owner ID
    public int getHeroClassOwnerId() { return heroclass_ownerid; }
    public void setHeroClassOwnerId(int heroclass_ownerid) {
        this.heroclass_ownerid = heroclass_ownerid;
    }



    @Override
    public String toString() {
        return heroclass_id + "\t" + heroclass_name + "\t" + heroclass_ability + "\t" + heroclass_ownerid;
    }

    @Id
    @Column(name = "heroclass_id", unique = true)
    private int heroclass_id;

    @Column(name = "heroclass_name", nullable = false)
    private String heroclass_name;

    @Column(name = "heroclass_ability", nullable = false)
    private String heroclass_ability;

    @Column(name = "heroclass_ownerid", nullable = false)
    private int heroclass_ownerid;

}
