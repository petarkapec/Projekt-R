package hr.unizg.fer.backend.service;

import hr.unizg.fer.backend.entity.Radnik;
import hr.unizg.fer.backend.repository.KupacRepository;
import hr.unizg.fer.backend.repository.RadnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadnikService {
    @Autowired
    private final RadnikRepository radnikRepository;

    public RadnikService(RadnikRepository radnikRepository){
        this.radnikRepository = radnikRepository;
    }

    public List<Radnik> allRadnici(){
        return radnikRepository.findAll();
    }
}
