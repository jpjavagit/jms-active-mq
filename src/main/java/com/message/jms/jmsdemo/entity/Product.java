package com.message.jms.jmsdemo.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Product {

    private String name;

    private BigDecimal value;

}
