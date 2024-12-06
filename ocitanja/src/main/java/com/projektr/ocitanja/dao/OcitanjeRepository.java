package com.projektr.ocitanja.dao;

import com.projektr.ocitanja.domain.Ocitanje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcitanjeRepository extends JpaRepository<Ocitanje, Integer> {
}
