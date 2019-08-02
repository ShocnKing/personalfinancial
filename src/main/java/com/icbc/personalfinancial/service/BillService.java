package com.icbc.personalfinancial.service;


import org.springframework.stereotype.Service;

@Service
public class BillService {





    /**
     * 统计每一天的贷款数并更新bill表
     */
    private void countBillLoanByDay(){
        //获取每天新增的贷款数，获取每个月还款后的剩余欠款数
        //从2019.07.01开始计算每天的贷款数，每逢月初，减去一次所有人的还款
    }
}
