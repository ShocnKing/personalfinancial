package com.icbc.personalfinancial.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Loandetail {

    private Integer id;
    private Integer loanId;
    private Double tranMoney;
    private Double owe;
    private Date creatTime;
}
