package com.yr.permission.entry;

public class Permissions {
    private Integer id;
    private String url;
    private String name;
    private String method;
    private Integer sup_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getSup_id() {
        return sup_id;
    }

    public void setSup_id(Integer sup_id) {
        this.sup_id = sup_id;
    }
}
