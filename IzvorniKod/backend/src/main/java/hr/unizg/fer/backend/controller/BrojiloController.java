package hr.unizg.fer.backend.controller;

import hr.unizg.fer.backend.entity.Brojilo;
import hr.unizg.fer.backend.entity.Kupac;
import hr.unizg.fer.backend.service.BrojiloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brojila")
public class BrojiloController {
    private final BrojiloService brojiloService;

    public BrojiloController(BrojiloService brojiloService){
        this.brojiloService = brojiloService;
    }

    @GetMapping("/all")
    public List<Brojilo> getAllBrojila(){
        return brojiloService.allBrojila();
    }

    @PostMapping("/create")
    public void createBrojilo(@RequestBody Brojilo brojilo) {
        brojiloService.createBrojilo(brojilo);
    }

    @PostMapping("/delete/{id}")
    public void deleteBrojilo(@PathVariable Integer id) {
        brojiloService.deleteBrojilo(id);
    }
}
