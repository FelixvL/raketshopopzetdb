package ts.raket.shop.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import ts.raket.shop.model.Top;

@Component
public interface TopRepository extends CrudRepository<Top,Long>{

}

