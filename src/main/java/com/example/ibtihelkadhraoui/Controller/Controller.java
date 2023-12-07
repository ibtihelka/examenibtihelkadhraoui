package com.example.ibtihelkadhraoui.Controller;

import com.example.ibtihelkadhraoui.Entity.Abonnement;
import com.example.ibtihelkadhraoui.Entity.TypeAbonnement;
import com.example.ibtihelkadhraoui.Service.IService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("abonnement")
@RequiredArgsConstructor
public class Controller {
    private final IService iService;

    @GetMapping
    public List<Abonnement> getAll() {
        return iService.getAll();
    }


    @PostMapping
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement)
    {
        return iService.addAbonnement(abonnement);

    }

    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement)
    {
        return iService.updateAbonnement(abonnement);

    }

    @DeleteMapping(value = "{id}")
    public Boolean deleteById(@PathVariable Long id)
    {
        return iService.deleteByID(id);

    }
    @GetMapping("{startDate}/{endDate}")
    public List<Abonnement> retrieveSubscriptionsByDates(@PathVariable LocalDate startDate, @PathVariable LocalDate endDate){
        return iService.retrieveSubscriptionsByDates(startDate,endDate);
    }

    @GetMapping("{typeAbonnement}")
    public List<Abonnement> getAbonnementByType(@PathVariable TypeAbonnement typeAbonnement){
        return  iService.getAbonnementByType(typeAbonnement);
    }
}
