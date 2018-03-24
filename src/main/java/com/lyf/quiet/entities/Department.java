package com.lyf.quiet.entities;

public class Department {
    private Integer id;
    private Integer depaId;
    private String depaName;

    public Department() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Department(Integer id, Integer depaId, String depaName) {
        this.id = id;
        this.depaId = depaId;
        this.depaName = depaName;
    }

    public Integer getDepaId() {
        return depaId;
    }

    public void setDepaId(Integer depaId) {
        this.depaId = depaId;
    }

    public String getDepaName() {
        return depaName;
    }

    public void setDepaName(String depaName) {
        this.depaName = depaName;
    }

    @Override
    public String toString() {
        return "Department [depaId=" + depaId + ", depaName=" + depaName + "]";
    }


}
