package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.service.KupacService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void createKupac(@RequestBody Kupac kupac) {
        kupacService.createKupac(kupac);
    }

    @PostMapping("/delete/{id}")
    public void deleteKupac(@PathVariable Integer id) {
        kupacService.deleteKupac(id);
    }
}
