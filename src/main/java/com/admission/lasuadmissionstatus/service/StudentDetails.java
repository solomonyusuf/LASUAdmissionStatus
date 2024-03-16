package com.admission.lasuadmissionstatus.service;

import com.admission.lasuadmissionstatus.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping
@Controller
public class StudentDetails {

    @Autowired
    private StudentRepository _student;

    @GetMapping("/detail/view")
    public String ViewOneStudent(Model model, @RequestParam int id)
    {
        try
        {
            var student = _student.findById(id);
            model.addAttribute("student", student);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return "students/detail";
    }
}
