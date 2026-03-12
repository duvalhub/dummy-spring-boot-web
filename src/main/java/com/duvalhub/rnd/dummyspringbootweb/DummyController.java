package com.duvalhub.rnd.dummyspringbootweb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DummyController {
  private final DummyRepository dummyRepository;

  @GetMapping
  public List<Dummy> hello() {

    return dummyRepository.findAll();
  }

  @PostMapping
  public Dummy createDummy(@RequestBody Dummy dummy) {
    return dummyRepository.save(dummy);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    dummyRepository.deleteById(id);
  }
}
