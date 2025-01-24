package authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    @GetMapping("api/v1/authentication")
    public String getAuthentication() {
        return "Hello world";
    }
}
