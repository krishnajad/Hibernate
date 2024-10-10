package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cources {
    @Id
    private int cid;
    private String cname;
    @ManyToMany(mappedBy = "cs")

    private List <Student> st=new ArrayList<>();

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getSt() {
        return st;
    }

    public void setSt(List<Student> st) {
        this.st = st;
    }
}
