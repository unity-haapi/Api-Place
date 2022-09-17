package school.hei.haapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.haapi.model.Place;
import school.hei.haapi.repository.PlaceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PlaceService {
  private final PlaceRepository repository;

  public List<Place> saveAll(List<Place> places) {
    return repository.saveAll(places);
  }

  public List<Place> findAll(){
    return repository.findAll();
  }
}
