package org.camunda.bpm.getstarted.loanapproval.bean;

public class genderBean {

    String gender;
    String name;

    public genderBean(){}

    public genderBean(String gender){
        this.gender = gender;
    }

    public genderBean(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

}
