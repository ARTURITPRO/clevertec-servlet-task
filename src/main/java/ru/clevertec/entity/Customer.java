package ru.clevertec.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "customer", schema = "servlet")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "name")
    @JsonProperty("name")
    private String name;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @OneToOne
    @JoinColumn(name = "discount_card_id")
    @JsonProperty("discountCard")
    private DiscountCard discountCard;
}
