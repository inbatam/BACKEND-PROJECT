package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.MedicalRecord;
import java.util.List;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    
    @Query("SELECT mr FROM MedicalRecord mr WHERE mr.patient.id = :patientId")
    List<MedicalRecord> findByPatientId(@Param("patientId") Long patientId);
}