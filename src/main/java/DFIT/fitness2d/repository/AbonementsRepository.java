package DFIT.fitness2d.repository;

import DFIT.fitness2d.entity.Abonements;
import DFIT.fitness2d.entity.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AbonementsRepository extends PagingAndSortingRepository<Abonements, Integer> {
}
