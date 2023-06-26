package com.Practica01.services.imlp;

import com.Practica01.db.IArbolRepository;
import com.Practica01.entities.Arbol;
import com.Practica01.services.IArbolServices;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArbolServices implements IArbolServices {

    private final IArbolRepository arbolRepository;

    public ArbolServices(IArbolRepository arbolRepository) {
        this.arbolRepository = arbolRepository;
    }

    public List<Arbol> getAllProducts() {
        return (List<Arbol>) this.arbolRepository.findAll();
    }

    public void save(Arbol arbol) {
        arbol.setActivo(true);
        this.arbolRepository.save(arbol);
    }

    public void delete(Arbol arbol) {
        this.arbolRepository.delete(arbol);
    }
}
