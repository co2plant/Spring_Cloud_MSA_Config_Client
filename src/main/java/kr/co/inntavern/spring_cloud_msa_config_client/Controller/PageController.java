package kr.co.inntavern.spring_cloud_msa_config_client.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @GetMapping("/msa/first")
    public String testPage(){
        return "MSA first";
    }
}
