package school.hei.haapi.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.haapi.endpoint.rest.mapper.PlaceMapper;
import school.hei.haapi.endpoint.rest.model.Place;
import school.hei.haapi.service.PlaceService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class PlaceController {
  private final PlaceService placeService;
  private final PlaceMapper placeMapper;

  @GetMapping("/place")
  public List<Place> getPlace(){
    return placeService.findAll()
            .stream()
            .map(placeMapper::toRest)
            .collect(Collectors.toList());
  }

  @PostMapping("/place")
  public List<Place> createPlace(
      @PathVariable String studentId, @RequestBody List<Place> toCreate) {
    return placeService.saveAll(
            toCreate.stream()
                    .map(placeMapper::toDomain)
                    .collect(Collectors.toList())
    ).stream()
            .map(placeMapper::toRest)
            .collect(Collectors.toList());
  }
}
