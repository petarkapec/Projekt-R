package com.projektr.ocitanja.dao;

import com.projektr.ocitanja.domain.Kupac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KupacRepository extends JpaRepository<Kupac, String> {
}
