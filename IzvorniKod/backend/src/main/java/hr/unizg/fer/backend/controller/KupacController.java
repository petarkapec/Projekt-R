package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.service.KupacService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kupci")
public class KupacController {
    private final KupacService kupacService;

    public KupacController(KupacService kupacService){
        this.kupacService = kupacService;
    }

    @GetMapping("/all")
    public List<Kupac> getAllKupci(){
        return kupacService.allKupci();
    }

    @PostMapping("/create")
    public Kupac createKupac(@RequestBody Kupac kupac) {
        return kupacService.createKupac(kupac);
    }

    @PutMapping("/update/{id}")
    public Kupac updateKupac(@PathVariable Integer id, @RequestBody Kupac kupac) {
        return kupacService.updateKupac(id, kupac);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteKupac(@PathVariable Integer id) {
        kupacService.deleteKupac(id);
    }
}
