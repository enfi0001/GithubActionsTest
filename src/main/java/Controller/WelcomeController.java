package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping
    public ResponseEntity<String> getString(){
        return ResponseEntity.ok("Welcome");
    }

}
