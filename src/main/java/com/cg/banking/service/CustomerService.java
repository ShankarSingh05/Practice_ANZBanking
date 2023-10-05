package com.cg.banking.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.banking.entity.CustomerEntity;
import com.cg.banking.model.dto.Customer;
import com.cg.banking.model.mapper.CustomerMapper;
import com.cg.banking.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private CustomerMapper customerMapper = new CustomerMapper();

    private final UserRepository userRepository = null;

    public Customer readUser(String identification) {
        CustomerEntity userEntity = userRepository.findByIdentificationNumber(identification).get();
        return customerMapper.convertToDto(userEntity);
    }
    @GetMapping
    public ResponseEntity readUser(Pageable pageable) {
        return ResponseEntity.ok(userService.readUsers(pageable));
    }
 }
