package com.bishe;

import com.bishe.controller.UserController;
import com.bishe.service.UserService;
import com.bishe.tmp.Viewattr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@SpringBootApplication
public class test {

    @Autowired
    UserService userService;
    @Autowired
    UserController userController;

    @RequestMapping("/")
    public String  home(Model model, HttpServletRequest request) {
        if(userController.isLogin(request)){
            return "redirect:/user/login";
        }
        Viewattr viewattr =new Viewattr();
        viewattr.setFragment_id("content");
        viewattr.setFragment_path("welcome/content");
        model.addAttribute("viewattr",viewattr);
        return "wrapper";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(test.class, args);
    }
}