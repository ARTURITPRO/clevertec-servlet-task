package ru.clevertec.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.clevertec.entity.DiscountCard;
import ru.clevertec.repository.DiscountCardRepository;

@RequiredArgsConstructor
@Service
public class DiscountCardService {
    private final DiscountCardRepository discountCardRepository;
    public DiscountCard getById(String id) {
        return discountCardRepository.getById(Long.valueOf(id));
    }
}
