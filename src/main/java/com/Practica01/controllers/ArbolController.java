package com.Practica01.controllers;

import com.Practica01.entities.Arbol;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.Practica01.services.IArbolServices;

@Controller
public class ArbolController {
   private final IArbolServices arbolServices;

    public ArbolController(IArbolServices arbolServices) {
        this.arbolServices = arbolServices;
    }

    @GetMapping("/arbol")
    public String index(Model model) {
        model.addAttribute("arbol", new Arbol());
        model.addAttribute("arboles", this.arbolServices.getAllProducts());
        return "arbol";
    }

    @PostMapping("arbol/save")
    public String save(@ModelAttribute("arbol") Arbol arbol) {
        this.arbolServices.save(arbol);
        return "redirect:/arbol";
    }

    @PostMapping("arbol/delete")
    public ResponseEntity<String> delete(@RequestBody Arbol arbol) {
        this.arbolServices.delete(arbol);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
