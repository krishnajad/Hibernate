package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Laptop {
    @Id
    private int lid;

    private String llname;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLlname() {
        return llname;
    }

    public void setLlname(String llname) {
        this.llname = llname;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + llname + '\'' +
                '}';
    }
}
