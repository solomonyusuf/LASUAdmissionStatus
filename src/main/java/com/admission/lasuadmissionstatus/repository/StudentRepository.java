package com.admission.lasuadmissionstatus.repository;

import com.admission.lasuadmissionstatus.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
}