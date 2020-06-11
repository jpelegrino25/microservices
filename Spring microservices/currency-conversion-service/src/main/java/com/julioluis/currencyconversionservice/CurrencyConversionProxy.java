package com.julioluis.currencyconversionservice;

import com.julioluis.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyConversionProxy {
    @GetMapping(path = "currency-exchange-service/exchanges/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(@PathVariable(value = "from") String from,
                                                    @PathVariable(value = "to") String to);

}
