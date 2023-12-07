package com.example.ibtihelkadhraoui.Service;

import com.example.ibtihelkadhraoui.Entity.Abonnement;
import com.example.ibtihelkadhraoui.Entity.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

public interface IService {
    Abonnement addAbonnement(Abonnement a);
    Abonnement updateAbonnement(Abonnement a);

    List<Abonnement> getAll();

    Abonnement getID(long id);

    boolean deleteByID (long id);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

    List<Abonnement>getAbonnementByType(TypeAbonnement typeAbonnement);

}
