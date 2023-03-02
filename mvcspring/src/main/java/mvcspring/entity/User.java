package mvcspring.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name="DemoUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "pass")
    private String pass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{ Email:" +getEmail()+" Pass:" +getPass()+"}";
    }
}
