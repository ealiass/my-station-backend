package finder.stationfinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import finder.stationfinder.entities.Station;
import finder.stationfinder.entities.Unit;
import finder.stationfinder.repositories.StationRepository;
import finder.stationfinder.repositories.UnitRepository;

@Service
public class StationFinderService {

  public static final double DEFAULT_LATITUDE=1000;

  public static final double DEFAULT_LONGTITUDE=1000;

  @Autowired
  private StationRepository statioRepo;

  @Autowired
  private UnitRepository unitRepo;

  /**
   * 
   * @param latitude
   * @param longitude
   * @return
   */
  public List<Station> getExcpectedStations(double latitude, double longitude) {
    List<Station> lists = statioRepo.findAll();
    return lists;
  }

  @Transactional
  public void updateUnits(Unit unit) {
    unitRepo.save(unit);
  }

}
