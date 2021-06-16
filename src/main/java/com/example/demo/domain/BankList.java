package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BankList {
    private List<Bank> banks ;

    public BankList() {
        banks = new ArrayList<>() ;
    }
}
