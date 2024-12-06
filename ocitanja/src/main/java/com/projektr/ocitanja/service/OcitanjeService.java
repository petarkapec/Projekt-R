package com.projektr.ocitanja.service;

import com.projektr.ocitanja.dao.OcitanjeRepository;
import com.projektr.ocitanja.domain.Ocitanje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OcitanjeService {
    private final OcitanjeRepository ocitanjeRepository;

    @Autowired
    public OcitanjeService(OcitanjeRepository ocitanjeRepository) {
        this.ocitanjeRepository = ocitanjeRepository;
    }

    @Transactional
    public List<Ocitanje> allOcitanja() {
        return ocitanjeRepository.findAll();
    }
}
