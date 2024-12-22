package hr.unizg.fer.backend.service;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.Nalog;
import hr.unizg.fer.backend.entity.Radnik;
import hr.unizg.fer.backend.repository.NalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NalogService {
    @Autowired
    private final NalogRepository nalogRepository;

    public NalogService(NalogRepository nalogRepository){
        this.nalogRepository = nalogRepository;
    }

    public List<Nalog> allNalozi(){
        return nalogRepository.findAll();
    }

    public List<Nalog> getAllNaloziByRadnikId(Radnik radnikId){
        return nalogRepository.findByIdRadnik(radnikId);
    }

    public Nalog createNalog(Nalog nalog){
        return nalogRepository.save(nalog);
    }

    public void deleteNalog(Integer id) {
        nalogRepository.deleteById(id);
    }
}
