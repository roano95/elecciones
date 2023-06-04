/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.dao.impl;

import com.mx.opin.sadimiapp.dao.EscuelaProcedenciaDAO;
import com.mx.opin.sadimiapp.model.Alumno;
import com.mx.opin.sadimiapp.model.EscuelaProcedencia;
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
public class EscuelaProcedenciaDAOImpl implements EscuelaProcedenciaDAO {
    private final Connection conn =   Conexion.conectar();
    private final String SQL_CREATE_ESC ="INSERT INTO escuela_procedencia" +
"(nombre,cct,calleNumero,colonia,localidad,municipio,entidad,id_turno,id_alumno) " +
"VALUES(?,?,?,?,?,?,?,?,?) ";
            
    @Override
    public Boolean save(EscuelaProcedencia escProc) {
        boolean rt=false;
         try (
            PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_ESC, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, escProc.getNombre());
            pstmt.setString(2, escProc.getCct());
            pstmt.setString(3, escProc.getCalleNumero());
            pstmt.setString(4, escProc.getColonia());
            pstmt.setString(5, escProc.getLocalidad());
            pstmt.setString(6, escProc.getMunicipio());
            pstmt.setString(7, escProc.getEntidad());
            pstmt.setString(8, escProc.getIdTurno());
            pstmt.setInt(9, escProc.getIdAlumno());
            
    
            pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    escProc.setIdEscuelaProcedencia(generatedKeys.getInt(1));
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
