package com.examly.springapp.service;

import com.examly.springapp.model.Doctor;
import com.examly.springapp.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    
    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    
    @Override
    public Page<Doctor> getDoctorsWithPagination(Pageable pageable) {
        return doctorRepository.findAll(pageable);
    }
    
    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }
    
    @Override
    public Doctor updateDoctor(Long id, Doctor doctor) {
        doctor.setDoctorId(id);
        return doctorRepository.save(doctor);
    }
    
    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}
