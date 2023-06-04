/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.dao.impl;

import com.mx.opin.sadimiapp.dao.LoginDAO;
import com.mx.opin.sadimiapp.model.PersonalSeguridad;
import com.mx.opin.sadimiapp.util.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
 import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jgali
 */
public class LoginDAOImpl implements LoginDAO {
    private final Connection conn =   Conexion.conectar();
    private final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM personal_seguridad WHERE user_name=? and contrasenna=?";
        private final String SQL_CREATE_PRODUCT = "INSERT INTO personal_seguridad "
                + "(user_name, contrasenna, fecha_creacion, activo) VALUES (?, ?, ?, ?)";
    
    @Override
    public PersonalSeguridad login(String userName, String contrasenna) {
         PersonalSeguridad pers = new PersonalSeguridad();
        try (PreparedStatement pstmt = conn.prepareStatement(SQL_GET_PRODUCT_BY_ID)) {
            pstmt.setString(1, userName);
            pstmt.setString(2, contrasenna);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    pers.setIdPersonalSeguridad(rs.getInt(1));
                    pers.setUserName(rs.getString(2));
                    pers.setContrasenna(rs.getString(3));
                    pers.setFechaCreacion(rs.getDate(4));
                    pers.setActivo(rs.getByte(5));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pers;       
    }

    @Override
    public PersonalSeguridad save(PersonalSeguridad product) {
        Date utilStartDate = new Date();
        java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
        
        
         PersonalSeguridad personalSeg = new PersonalSeguridad();
         try (
            PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_PRODUCT, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, product.getUserName());
            pstmt.setString(2, product.getContrasenna());
            pstmt.setDate(3,  sqlStartDate);
            pstmt.setInt(4, product.getActivo());
            personalSeg.setActivo(product.getActivo());
            personalSeg.setContrasenna(product.getContrasenna());
            personalSeg.setFechaCreacion((Date) product.getFechaCreacion());
            personalSeg.setUserName(product.getUserName());
            pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    product.setIdPersonalSeguridad(generatedKeys.getInt(1));
                    personalSeg.setIdPersonalSeguridad(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
         }        
         return personalSeg;
    }
    
}
