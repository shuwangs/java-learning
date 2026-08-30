package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// define controller
@Controller
@RequestMapping("/user")
public class UserController {

    public UserController() {
        System.out.println("========== UserController created ==========");
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("name")String name) {
        System.out.println("springmvc save name: " + name);
        return "{'module': 'springmvc save'}";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("name")String name) {
        System.out.println("springmvc delete name: " + name);
        return "{'module': 'springmvc delete'}";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestParam("name") String name) {
        System.out.println("springmvc update name: " + name);
        return "{'module': 'springmvc update'}";
    }
    @RequestMapping("/select")
    @ResponseBody
    public String select(@RequestParam("name") String name) {
        System.out.println("springmvc select name: " + name);
        return "{'module': 'springmvc select'}";
    }
}
