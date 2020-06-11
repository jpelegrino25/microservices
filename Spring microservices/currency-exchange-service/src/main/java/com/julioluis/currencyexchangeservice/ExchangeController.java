package com.julioluis.currencyexchangeservice;

import com.julioluis.currencyexchangeservice.model.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class ExchangeController {

    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeRepository exchangeRepository;



    @GetMapping(path = "exchanges/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable(value = "from") String from,
                                               @PathVariable(value = "to") String to) {

        ExchangeValue exchangeValue = exchangeRepository.findByFromAndAndTo(from,to);

        exchangeValue.setPort(Integer.valueOf(environment.getProperty("server.port")));
        return exchangeValue;
    }
}
