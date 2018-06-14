package finder.stationfinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import finder.stationfinder.entities.Unit;


@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer>{

}
