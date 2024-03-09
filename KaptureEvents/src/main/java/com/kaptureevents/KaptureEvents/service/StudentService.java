package com.kaptureevents.KaptureEvents.service;

import com.kaptureevents.KaptureEvents.entity.Student;
import com.kaptureevents.KaptureEvents.model.StudentModel;
import org.springframework.http.ResponseEntity;

public interface StudentService {
    void registerStudent(StudentModel studentModel);

    ResponseEntity<Student> studentProfile(String email);

    ResponseEntity<Student> editStudentDetails(String email, StudentModel updatedStudentModel);

    ResponseEntity<Boolean> deleteStudent(String email);
}