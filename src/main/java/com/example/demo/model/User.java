package com.example.demo.model;

import java.util.Objects;

import javax.persistence.*;

@Access(AccessType.FIELD)
//@MappedSuperclass
@Entity
@Table(name = "systemuser")
public class User {
    @Id
    @SequenceGenerator(name = "testt_id_seq", sequenceName = "testt_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testt_id_seq")
    private Integer id;
    @Column(name = "user_login")
    private String login;
    @Column(name = "user_password")
    private String password;
    //private String val;
    private Integer age;
    public User(){}

    /*User(String name, String password) {

        this.name = name;
        this.password = password;
    }*/
    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getAge(){return this.age;}
    public void setAge(Integer age){this.age = age;}
    public String getLogin(){return this.login;}
    public void setLogin(String login){this.login = login;}
    public String getPassword(){return this.password;}
    public void setPassword(String password){this.password = password;}
    /*public String getVal()
    {
        return this.val;
    }*/
    /*public void setVal(String val)
    {
        this.val = val;
    }*/
    public User(String user_login, String user_password, int age)
    {
        this.age = age;
        this.login = user_login;
        this.password = user_password;
    }
    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        return Objects.equals(this.id, user.id) && Objects.equals(this.login, user.login)
                && Objects.equals(this.password, user.password)
                && Objects.equals(this.age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.password, this.login, this.age);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id +
                ", user='" + this.login + "'" +
                ", password='" + this.password + "'" +
                ", age='" + this.age +"'}";
    }
}
