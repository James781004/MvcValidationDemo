package com.James.demo.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8148993073056325684L;

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "no empty allowed")
    @Size(min = 1, max = 10, message = "watch the length")
    private String name;

    @NotNull
    @Min(value = 0, message = "0 ~ 300")
    @Max(value = 300, message = "0 ~ 300")
    private int age;

    @NotEmpty(message = "no empty allowed")
    private String birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}
