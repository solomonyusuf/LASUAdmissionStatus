package com.admission.lasuadmissionstatus.service;

import com.admission.lasuadmissionstatus.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class RegisterStudents {
    @Autowired
    private StudentRepository _student;

    @PostMapping("/create-student")
    public String RegisterStudent()
    {
        try
        {

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return "";
    }
}
