package com.projektr.ocitanja.rest;

import com.projektr.ocitanja.domain.Kupac;
import com.projektr.ocitanja.service.KupacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kupci")
public class KupacController {
    private final KupacService kupacService;

    @Autowired
    public KupacController(KupacService kupacService) {
        this.kupacService = kupacService;
    }

    @GetMapping
    public List<Kupac> getAllKupci() {
        return kupacService.allKupci();
    }
}
