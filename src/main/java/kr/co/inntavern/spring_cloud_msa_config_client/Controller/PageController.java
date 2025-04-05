package kr.co.inntavern.spring_cloud_msa_config_client.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msa")
public class PageController {
    @GetMapping("/first")
    public String testPage(){
        return "Hello World! Spring Cloud MSA Config Client!";
    }
}
