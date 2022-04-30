package com.org.cts.service;

import com.org.cts.model.Bank;
import com.org.cts.repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BankServiceImpl implements BankService{

    @Autowired
    BankRepo bankRepo;
    @Override
    public void createBank(Bank bank) {
        bankRepo.save(bank);
    }

    @Override
    public void updateBank(Bank bank) {
        bankRepo.save(bank);
    }

    @Override
    public List<Bank> getAll() {
        List<Bank> lis  = bankRepo.findAll();
        return lis;
    }

    @Override
    public String deleteBYId(Integer id) {
          bankRepo.deleteById(id);
        return "success";
    }

    @Override
    public Optional<Bank> getById(Integer id) {
        Optional<Bank>  bb= bankRepo.findById(id);
        return bb;
    }
}
