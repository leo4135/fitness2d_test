package DFIT.fitness2d.entity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Objects;
@Entity
@Table(name = "peoples") // если надо изменить название таблицы
public class Client {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Id
    private String phone;
    @Column
    private String email;
    @Column
    private String password;
    @ManyToOne
    private Role role;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "ошибка ввода");
        this.name = name;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        Objects.requireNonNull(surname, "ошибка ввода");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Objects.requireNonNull(age, "ошибка ввода");
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        Objects.requireNonNull(phone, "ошибка ввода");
        this.phone = phone;
    }
}


