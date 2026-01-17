package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "services")
@Entity
public class Service extends BaseEnitiy {
  private String name;
}
