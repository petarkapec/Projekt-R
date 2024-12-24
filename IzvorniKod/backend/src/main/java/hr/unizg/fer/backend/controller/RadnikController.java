package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Radnik;
import hr.unizg.fer.backend.service.RadnikService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/radnici")
public class RadnikController {
    private final RadnikService radnikService;

    public RadnikController(RadnikService radnikService){
        this.radnikService = radnikService;
    }

    @GetMapping("/all")
    public List<Radnik> getAllRadnici(){
        return radnikService.allRadnici();
    }

    @PostMapping("/create")
    public void createRadnik(@RequestBody Radnik radnik){
        radnikService.createRadnik(radnik);
    }

    @PostMapping("/delete/{id}")
    public void deleteRadnik(@PathVariable Integer id) {
        radnikService.deleteRadnik(id);
    }
}
