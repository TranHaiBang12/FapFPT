/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service;

import all.model.Account;

import java.util.Optional;

/**
 *
 * @author acer
 */
public interface AccountService {

    public Optional<Account> findById(int accountID);
    public Optional<Account> findByUsername(String username);
}
