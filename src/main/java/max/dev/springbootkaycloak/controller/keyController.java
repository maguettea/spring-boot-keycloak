package max.dev.springbootkaycloak.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class keyController {

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminDetails(){
        return ResponseEntity.ok("Hello Master2Gl");
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUserDetails(){
        return ResponseEntity.ok("Hello Mr Seck");
    }
}
