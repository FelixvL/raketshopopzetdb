package ts.raket.shop.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import ts.raket.shop.model.Raket;

@Component
public interface RaketRepository extends CrudRepository<Raket,Long>{

}
