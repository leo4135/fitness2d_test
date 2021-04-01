package DFIT.fitness2d.repository;

import DFIT.fitness2d.entity.Client;
import DFIT.fitness2d.entity.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepository extends PagingAndSortingRepository<Role, Integer> {
}
