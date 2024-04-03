package backend.CarShop.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<CarEntity, Long>{

    List<CarEntity> findByModelContainingIgnoreCase(String model);

}


