package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.StavkaNaloga;
import hr.unizg.fer.backend.service.StavkaNalogaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stavkenaloga")
public class StavkaNalogaController {
    private final StavkaNalogaService stavkaNalogaService;

    public StavkaNalogaController(StavkaNalogaService stavkaNalogaService){
        this.stavkaNalogaService = stavkaNalogaService;
    }

    @GetMapping("/all")
    public List<StavkaNaloga> getAllStavkeNaloga(){
        return stavkaNalogaService.allStavkeNaloga();
    }
}
