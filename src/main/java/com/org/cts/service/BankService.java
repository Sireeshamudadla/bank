package com.org.cts.service;

import com.org.cts.model.Bank;

import java.util.List;
import java.util.Optional;

public interface BankService {

    public void createBank(Bank bank);
    public void updateBank(Bank bank);
    public List<Bank> getAll();
    public String deleteBYId(Integer id);
    public Optional<Bank> getById(Integer id);

}
