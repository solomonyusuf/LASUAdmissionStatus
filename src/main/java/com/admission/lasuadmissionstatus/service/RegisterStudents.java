package com.admission.lasuadmissionstatus.service;

import com.admission.lasuadmissionstatus.dtos.StudentDTO;
import com.admission.lasuadmissionstatus.models.Student;
import com.admission.lasuadmissionstatus.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RequestMapping
@Controller
public class RegisterStudents {
    @Autowired
    private StudentRepository _student;
    @Autowired
    private FileStorageService fileStorageService;

    private Student tracker;

    @GetMapping({"/",""})
    public String Home(Model model)
    {
        try
        {
            var instance = new StudentDTO();
            model.addAttribute("dto",instance);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return "index";
    }
    @PostMapping("/create-student")
    public String RegisterStudent(@ModelAttribute StudentDTO dto, BindingResult result)
    {
        try
        {

            var formEntity = new Student();
            formEntity.setName(dto.getName());
            formEntity.setLga(dto.getLga());
            formEntity.setSex(dto.getSex());
            formEntity.setAge(dto.getAge());
            formEntity.setSoo(dto.getSoo());
            formEntity.setUtme_number(dto.getUtme_number());
            formEntity.setPreferred_course(dto.getPreferred_course());
            formEntity.setUtme_score(dto.getUtme_score());
            formEntity.setExam_type(dto.getExam_type());
            formEntity.setExam_year(dto.getExam_year());
            formEntity.setExam_number(dto.getExam_number());
            formEntity.setEnglish(dto.getEnglish());
            formEntity.setMaths(dto.getMaths());
            formEntity.setEconomics(dto.getEconomics());
            formEntity.setCivic(dto.getCivic());
            formEntity.setCrs(dto.getCrs());
            formEntity.setLit(dto.getLit());
            formEntity.setGovt(dto.getGovt());
            formEntity.setYoruba(dto.getYoruba());

            String imageName = fileStorageService.storeFile(dto.image);
            String imageUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/public/")
                    .path(imageName)
                    .toUriString();
            formEntity.setImage(imageUrl);

            String jambName = fileStorageService.storeFile(dto.jamb_result);
            String jambUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/public/")
                    .path(jambName)
                    .toUriString();
            formEntity.setJamb_result(jambUrl);

            String waecName = fileStorageService.storeFile(dto.waec_result);
            String waecUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/public/")
                    .path(waecName)
                    .toUriString();
            formEntity.setWaec_result(waecUrl);



            // Save form entity to the database
            tracker = _student.save(formEntity);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return "redirect:/detail/view?id="+ tracker.getId();
    }
}
