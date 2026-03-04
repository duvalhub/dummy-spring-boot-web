package com.duvalhub.rnd.dummyspringbootweb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Dummy {
  @Id
  @GeneratedValue
  Long id;

  String name;
}
