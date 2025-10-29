package com.hospitalmanagment.hospitalManagment.service;

import com.hospitalmanagment.hospitalManagment.entity.Patient;
import com.hospitalmanagment.hospitalManagment.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    @Transactional
    public Patient getpatientbyid(Long id) {
        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();
        System.out.println(p1==p2);
        return p1;
    }
}
