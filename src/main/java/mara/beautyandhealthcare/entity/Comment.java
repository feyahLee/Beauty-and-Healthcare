package mara.beautyandhealthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //nume de fields
    private String name;
    private String text;
    private Instant date;

    public Comment (Long id, String name, String text, Instant date){   // aici sunt valorile propriu zise date de useri
        this.id = id; // primu id e de la linia 6, unde e spatiu propriu-zis si al 2lea e valoarea atribuita :))
        this.name = name; // this acceseaza valoarea clasei strict deci daca vreau sa accesez aloarea clasei o accesez cu this:))
        this.text = text;
        this.date = date;
    }

    public Comment(){} // e un constructor gol pe car -l vom folosi in caz ca vreau sa-i dau valori in main cu get si set si atunci ca sa pot sa-i pun valorii trebuie sa fie gol

    public Long getId(){ // get imi returneaza valoarea id-ului din field
        return id;
    }

    public void setId(Long didi){       // valoare didi e cea pe care vreau s ao suprascriu pest evechea valoare.
        this.id = didi;
    }

    public String getName(){
        return name;
    }
     public void setName(String nume){
        this.name = nume;
     }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}

