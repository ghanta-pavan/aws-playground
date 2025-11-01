package com.ghanta.aws.playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playground/v1")
public class PlaygroundController {

    @Autowired
    private ReverseString reverseString;

    @GetMapping("/isavailable")
    public ResponseEntity<String> isAvailable() {
        return ResponseEntity.ok("Service is available");
    }

    @GetMapping("/reverse")
    public ResponseEntity<String> reverseString(@RequestParam("name") String name) {
        String reversed = reverseString.reverseString(name);
        return ResponseEntity.ok(reversed);
    }
}