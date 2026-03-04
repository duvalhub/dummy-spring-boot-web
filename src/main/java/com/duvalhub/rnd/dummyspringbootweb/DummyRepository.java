package com.duvalhub.rnd.dummyspringbootweb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
