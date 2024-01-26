package ru.clevertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.clevertec.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
