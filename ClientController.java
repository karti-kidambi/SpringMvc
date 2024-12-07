package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    @GetMapping("/welcome")
    public String displayGreeting() {
        return "test";
    }

    @GetMapping("/test")
    public String renderTestPage() {
        return "test";
    }

    @GetMapping("/showInfo")
    public String showInfo(@RequestParam int id, @RequestParam String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @PostMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "calculate";
    }

    @GetMapping("/employeeForm")
    public String showEmployeeForm() {
        return "employeeForm";
    }

    @PostMapping("/addNumbers")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("result", num1 + num2);
        return "addNumbers";
    }

    @PostMapping("/combine")
    public String combineStrings(@RequestParam String str1, @RequestParam String str2, Model model) {
        model.addAttribute("result", str1 + " " + str2);
        return "combine";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        model.addAttribute("product", num1 * num2);
        return "calculate";
    }
}
