package com.icbc.personalfinancial.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.Date;
import java.util.HashMap;

@Mapper
public interface BillMapper {


    @Select("SELECT DATE_FORMAT(`day`,'%Y-%m-%d') as tim ,money " +
            " FROM bill " +
            " WHERE   " +
            "  bankId = (SELECT id FROM bank WHERE  bankName = {#bankName}) " +
            "  AND business = {#cardMoney}  " +
            "  AND `day` BETWEEN '2018-01-01 00:00:00' and '2019-01-01 00:00:00'  " +
            " GROUP BY `day`")
    HashMap<Date,Integer> findNumByBussinesAndAddr();
}
