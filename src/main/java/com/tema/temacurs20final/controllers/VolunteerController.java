package com.tema.temacurs20final.controllers;

import com.tema.temacurs20final.models.Volunteer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Controller
public class VolunteerController {

    @GetMapping("/volunteer-signup")
    public String showSignupForm(Model model) {
        model.addAttribute("volunteer", new Volunteer());
        return "volunteer-signup"; // This returns the volunteer-signup.html page
    }

    @PostMapping("/volunteer-signup")
    public String submitSignupForm(@ModelAttribute Volunteer volunteer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("volunteers.txt", true))) {
            // Write volunteer information to the file
            writer.write(volunteer.getName() + "," + volunteer.getEmail() + "," + volunteer.getPhone() + "," + volunteer.getEvent());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "signup-success"; // Redirect to the signup-success.html page
    }
}