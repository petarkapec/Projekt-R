package hr.unizg.fer.backend.service;

import hr.unizg.fer.backend.entity.Brojilo;
import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.repository.BrojiloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrojiloService {
    @Autowired
    private final BrojiloRepository brojiloRepository;

    public BrojiloService(BrojiloRepository brojiloRepository){
        this.brojiloRepository = brojiloRepository;
    }

    public List<Brojilo> allBrojila() {
        return brojiloRepository.findAll();
    }

    public void createBrojilo(Brojilo brojilo){
        brojiloRepository.save(brojilo);
    }

    public void deleteBrojilo(Integer id) {
        brojiloRepository.deleteById(id);
    }
}
