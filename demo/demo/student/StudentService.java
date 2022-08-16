package com.example.demo.model.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
//    @Autowired
//    private final studentRepository studentRepositorys;
    public String getStudents(){
        student test = new student(
                1L,
                "mariam",
                21,
                LocalDate.of(2000, Month.JANUARY,6),
                "mariam.whocares@gmail.com"
        );
        String result = test.getName();
        return result;

    }

}
