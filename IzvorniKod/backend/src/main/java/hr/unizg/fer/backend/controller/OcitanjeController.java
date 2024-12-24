package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.entity.Ocitanje;
import hr.unizg.fer.backend.service.OcitanjeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ocitanja")
public class OcitanjeController {
    private final OcitanjeService ocitanjeService;

    public OcitanjeController(OcitanjeService ocitanjeService){
        this.ocitanjeService = ocitanjeService;
    }

    @GetMapping("/all")
    public List<Ocitanje> getAllOcitanja(){
        return ocitanjeService.allOcitanja();
    }

    @PostMapping("/create")
    public void createOcitanje(@RequestBody Ocitanje ocitanje) {
        ocitanjeService.createOcitanje(ocitanje);
    }

    @PostMapping("/delete/{id}")
    public void deleteOcitanje(@PathVariable Integer id) {
        ocitanjeService.deleteOcitanje(id);
    }
}
