package com.icbc.personalfinancial.service;


import com.icbc.personalfinancial.dao.CardMapper;
import com.icbc.personalfinancial.entity.Card;
import com.icbc.personalfinancial.entity.User;
import com.icbc.personalfinancial.model.CardData;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CardService {

    @Resource
    private CardMapper cardMapper;

    public List<String> findAccountNameByCardId(String cardId){ return this.cardMapper.findAccountNameByCardID(cardId); }

    public void insertUser(User user){ this.cardMapper.insertUser(user); }

    public void updateUser(User user){
        this.cardMapper.updateUser(user);
    }

    public void deleteUser(String userId){
        this.cardMapper.deleteUser(userId);
    }

    public String findUserIdByAccounID(Integer id){
        return this.cardMapper.findUserIdbByAccountId(id);
    }

    @Cacheable(value = "cache1" , key = "#userId")
    public String findAddrByUserId(String userId){ return this.cardMapper.findAddrByUserId(userId); }

    public int findBankIdByBankAddr(String addr){
        return this.cardMapper.findBankIdByBankAddr(addr);
    }

    public void insertcard(Card card){
        this.cardMapper.insertCard(card);
    }

    public List<String> findAccountNameByAccountID(Integer id){
        return this.cardMapper.fiandaccoountNameByAccountId(id);
    }

    public Integer findCountByBankAndTime(String  date1, String date2, String  bankName){
        return  this.cardMapper.findCountByBankAndTime(date1,date2,bankName);
    }

    @Cacheable(value = "Cache1" , keyGenerator =  "keyGenerator")
    public List<CardData> getCountByBankName(String bankName){
        return this.cardMapper.getCountByBankName(bankName);
    }
}
