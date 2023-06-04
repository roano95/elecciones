/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.dao.impl;

import com.mx.opin.sadimiapp.dao.TutorDAO;
import com.mx.opin.sadimiapp.model.Tutor;
import com.mx.opin.sadimiapp.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author jgali
 */
public class TutorDAOImpl implements TutorDAO {
private final Connection conn =   Conexion.conectar();
    private final String SQL_CREATE_ESC ="INSERT INTO tutor(id_alumno,nombre,apellido_pat,apellido_mat,email,telefono,movil,entidad,parentesco,cp,colonia,municipio,localidad) " +
"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    
    
    @Override
    public Boolean guarda(Tutor tutor) {
         boolean rt=false;
         try (
            PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_ESC, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, tutor.getIdAlumno());
            pstmt.setString(2, tutor.getNombre());
            pstmt.setString(3, tutor.getApellidoPat());
            pstmt.setString(4, tutor.getApellidoMat());
            pstmt.setString(5, tutor.getEmail());
            pstmt.setString(6, tutor.getTelefono());
            pstmt.setString(7, tutor.getMovil());
            pstmt.setString(8, tutor.getEntidad());
            pstmt.setString(9, tutor.getParentesco());
            pstmt.setString(10, tutor.getCp());
            pstmt.setString(11, tutor.getColonia());
            pstmt.setString(12, tutor.getMunicipio());
            pstmt.setString(13, tutor.getLocalidad());

    
            pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    tutor.setIdTutor(generatedKeys.getInt(1));
                    rt =true;
//                    esc.setIdEscuelaProcedencia(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            rt =false;
         }        
         return rt;
    }



}
