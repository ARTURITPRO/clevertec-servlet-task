package ru.clevertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.clevertec.entity.DiscountCard;

public interface DiscountCardRepository extends JpaRepository<DiscountCard, Long> {
}
