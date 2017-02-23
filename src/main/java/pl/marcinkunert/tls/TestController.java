package pl.marcinkunert.tls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello!";
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("data", new FormData());
        return "form";
    }

    @PostMapping("/")
    @ResponseBody
    public String showForm(FormData formData) {
        return "You wrote: " + formData.getText();
    }


}
