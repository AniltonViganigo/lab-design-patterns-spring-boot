package one.digitalinnovation.labdesignpatterns.repository;

import one.digitalinnovation.labdesignpatterns.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
