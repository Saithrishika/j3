package com.medicalapp.controller;
import com.medicalapp.model.Patient;
import com.medicalapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @PostMapping("/patient")
    public String addPatient(@RequestBody Patient patient) {
        repo.save(patient);
        return "Patient data saved successfully!";
    }
}
