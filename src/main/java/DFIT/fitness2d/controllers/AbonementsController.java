package DFIT.fitness2d.controllers;

import DFIT.fitness2d.entity.Abonements;
import DFIT.fitness2d.repository.AbonementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/abonements")
public class AbonementsController {
 @Autowired
    private AbonementsRepository abonementsRepository;
 /*@GetMapping
 public Iterable<Abonements> abonementsList(){
     return abonements.findAll();
 } */
 @PostMapping
    public Abonements addAbonements(@RequestParam(value = "workouts") Integer workouts,
                                    @RequestParam(value = "nameAb") String nameAb,
                                    @RequestParam(value = "date")Date date
                                    ){
     Abonements abonements = new Abonements();
     abonements.setNameAb(nameAb);
     abonements.setWorkouts(workouts);
     abonements.setDate(date);
     return abonements;

 }

 public Iterable<Abonements> getAll(){
     return abonementsRepository.findAll();
 }


}
