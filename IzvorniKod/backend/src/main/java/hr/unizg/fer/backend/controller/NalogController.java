package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.Nalog;
import hr.unizg.fer.backend.entity.Radnik;
import hr.unizg.fer.backend.entity.StavkaNaloga;
import hr.unizg.fer.backend.service.NalogService;
import jakarta.persistence.EntityNotFoundException;
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
    public void createNalog(@RequestBody Nalog nalog) {
        nalogService.createNalog(nalog);
    }

    @PostMapping("/delete/{id}")
    public void deleteNalog(@PathVariable Integer id) {
        try {
            nalogService.deleteNalog(id);
        } catch (EntityNotFoundException ignored) {
        }
    }

    @PostMapping("/{nalogId}/addstavka")
    public void addStavkaToNalog(@PathVariable Integer nalogId, @RequestBody StavkaNaloga stavkaNaloga) {
        nalogService.addStavkaToNalog(nalogId, stavkaNaloga);
    }
}
