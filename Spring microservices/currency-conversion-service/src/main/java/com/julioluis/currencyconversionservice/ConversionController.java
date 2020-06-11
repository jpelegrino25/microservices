package com.julioluis.currencyconversionservice;

import com.julioluis.currencyconversionservice.model.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ConversionController {

    @Autowired
    private CurrencyConversionProxy proxy;

    @GetMapping(path = "conversions/from/{from}/to/{to}/{quantity}")
    public CurrencyConversion getConverstion(@PathVariable(name = "from") String from,
                                             @PathVariable(name = "to") String to,
                                             @PathVariable(name = "quantity") BigDecimal quantity) {

        Map<String,String> uriVariables=new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);

        ResponseEntity<CurrencyConversion> responseEntity=new RestTemplate().getForEntity(
                "http://localhost:8000/exchanges/from/{from}/to/{to}",
                CurrencyConversion.class,
                uriVariables);

        CurrencyConversion response=responseEntity.getBody();

        return new CurrencyConversion(response.getId(),from,to,response.getConversionMultiply(),quantity,quantity.multiply(response.getConversionMultiply()),response.getPort());

    }

    @GetMapping(path = "conversions-foreign/from/{from}/to/{to}/{quantity}")
    public CurrencyConversion getConverstionForeign(@PathVariable(name = "from") String from,
                                             @PathVariable(name = "to") String to,
                                             @PathVariable(name = "quantity") BigDecimal quantity) {


        CurrencyConversion response=proxy.retrieveExchangeValue(from,to);

        return new CurrencyConversion(response.getId(),from,to,response.getConversionMultiply(),quantity,quantity.multiply(response.getConversionMultiply()),response.getPort());

    }
}
