package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
    @Id
    private int subid;
    private String subname;
    @ManyToOne
    private Student st;



    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }



    @Override
    public String toString() {
        return "Subject{" +
                "subid=" + subid +
                ", subname='" + subname + '\'' +
                '}';
    }
}
