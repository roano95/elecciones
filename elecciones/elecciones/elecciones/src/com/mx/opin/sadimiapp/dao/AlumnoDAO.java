/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.dao;


import com.mx.opin.sadimiapp.model.Alumno;
import com.mx.opin.sadimiapp.model.AlumnoMaterias;
import com.mx.opin.sadimiapp.model.Calificaciones;
import com.mx.opin.sadimiapp.model.CalificacionesAlumno;
import java.util.List;

/**
 *
 * @author jgali
 */
public interface AlumnoDAO {
    
    List<Alumno> finAll();    
    
    Alumno save(Alumno aspirante);
    
    Alumno saveAspirante(Alumno alumno);
    
    Alumno getById(Integer idAlumno);
    
    void delete(int idAlumno);
    
    List<Alumno> listPreinscripcion();
    
    boolean editarAlumno(Alumno alumno);
    
    boolean editarAlumnoInscrip(Alumno alumno);
    
    List<Alumno> cedulaRegistroList();
    
    boolean cedulaRegistro(Alumno alumno);
    
    List<Alumno> buscarBaja(String nia);
    
    boolean bajaAlumno(Integer idAlumno);
    
    List<Alumno> getByGradGrup(String idGrupo,Integer idGrado);
    
    boolean cambiarAnnio(Integer idAlumno,String idGrupo,Integer idGrado);
    
    List<AlumnoMaterias> getmaterias(Integer nia);
    
    List<CalificacionesAlumno> getmaterias(Integer idAlumno,Integer idMateria);
    
    boolean guardaCalificacion(Calificaciones calificaciones);
    
}
