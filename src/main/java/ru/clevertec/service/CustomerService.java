package ru.clevertec.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.clevertec.entity.Customer;
import ru.clevertec.repository.CustomerRepository;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer getById(String id) {
    return customerRepository.getById(Long.valueOf(id));
    }
}
