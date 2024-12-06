package com.projektr.ocitanja.rest;

import com.projektr.ocitanja.domain.Ocitanje;
import com.projektr.ocitanja.service.OcitanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ocitanja")
public class OcitanjeController {
    private final OcitanjeService ocitanjeService;

    @Autowired
    public OcitanjeController(OcitanjeService ocitanjeService) {
        this.ocitanjeService = ocitanjeService;
    }

    @GetMapping
    public List<Ocitanje> getAllOcitanje() {
        return ocitanjeService.allOcitanja();
    }
}
