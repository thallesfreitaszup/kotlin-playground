package spring.zup.br.springcloudtest.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.zup.br.springcloudtest.configuration.Configuration;
import spring.zup.br.springcloudtest.model.LimitsConfiguration;

@RestController
@RequestMapping("/limits")
public class LimitsController {
    @Autowired
    Configuration configuration;
    @GetMapping
    public LimitsConfiguration getLimits(){
        return new LimitsConfiguration(configuration);
    }
}