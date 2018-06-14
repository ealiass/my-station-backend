package finder.stationfinder.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "unit")
public class Unit implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "id")
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer unitId;

  @Column(name="unit_name")
  private String unitName;

  @Column(name = "is_available")
  private boolean isAvailable;

  @ManyToOne
  @JoinColumn(name = "station_id", nullable = false, updatable = false)
  @JsonBackReference
  private Station station;

  public Integer getUnitId() {
    return unitId;
  }

  public void setUnitId(Integer unitId) {
    this.unitId = unitId;
  }

  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public Station getStation() {
    return station;
  }

  public void setStation(Station station) {
    this.station = station;
  }
}
