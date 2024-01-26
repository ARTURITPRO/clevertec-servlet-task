package ru.clevertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.clevertec.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
