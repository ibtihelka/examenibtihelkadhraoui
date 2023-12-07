package com.example.ibtihelkadhraoui.Service;

import com.example.ibtihelkadhraoui.Entity.Abonnement;
import com.example.ibtihelkadhraoui.Entity.TypeAbonnement;
import com.example.ibtihelkadhraoui.Repository.AbonnementRepo;
import com.example.ibtihelkadhraoui.Service.IService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class IServiceImp implements IService {
    private final AbonnementRepo abonnementRepo;


    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return abonnementRepo.save(a);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        return abonnementRepo.save(a);
    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement >)abonnementRepo.findAll();
    }

    @Override
    public Abonnement getID(long id)  {
        return abonnementRepo.findById(id).orElse(null);
    }

    @Override
    public boolean deleteByID(long id) {
        abonnementRepo.deleteById(id);
        return !(abonnementRepo.existsById(id));
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public List<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement) {
        return null;
    }

}
