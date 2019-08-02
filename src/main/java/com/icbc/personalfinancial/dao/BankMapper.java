package com.icbc.personalfinancial.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BankMapper {
    /**
     * 从bank表根据Addr查询BankId
     *
     * @param addr
     * @return
     */
    @Select("SELECT id FROM bank WHERE  bankAddr = #{addr}")
    int findBankIdByBankAddr(@Param("addr") String  addr);
}
