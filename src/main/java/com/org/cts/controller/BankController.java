package com.org.cts.controller;

import com.org.cts.model.Bank;
import com.org.cts.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BankController {

    @Autowired
    BankService bankService;

    @PostMapping("/create")
    public void createBank(@RequestBody Bank bank){
        bankService.createBank(bank);
    }

    @PutMapping("/update")
    public void updateBank(@RequestBody Bank bank){
        bankService.updateBank(bank);
}

    @GetMapping("/all")
    public   List<Bank> getAll(){
        List<Bank> list=bankService.getAll();
        return list;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBYId(@PathVariable Integer id){
        bankService.deleteBYId(id);
        return "success";

    }
    @GetMapping("/getById/{id}")
    public Bank getById(@PathVariable Integer id){
        Optional<Bank> blr=  bankService.getById(id);
       return blr.get();
    }
}
