package hr.unizg.fer.backend.service;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.StavkaNaloga;
import hr.unizg.fer.backend.repository.StavkaNalogaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StavkaNalogaService {
    @Autowired
    private final StavkaNalogaRepository stavkaNalogaRepository;

    public StavkaNalogaService(StavkaNalogaRepository stavkaNalogaRepository){
        this.stavkaNalogaRepository = stavkaNalogaRepository;
    }

    public List<StavkaNaloga> allStavkeNaloga(){
        return stavkaNalogaRepository.findAll();
    }

    public StavkaNaloga createStavkaNaloga(StavkaNaloga stavkaNaloga){
        return stavkaNalogaRepository.save(stavkaNaloga);
    }

    public void deleteStavkaNaloga(Integer id) {
        stavkaNalogaRepository.deleteById(id);
    }
}
