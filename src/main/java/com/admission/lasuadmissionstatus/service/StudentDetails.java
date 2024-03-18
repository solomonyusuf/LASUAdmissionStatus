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
            var student = _student.findById(id).get();
            var jamb_percentage = student.utme_score/8;

            var waec_score = 0;
            waec_score += this.GradeCalculator(student.english);
            waec_score += this.GradeCalculator(student.civic);
            waec_score += this.GradeCalculator(student.economics);
            waec_score += this.GradeCalculator(student.lit);
            waec_score += this.GradeCalculator(student.maths);


            var waec_percentage = waec_score/8;

            var admission_status = " PROVISIONALLY ADMITTED";

            if((waec_percentage + jamb_percentage) < 70)
            {
                admission_status = " NOT ADMITTED";
            }

            model.addAttribute("student", student);
            model.addAttribute("english", this.GradeCalculator(student.english));
            model.addAttribute("civic", this.GradeCalculator(student.civic));
            model.addAttribute("economics", this.GradeCalculator(student.economics));
            model.addAttribute("lit", this.GradeCalculator(student.lit));
            model.addAttribute("maths", this.GradeCalculator(student.maths));
            model.addAttribute("jamb_percentage", jamb_percentage);
            model.addAttribute("waec_percentage", waec_percentage);
            model.addAttribute("total_percentage", (waec_percentage + jamb_percentage));
            model.addAttribute("admission_status", admission_status);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return "students/detail";
    }

    public int GradeCalculator(String grade){
            if(grade.equals("A")) return 10;
            else if (grade.equals("B")) return 8;
            else if (grade.equals("C")) return 6;
            else if (grade.equals("D")) return 4;
            else if (grade.equals("E")) return 2;
            else return 1;
    }
}
