package com.julioluis.limitsservice;

import com.julioluis.limitsservice.beans.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {


    @Autowired
    private Configuration configuration;

    @GetMapping(path = "limits")
    public LimitConfiguration getConfiguration() {
        return new LimitConfiguration(configuration.getMaximun(),configuration.getMinimun());
    }

}
