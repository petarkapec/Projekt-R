package com.projektr.ocitanja.service;

import com.projektr.ocitanja.dao.KupacRepository;
import com.projektr.ocitanja.domain.Kupac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KupacService {
    private final KupacRepository kupacRepository;

    @Autowired
    public KupacService(KupacRepository kupacRepository) {
        this.kupacRepository = kupacRepository;
    }

    public List<Kupac> allKupci() {
        return kupacRepository.findAll();
    }
}
