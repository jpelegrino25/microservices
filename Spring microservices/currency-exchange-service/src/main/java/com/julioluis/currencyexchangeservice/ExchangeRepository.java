package com.julioluis.currencyexchangeservice;

import com.julioluis.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeValue,Long> {
     ExchangeValue findByFromAndAndTo(String from,String to);
}
