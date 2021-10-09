package com.example.demo.account;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러는 요청을 받고 클라이언트에게 응답을 리턴함

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

//    Get = 받아 오는거
    @GetMapping("/account")
    public ResponseEntity getAccount(String phone, String password){
        Account account = accountService.search(phone,password);
        return new ResponseEntity(account,HttpStatus.OK);

    }
//  Post = 보내는거
    @PostMapping("/account")
    public ResponseEntity<Account> addAccount(String phone, String name, String password){
        Account account = accountService.newAccount(phone,name,password);
        return new ResponseEntity<>(account,HttpStatus.CREATED);
    }
}
