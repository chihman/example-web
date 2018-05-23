package packet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";

    }
    @GetMapping("/task1")
    public String task1 (@RequestParam (name= "word")String word, Model model){
        model.addAttribute( "wordsing", word);
        return "task1template";
    }
}
