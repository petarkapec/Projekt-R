package hr.unizg.fer.backend.service;

import hr.unizg.fer.backend.entity.Ocitanje;
import hr.unizg.fer.backend.repository.KupacRepository;
import hr.unizg.fer.backend.repository.OcitanjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcitanjeService {
    @Autowired
    private final OcitanjeRepository ocitanjeRepository;

    public OcitanjeService(OcitanjeRepository ocitanjeRepository){
        this.ocitanjeRepository = ocitanjeRepository;
    }

    public List<Ocitanje> allOcitanja(){
        return ocitanjeRepository.findAll();
    }
}
