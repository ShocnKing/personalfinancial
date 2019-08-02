package com.icbc.personalfinancial.entity;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Bill {
    private Integer id;
    private Integer bankId;
    private Date day;
    private Enum bussiness;
    private BigDecimal money;


}
