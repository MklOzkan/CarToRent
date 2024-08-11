package org.project.cartorent.entity.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.project.cartorent.entity.business.Rental;
import org.project.cartorent.entity.enums.Gender;

import java.util.List;

@Entity
@Table(name = "users_t")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private Boolean active;
    private Boolean builtIn;
    private String createDate;
    private String updateDate;
    private String deleteDate;
    private Long createdBy;
    private Long updatedBy;
    private Long deletedBy;
    private String imageUrl;
    private String bankName;
    private String bankAccount;
    private String iban;
    private String swift;
    private String identityNumber;
    private String birthDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String drivingLicense;

    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rental> rentals;



}
