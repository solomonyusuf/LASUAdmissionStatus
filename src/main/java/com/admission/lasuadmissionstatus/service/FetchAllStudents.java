package com.admission.lasuadmissionstatus.service;

import com.admission.lasuadmissionstatus.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping
public class FetchAllStudents {

    @Autowired
    private StudentRepository _student;

    @GetMapping("/all-students")
    public String GetAllStudents(Model model)
    {
        try
        {
            var students = _student.findAll();
            model.addAttribute("students", students);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

        return "students/listing";
    }
}
