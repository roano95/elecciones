/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.model;

/**
 *
 * @author jgali
 */
public class AlumnoMaterias {
    private Integer idAlumno;
    private Integer idMateria;
    private Integer idGrado;
    private String nombreMateria;
    private Integer idMateriaSemestre;

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Integer idGrado) {
        this.idGrado = idGrado;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Integer getIdMateriaSemestre() {
        return idMateriaSemestre;
    }

    public void setIdMateriaSemestre(Integer idMateriaSemestre) {
        this.idMateriaSemestre = idMateriaSemestre;
    }
    
    

    @Override
    public String toString() {
        return "AlumnoMaterias{" + "idAlumno=" + idAlumno + ", idMateria=" + idMateria + ", idGrado=" + idGrado + ", nombreMateria=" + nombreMateria + '}';
    }
        
}
