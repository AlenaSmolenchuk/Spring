package web.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
@RequestMapping("/third")
public class ThirdController {

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b",required = false) int b,
                            @RequestParam(value = "action",required = false) String action,
                            Model model) {

        if (Objects.equals(action, "multiplication")){

            model.addAttribute("action", a * b);

        } else if (Objects.equals(action, "addition")) {

            model.addAttribute("action", a + b);

        } else if (Objects.equals(action, "subtraction")) {

            model.addAttribute("action", a - b);
        } else if (Objects.equals(action, "division")) {
            model.addAttribute("action", a / (double) b);
        } else {
            model.addAttribute("action", "Something is wrong");
        }

        return "third/calculator";
    }
}
