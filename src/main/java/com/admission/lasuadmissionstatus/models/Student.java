package com.admission.lasuadmissionstatus.models;

import jakarta.persistence.*;

@Entity
@Table(name="Students")
public class Student {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id ;
    public String image;

    public String name;
    public String soo;
    public String lga;
    public String sex;
    public String age;
    public String utme_number;
    public String preferred_course;
    public int utme_score;
    public String exam_type;
    public String exam_year;
    public String exam_number;
    public int crs;
    public int civic;
    public int english;
    public int economics;
    public int lit;
    public int maths;
    public int govt;
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoo() {
        return soo;
    }

    public void setSoo(String soo) {
        this.soo = soo;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUtme_number() {
        return utme_number;
    }

    public void setUtme_number(String utme_number) {
        this.utme_number = utme_number;
    }

    public String getPreferred_course() {
        return preferred_course;
    }

    public void setPreferred_course(String preferred_course) {
        this.preferred_course = preferred_course;
    }

    public int getUtme_score() {
        return utme_score;
    }

    public void setUtme_score(int utme_score) {
        this.utme_score = utme_score;
    }

    public String getExam_type() {
        return exam_type;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public String getExam_year() {
        return exam_year;
    }

    public void setExam_year(String exam_year) {
        this.exam_year = exam_year;
    }

    public String getExam_number() {
        return exam_number;
    }

    public void setExam_number(String exam_number) {
        this.exam_number = exam_number;
    }

    public int getCrs() {
        return crs;
    }

    public void setCrs(int crs) {
        this.crs = crs;
    }

    public int getCivic() {
        return civic;
    }

    public void setCivic(int civic) {
        this.civic = civic;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getEconomics() {
        return economics;
    }

    public void setEconomics(int economics) {
        this.economics = economics;
    }

    public int getLit() {
        return lit;
    }

    public void setLit(int lit) {
        this.lit = lit;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getGovt() {
        return govt;
    }

    public void setGovt(int govt) {
        this.govt = govt;
    }




}
