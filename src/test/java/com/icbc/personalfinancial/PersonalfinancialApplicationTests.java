package com.icbc.personalfinancial;

import com.icbc.personalfinancial.common.createtestdata.Insert;
import com.icbc.personalfinancial.common.createtestdata.RandomValue;
import com.icbc.personalfinancial.entity.User;
import com.icbc.personalfinancial.service.CardService;
import com.icbc.personalfinancial.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonalfinancialApplicationTests {


    @Autowired
    private StringRedisTemplate template;

    @Autowired
    CardService cardService;

    @Autowired
    RedisService redisService;

    @Test
    public void setTest()  {
        System.out.println(cardService.findAddrByUserId("211221193204229111"));
    }

    @Test
    public void insert()  {
        Insert insert = new Insert();
        insert.insertloan();
    }

    @Test
    public void getCountByBankName(){
        System.out.println(cardService.getCountByBankName("广州分行"));
    }


    @Test
    public void updateUser(){
        User user = new User();
        Integer id ;
        for (int i = 1; i <5 ; i++) {
            id = i;

            user.setId(id);
            user.setUserName(RandomValue.getChineseName());
            user.setUserId(RandomValue.getIdNo(true));
            user.setAddr(RandomValue.getaddr());
            user.setMobile(RandomValue.getTel());
//            user.setId(5);
//            user.setUserName("七七");
//            user.setUserId("56161548615486138");
//            user.setAddr("梅州");
//            user.setMobile("1513645822");
            System.out.println(user);
            this.cardService.updateUser(user);
        }

    }


}
