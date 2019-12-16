package ru.vlsv.shopuserui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.vlsv.shopuserui.controller.repr.SignupForm;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(SignupForm signupForm) {
        return "login";
    }

    @PostMapping("/signup")
    public String signup(@Valid SignupForm signupForm, BindingResult bindingResult, RedirectAttributes attributes) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        attributes.addAttribute("email", signupForm.getEmail());
        return "redirect:/register";
    }
}
