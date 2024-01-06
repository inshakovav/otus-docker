package com.example.testapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    StatusDTO getStatus() {
        StatusDTO statusDTO = StatusDTO.builder()
                .status("OK")
                .build();

        return statusDTO;
    }
}
