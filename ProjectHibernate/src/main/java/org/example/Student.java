package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Student {
    @Id
    private int id;
    private StudentFullName name;
    private String city;
    @OneToOne
    private Laptop lap;
    @OneToMany
    private List <Subject> sub=new ArrayList<Subject>() ;
    @ManyToMany
    private List<Cources> cs=new ArrayList<>();



//    public Student(String city, int id, String name) {
//        this.city = city;
//        this.id = id;
//        this.name = name;
//    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StudentFullName getName() {
        return name;
    }

    public void setName(StudentFullName name) {
        this.name = name;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public List<Subject> getSub() {
        return sub;
    }

    public void setSub(List<Subject> sub) {
        this.sub = sub;
    }

    public List<Cources> getCs() {
        return cs;
    }

    public void setCs(List<Cources> cs) {
        this.cs = cs;
    }

    @Override
    public String toString(){
        return this.id+":"+this.name+":"+this.city;
    }
}
