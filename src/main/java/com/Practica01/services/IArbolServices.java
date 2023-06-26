package com.Practica01.services;

import com.Practica01.entities.Arbol;
import java.util.List;

public interface IArbolServices {

    List<Arbol> getAllProducts();

    void save(Arbol arbol);

    void delete(Arbol arbol);
}
