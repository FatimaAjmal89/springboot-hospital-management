package com.hospitalmanagment.hospitalManagment;

import com.hospitalmanagment.hospitalManagment.entity.Patient;
import com.hospitalmanagment.hospitalManagment.repository.PatientRepository;
import com.hospitalmanagment.hospitalManagment.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository(){
        List<Patient> patientslist = patientRepository.findAll();
        System.out.println(patientslist);

        Patient  p = new Patient();
        patientRepository.save(p);
    }
    @Test
    public void testTransectionMethods(){
        Patient patient = patientService.getpatientbyid(2L,31L);
        Patient patient1 = patientService.getpatientbyid(2L,31L);
        System.out.println(patient1);
        System.out.println(patient);
    }
}
