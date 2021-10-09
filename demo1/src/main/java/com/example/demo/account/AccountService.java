package com.example.demo.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AccountService {

    private final AccountRepository accountRepository;

    public Account newAccount(String phone, String name, String password){
        Account account = Account.builder()
                .phone(phone)
                .name(name)
                .password(password)
                .build();
        accountRepository.save(account);
        return account;
    }

    public Account search(String email,String password) {
        Account account = accountRepository.findByPhoneAndPassword(email,password).orElseThrow(()-> new RuntimeException("조회값 없음."));
        return account;
    }
}
