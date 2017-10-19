package ru.ivmiit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ivmiit.models.Auto;
import ru.ivmiit.models.User;
import ru.ivmiit.repositories.AutoRepository;
import ru.ivmiit.repositories.UsersRepository;

import java.util.List;

@Controller
public class AutoController {
    @Autowired
    private AutoRepository autoRepository;

    @GetMapping(value = "/auto")
    public String getUsersPage(
            @ModelAttribute("model")
                    ModelMap model) {
        List<Auto> auto = autoRepository.findAll();
        model.addAttribute("auto", auto);
        return "auto_page";

    }
    @PostMapping(value = "/auto")
    public String addAuto(@ModelAttribute Auto auto) {
        autoRepository.save(auto);
        return "redirect:/auto";
    }
}