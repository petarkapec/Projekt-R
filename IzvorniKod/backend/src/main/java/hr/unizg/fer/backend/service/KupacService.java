package hr.unizg.fer.backend.service;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.Nalog;
import hr.unizg.fer.backend.repository.KupacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KupacService {
    @Autowired
    private final KupacRepository kupacRepository;

    public KupacService(KupacRepository kupacRepository){
        this.kupacRepository = kupacRepository;
    }

    public List<Kupac> allKupci() {
        return kupacRepository.findAll();
    }

    public void createKupac(Kupac kupac){
        kupacRepository.save(kupac);
    }

    public void deleteKupac(Integer id) {
        kupacRepository.deleteById(id);
    }
}
