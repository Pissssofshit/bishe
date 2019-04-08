package com.bishe;

import com.bishe.tmp.Viewattr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class test {

    @RequestMapping("/")
    public String  home(Model model) {
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