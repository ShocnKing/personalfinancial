package com.icbc.personalfinancial.entity;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

import java.io.PrintStream;
import java.util.Date;

@Data
public class metal {
    private Integer id;
    private Enum metalType;
    private Integer money;
    private Integer serviceCharge;
    private Date createTime;
    private Integer bankid;

}
