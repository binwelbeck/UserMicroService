package com.example.demo.client;

import com.example.demo.domain.Bank;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

//@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
@Component
@RestController
public class  BankClient {

    public final String BANK_PATH_V1 = "http://localhost:8081/api/banks";
    public final String CUSTOMER_PATH_V1 = "/api/v1/customer/";
    private String apihost;

    private final RestTemplate restTemplate;

    public BankClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    @GetMapping("/{bankId}")
    public  String getBankById(@PathVariable("bankId") Long bankId){
        Bank bank = restTemplate.getForObject (BANK_PATH_V1 +"/" + bankId.toString(),Bank.class ) ;
        System.out.println("--------------------"+" "+bank.getBankName());
        System.out.println("--------------------"+" "+bank.getBankBIC());
        System.out.println(bank);
        return bank.getBankName() ;
    }

    @GetMapping("/banks")
    public List<Bank> getBankList() {
        List<Bank> response = restTemplate.getForObject(BANK_PATH_V1, List.class);
//        List<Bank> banks = response.
        return response ;

    }
    @PutMapping("/{bankId}")
    public Bank updateBank(@PathVariable Long bankId, @RequestBody Bank bank){
        Bank updatedBank = restTemplate.patchForObject( BANK_PATH_V1  + "/"+bankId, bank,Bank.class);
        return updatedBank ;
    }

    @DeleteMapping("/{bankId}")
    public void  deleteBank(Long bankId){
        restTemplate.delete(BANK_PATH_V1 + "/"+bankId.toString() );
    }

    public URI  saveNewBank(Bank bank) {
        return restTemplate.postForLocation(BANK_PATH_V1,bank) ;
    }

    public void setApihost(String apihost) {
        this.apihost = apihost;
    }


}
