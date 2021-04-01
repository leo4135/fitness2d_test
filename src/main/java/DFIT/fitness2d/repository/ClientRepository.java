package DFIT.fitness2d.repository;

import DFIT.fitness2d.entity.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends PagingAndSortingRepository<Client, String> {
    @Query(value = "SELECT c FROM Client c WHERE c.age > 50")
    Iterable<Client> olderForm50();
}
