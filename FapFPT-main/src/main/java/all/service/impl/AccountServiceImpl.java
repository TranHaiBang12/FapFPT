/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service.impl;

import all.model.Account;
import all.repository.AccountRepository;
import all.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @author acer
 */
@Service
public class AccountServiceImpl implements AccountService {
    
    @Autowired
    AccountRepository userRepository;


    @Override
    public Optional<Account> findById(int accountID) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
}
