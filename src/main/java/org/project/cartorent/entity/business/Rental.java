package org.project.cartorent.entity.business;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.project.cartorent.entity.user.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "rental_t")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;
    private LocalDateTime createDate;
    private String updateDate;
    private String deleteDate;
    private Long createdBy;
    private Long updatedBy;
    private Long deletedBy;
    private Boolean active;
    private Boolean builtIn;
    private Boolean deleted;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;




    @PrePersist
    public void prePersist() {
        this.createDate = java.time.LocalDateTime.now();
    }


}
