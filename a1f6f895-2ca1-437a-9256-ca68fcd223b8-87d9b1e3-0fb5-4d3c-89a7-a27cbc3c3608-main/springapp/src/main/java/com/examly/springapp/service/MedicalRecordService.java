package com.examly.springapp.service;

import com.examly.springapp.model.MedicalRecord;
import java.util.List;

public interface MedicalRecordService {
    MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);
    List<MedicalRecord> getAllMedicalRecords();
    List<MedicalRecord> getMedicalRecordsByPatientId(Long patientId);
    MedicalRecord getMedicalRecordById(Long id);
    MedicalRecord updateMedicalRecord(Long id, MedicalRecord medicalRecord);
    void deleteMedicalRecord(Long id);
}
