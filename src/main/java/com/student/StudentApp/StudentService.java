package com.student.StudentApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listStudents(){
        return studentRepository.findAll();
    }

    public void add(Student student){
        try{

        studentRepository.save(student);
    }
    catch (Exception e){
            System.out.println(e.getStackTrace());

        }
        }
    public Student get(Integer student_no){
        return studentRepository.findById(student_no).get();
    }

    public void delete(Integer student_no){
        studentRepository.deleteById(student_no);
    }
}
