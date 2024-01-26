package ru.clevertec.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "discount_card", schema = "servlet")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DiscountCard   {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "number")
    @JsonProperty("number")
    private Integer number;

    @Column(name = "amount")
    @JsonProperty("amount")
    private Short amount;
}
