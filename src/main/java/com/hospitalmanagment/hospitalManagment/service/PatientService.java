package com.hospitalmanagment.hospitalManagment.service;

import com.hospitalmanagment.hospitalManagment.entity.Patient;
import com.hospitalmanagment.hospitalManagment.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    @Transactional
    public Patient getpatientbyid(Long id, Long id2) {
        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id2).orElseThrow();

        System.out.println(p1==p2);
        p1.setName("ajmal");
        p2.setName("fatima");
        p1.setGender("male");
        p2.setGender("female");
        patientRepository.save(p1 );
        patientRepository.save(p2);
        return p1;


    }


}
