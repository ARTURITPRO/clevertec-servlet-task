package ru.clevertec.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.clevertec.entity.DiscountCard;
import ru.clevertec.service.DiscountCardService;

@RestController
@RequestMapping(value = "/discountCard")
@RequiredArgsConstructor
public class DiscountCardController {

    private final DiscountCardService discountCardService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiscountCard> subscribeOnApplicationEvents(@PathVariable("id") String id) {
        return ResponseEntity.ok(discountCardService.getById(id));
    }
}
