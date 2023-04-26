package one.digitalinnovation.labdesignpatterns.repository;

import one.digitalinnovation.labdesignpatterns.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
