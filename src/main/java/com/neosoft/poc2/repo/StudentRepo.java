package com.neosoft.poc2.repo;

import com.neosoft.poc2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
