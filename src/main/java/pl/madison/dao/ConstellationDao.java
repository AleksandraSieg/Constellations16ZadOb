package pl.madison.dao;

import org.springframework.data.repository.CrudRepository;
import pl.madison.domain.Constellation;

public interface ConstellationDao extends CrudRepository<Constellation, Long>{
}
