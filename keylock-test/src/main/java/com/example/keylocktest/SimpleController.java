package com.example.keylocktest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/public")
    public String getPublic() {
        return "public content";
    }

    @GetMapping("/secured")
    public String getSecured() {
        return "secured content";
    }

    @GetMapping("/admin-only")
    @PreAuthorize("hasRole('client_admin')")
    public String getAdminContent() {
        return "secured content only for admin";
    }
}
