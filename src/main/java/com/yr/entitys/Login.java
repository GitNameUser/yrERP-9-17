package com.yr.entitys;

public class Login {
    private Integer id;

    private String name;

    private String passwod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswod() {
        return passwod;
    }

    public void setPasswod(String passwod) {
        this.passwod = passwod;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwod='" + passwod + '\'' +
                '}';
    }
}
