package org.project.cartorent.entity.business;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment_t")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime paymentDate;
    private String cardNumber;
    private String cardHolder;
    private String cvv;
    private String expireDate;
    private Double paymentAmount;
    private Double depositAmount;
    private String paymentType;
    private String paymentStatus;
    private Long createdBy;

    @PrePersist
    public void prePersist() {
        this.paymentDate = LocalDateTime.now();
    }

}
