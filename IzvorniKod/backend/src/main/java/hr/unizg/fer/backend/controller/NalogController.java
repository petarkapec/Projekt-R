package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.Nalog;
import hr.unizg.fer.backend.entity.Radnik;
import hr.unizg.fer.backend.service.NalogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nalozi")
public class NalogController {
    private final NalogService nalogService;

    public NalogController(NalogService nalogService){
        this.nalogService = nalogService;
    }

    @GetMapping("/all")
    public List<Nalog> getAllNalozi(){
        return nalogService.allNalozi();
    }

    @GetMapping("/radnik/{radnikId}")
    public List<Nalog> getAllNaloziByRadnikId(@PathVariable Radnik radnikId){
        return nalogService.getAllNaloziByRadnikId(radnikId);
    }

    @PostMapping("/create")
    public Nalog createNalog(@RequestBody Nalog nalog) {
        return nalogService.createNalog(nalog);
    }

    @PostMapping("/delete/{id}")
    public void deleteNalog(@PathVariable Integer id) {
        nalogService.deleteNalog(id);
    }
}
