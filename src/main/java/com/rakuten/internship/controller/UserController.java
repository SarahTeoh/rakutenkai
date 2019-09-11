package com.rakuten.internship.controller;

import com.rakuten.internship.entity.User;
import com.rakuten.internship.entity.SendDataForm;
import com.rakuten.internship.service.TagService;
import com.rakuten.internship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private TagService tagService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tags", tagService.findTags());
        return "home";
    }

    @GetMapping("/search")
    public String search(@ModelAttribute SendDataForm senddata ,Model model) {
        
        List<User> users = userService.findUsersByTag(tagService.findBytagId(senddata.tagId));
//        List<User> users = userService.findUsersFromCity("Osaka");
        model.addAttribute("users", users);
        //TODO: Input the right View name
        return "output";
    }

}

