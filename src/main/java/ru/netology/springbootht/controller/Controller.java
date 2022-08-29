package ru.netology.springbootht.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springbootht.systemProfile.SystemProfile;

@RestController
@RequestMapping("/")
public class Controller {
    private SystemProfile profile;

    public Controller (SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile(){
        return profile.getProfile();
    }
}
