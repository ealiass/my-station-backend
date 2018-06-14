package finder.stationfinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import finder.stationfinder.entities.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer>{

}
