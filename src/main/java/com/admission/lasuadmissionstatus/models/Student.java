package com.admission.lasuadmissionstatus.models;

import jakarta.persistence.*;

@Entity
@Table(name="Students")
public class Student {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id ;
    public String image;

    public String jamb_result;
    public String waec_result;

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

    public String yoruba;

    public String crs;
    public String civic;
    public String english;
    public String economics;
    public String lit;
    public String maths;
    public String govt;

    public String getYoruba() {
        return yoruba;
    }

    public void setYoruba(String yoruba) {
        this.yoruba = yoruba;
    }
    public String getJamb_result() {
        return jamb_result;
    }

    public void setJamb_result(String jamb_result) {
        this.jamb_result = jamb_result;
    }

    public String getWaec_result() {
        return waec_result;
    }

    public void setWaec_result(String waec_result) {
        this.waec_result = waec_result;
    }

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

    public String getCrs() {
        return crs;
    }

    public void setCrs(String crs) {
        this.crs = crs;
    }

    public String getCivic() {
        return civic;
    }

    public void setCivic(String civic) {
        this.civic = civic;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getEconomics() {
        return economics;
    }

    public void setEconomics(String economics) {
        this.economics = economics;
    }

    public String getLit() {
        return lit;
    }

    public void setLit(String lit) {
        this.lit = lit;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getGovt() {
        return govt;
    }

    public void setGovt(String govt) {
        this.govt = govt;
    }
}
