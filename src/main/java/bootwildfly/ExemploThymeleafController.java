package bootwildfly;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploThymeleafController {

    //@GetMapping("/greeting")
    String index(Model model) {
        model.addAttribute("name", "vc");
        return "greeting";
}
	
}
