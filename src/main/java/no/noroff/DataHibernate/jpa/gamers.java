package no.noroff.DataHibernate.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gamers")
public class gamers implements Serializable {

    // Getters and setters
    // ID
    public int getGamerId() {
        return gamer_id;
    }
    public void setGamer_id(int gamer_id) { this.gamer_id = gamer_id; }
    // Name
    public String getGamerName() { return gamer_name; }
    public void setGamer_name(String gamer_name) {
        this.gamer_name = gamer_name;
    }
    // Email
    public String getGamerEmail() { return gamer_email; }
    public void setGamer_email(String gamer_email) {
        this.gamer_email = gamer_email;
    }
    // Password
    public String getGamerPassword() { return gamer_password; }
    public void setGamer_password(String gamer_password) {
        this.gamer_password = gamer_password;
    }


    @Override
    public String toString() {
        return gamer_id + "\t" + gamer_name + "\t" + gamer_email + "\t" + gamer_password;
    }

    @Id
    @Column(name = "gamer_id", unique = true)
    private int gamer_id;

    @Column(name = "gamer_name", nullable = false)
    private String gamer_name;

    @Column(name = "gamer_email", nullable = false)
    private String gamer_email;

    @Column(name = "gamer_password", nullable = false)
    private String gamer_password;

}
