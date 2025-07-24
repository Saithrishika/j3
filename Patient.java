package com.medicalapp.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
public class Patient {
    private String id;
    private String name;
    private int age;
    private String symptoms;

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSymptoms() { return symptoms; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSymptoms(String symptoms) { this.symptoms = symptoms; }
}
