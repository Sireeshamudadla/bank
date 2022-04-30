package com.org.cts.service;

import com.org.cts.model.Bank;
import com.org.cts.repository.BankRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BankServiceImplTest {
      @InjectMocks
      private BankServiceImpl bankServiceImpl;

      @Mock
      BankRepo bankRepo;

      @Test
    void createBank() {
          Bank bank=new Bank();
          bank.setAddress("blr");
          bank.setId(100);
          bank.setName("siri");
          bank.setAmount(2345.6);
          bankServiceImpl.createBank(bank);
    }

    @Test
    void updateBank() {
    }

    @Test
    void getAll() {
        List<Bank> list=new ArrayList<>();
        Bank bank1=new Bank();
        bank1.setAddress("blr");
        bank1.setId(100);
        bank1.setName("siri");
        bank1.setAmount(2345.6);
        list.add(bank1);

        Bank bank2=new Bank();
        bank2.setAddress("blr");
        bank2.setId(101);
        bank2.setName("siri");
        bank2.setAmount(2345.6);
        list.add(bank2);
        Mockito.when(bankRepo.findAll()).thenReturn(list);
       List<Bank> list2= bankServiceImpl.getAll();
      //  Assertions.assertEquals(list.size(),list2.size());

    }

    @Test
    void deleteBYId() {
    }

    @Test
    void getById() {
    }
}