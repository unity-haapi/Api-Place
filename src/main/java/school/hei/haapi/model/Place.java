package school.hei.haapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"place\"")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Place implements Serializable {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private String id;
  private String location;
  private String city;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Place place = (Place) o;
    return Objects.equals(id, place.id) && Objects.equals(location, place.location) && Objects.equals(city, place.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, city);
  }
}
