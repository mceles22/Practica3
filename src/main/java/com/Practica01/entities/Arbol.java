package com.Practica01.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "arbol")
public class Arbol {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String ruta_imagen;
    private String nombre_comun;
    private Integer edad_arbol;
    private Integer altura_arbol;
    private String tipo_arbol;
    private String lugar_origen;
    private boolean activo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public Integer getEdad_arbol() {
        return edad_arbol;
    }

    public void setEdad_arbol(Integer edad_arbol) {
        this.edad_arbol = edad_arbol;
    }

    public Integer getAltura_arbol() {
        return altura_arbol;
    }

    public void setAltura_arbol(Integer altura_arbol) {
        this.altura_arbol = altura_arbol;
    }

    public String getTipo_arbol() {
        return tipo_arbol;
    }

    public void setTipo_arbol(String tipo_arbol) {
        this.tipo_arbol = tipo_arbol;
    }

    public String getLugar_origen() {
        return lugar_origen;
    }

    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
