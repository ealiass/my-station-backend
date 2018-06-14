package finder.stationfinder.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import finder.stationfinder.entities.Station;
import finder.stationfinder.entities.Unit;
import finder.stationfinder.service.StationFinderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class StationFinderController {

  @Autowired
  private StationFinderService service;

  @ApiOperation("Get list of Stations")
  @RequestMapping(value = "/search", method = RequestMethod.GET)
  private ResponseEntity<List<Station>> getListOfStations(
        @ApiParam(name = "latitude", required = false) @RequestParam(value = "latitude", defaultValue = "1") final double latitude,
        @ApiParam(name = "longitude", required = false) @RequestParam(value = "longitude", defaultValue = "1") final double longitude) {
    return new ResponseEntity<List<Station>>(service.getExcpectedStations(latitude, longitude), HttpStatus.OK);
  }

  @ApiOperation("Update a specific Unit")
  @RequestMapping(value = "/unit/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(value = HttpStatus.OK)
  private void updateUnits(@ApiParam(value = "unit to be updated", required = true) @Valid @RequestBody final Unit unit) {
    service.updateUnits(unit);
  }
}
