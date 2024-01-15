package ma.emsi.demo_deky.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController {
    @GetMapping("/msg")
    @PreAuthorize("hasAnyAuthority('USER')")
    public String getMessage(){
        return "bien venu dans le monde de la sécurité avancée !";
    }
    @GetMapping("/info")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public String getInfo(){
        return "Keycloak & spring boot";
    }
}