package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.StavkaNaloga;
import hr.unizg.fer.backend.service.StavkaNalogaService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public StavkaNaloga createStavkaNaloga(@RequestBody StavkaNaloga stavkaNaloga) {
        return stavkaNalogaService.createStavkaNaloga(stavkaNaloga);
    }

    @PostMapping("/delete/{id}")
    public void deleteStavkaNaloga(@PathVariable Integer id) {
        stavkaNalogaService.deleteStavkaNaloga(id);
    }
}
