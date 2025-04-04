package kr.co.inntavern.spring_cloud_msa_config_client.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MainController {
    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
