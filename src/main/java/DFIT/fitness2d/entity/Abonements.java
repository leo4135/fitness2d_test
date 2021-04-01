package DFIT.fitness2d.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;

@Entity
public class Abonements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int workouts;
    @Column
    private String nameAb;
    @Column
    private Date date;
    @Column
    private int month;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkouts() {
        return workouts;
    }

    public void setWorkouts(int workouts) {
        this.workouts = workouts;
    }

    public String getNameAb() {
        return nameAb;
    }

    public void setNameAb(String nameAb) {
        this.nameAb = nameAb;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }





}
