package com.example.ibtihelkadhraoui.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private Long numAbon ;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbon;
    private  TypeAbonnement typeAbon ;

}
