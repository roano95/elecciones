/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.dao.impl;

import com.mx.opin.sadimiapp.dao.AlumnoDAO;
import com.mx.opin.sadimiapp.dao.LoginDAO;
import com.mx.opin.sadimiapp.model.Alumno;
import com.mx.opin.sadimiapp.model.AlumnoMaterias;
import com.mx.opin.sadimiapp.model.Calificaciones;
import com.mx.opin.sadimiapp.model.CalificacionesAlumno;
import com.mx.opin.sadimiapp.model.PersonalSeguridad;
import com.mx.opin.sadimiapp.util.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.Date;
 import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jgali
 */
public class AlumnoDAOImpl implements AlumnoDAO {
    private final Connection conn =   Conexion.conectar();
    private final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM personal_seguridad WHERE user_name=? and contrasenna=?";
        private final String SQL_CREATE_ALUMNO = "INSERT INTO alumno" +
"(nombre,apellido_pat,apellido_mat,nia,direccion,fec_nac,curp,num_desarrollo_soc,ins_fec,id_turno,id_sexo,id_grupo," +
"nacionalidad,id_dialecto,discapacidad,comunidad_indigena,num_interior,num_exterior,calle,tipo_sangre,codigo_postal,municipio, " +
"localidad,colonia,id_grado,edadPreinscripcion,estatus,nombreSolicitante,cicloEscolar,entidadNacimiento,motivoBaja,educacionEspecial, " +
"enferCronicaDegenera,folio)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
   
    

    @Override
    public List<Alumno> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno save(Alumno aspirante) {
              
         Alumno alumno = new Alumno();
         try (
            PreparedStatement pstmt = conn.prepareStatement(SQL_CREATE_ALUMNO, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, aspirante.getNombre());
            pstmt.setString(2, aspirante.getApellidoPat());
            pstmt.setString(3, aspirante.getApellidoMat());
            pstmt.setString(4, aspirante.getNia());
            pstmt.setString(5, aspirante.getDireccion());
//           Date fecha= convert(aspirante.getFecNac());
            pstmt.setDate(6, null);
            pstmt.setString(7, aspirante.getCurp());
            pstmt.setString(8, aspirante.getNumDesarrolloSoc());
//             Date fecha2= convert(aspirante.getInsFec());

            pstmt.setDate(9,null);
            pstmt.setString(10, aspirante.getIdTurno());
            pstmt.setString(11, aspirante.getIdSexo());
            pstmt.setString(12, aspirante.getIdGrupo());
            pstmt.setString(13, aspirante.getNacionalidad());
            pstmt.setInt(14, aspirante.getIdDialecto());
            pstmt.setString(15, aspirante.getDiscapacidad());
            pstmt.setString(16, aspirante.getComunidadIndigena());
            pstmt.setString(17, aspirante.getNumInterior());
            pstmt.setString(18, aspirante.getNumExterior());
            pstmt.setString(19, aspirante.getCalle());
            pstmt.setString(20, aspirante.getTipoSangre());
            pstmt.setString(21, aspirante.getCodigoPostal());
            pstmt.setString(22, aspirante.getMunicipio());
            pstmt.setString(23, aspirante.getLocalidad());
            pstmt.setString(24, aspirante.getColonia());
            pstmt.setInt(25, aspirante.getIdGrado());
            pstmt.setString(26, aspirante.getEdadPreinscripcion());
            pstmt.setString(27, aspirante.getEstatus());
            pstmt.setString(28, aspirante.getNombreSolicitante());
            pstmt.setString(29, aspirante.getCicloEscolar());
            pstmt.setString(30, aspirante.getEntidadNacimiento());
            pstmt.setString(31, aspirante.getMotivoBaja());
            pstmt.setString(32, aspirante.getEducacionEspecial());
            pstmt.setString(33, aspirante.getEnferCronicaDegenera());
            pstmt.setString(34, aspirante.getFolio());
            pstmt.execute();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    aspirante.setIdAlumno(generatedKeys.getInt(1));
                    alumno.setIdAlumno(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
         }        
         return alumno;
    }

     private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
     
    @Override
    public Alumno saveAspirante(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno getById(Integer idAlumno) {
        String sql="SELECT * FROM alumno where id_alumno=?"; 
        Alumno pers = new Alumno();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idAlumno);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    pers.setIdAlumno(rs.getInt(1));
                    pers.setNombre(rs.getString(2));
                    pers.setApellidoPat(rs.getString(3));
                    pers.setApellidoMat(rs.getString(5));
                    pers.setNia(rs.getString(5));
                    pers.setCurp(rs.getString(8));
                    pers.setIdSexo(rs.getString(12));
                    pers.setCicloEscolar(rs.getString(30));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pers;     
    }

    @Override
    public void delete(int idAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> listPreinscripcion() {
        
        String sql = "SELECT * FROM sadimi.alumno where estatus='PREINSCRIPCION'";
       ArrayList<Alumno> alumnos = new ArrayList();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){  
//            pstmt.setString(1, nia);
            try (ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                Alumno product = new Alumno();
                product.setIdAlumno(rs.getInt(1));
//                product.setNia(rs.getString(2));
                product.setNombre(rs.getString(3));
                product.setApellidoPat(rs.getString(4));
                product.setApellidoMat(rs.getString(5));
                alumnos.add(product);
            } 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alumnos;
        
    }

    @Override
    public boolean editarAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarAlumnoInscrip(Alumno alumno) {
         String sql ="update Alumno set nia=?, cicloEscolar=?,edadPreinscripcion=?,id_grado=? " +
            " ,id_grupo=?,estatus=? where id_alumno=?";
         try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,  alumno.getNia());
            pstmt.setString(2,  alumno.getCicloEscolar());
            pstmt.setString(3,  alumno.getEdadPreinscripcion());
            pstmt.setInt(4,   alumno.getIdGrado());
            pstmt.setString(5,  alumno.getIdGrupo());
            pstmt.setString(6, alumno.getEstatus());
            pstmt.setInt(7,  alumno.getIdAlumno());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }   
    }

    @Override
    public List<Alumno> cedulaRegistroList() {               
        String sql = "SELECT * FROM sadimi.alumno where estatus='INSCRIPCION' ";
       ArrayList<Alumno> alumnos = new ArrayList();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){  
//            pstmt.setString(1, nia);
            try (ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                Alumno product = new Alumno();
                product.setIdAlumno(rs.getInt(1));
                product.setNia(rs.getString(2));
                product.setNombre(rs.getString(3));
                product.setApellidoPat(rs.getString(4));
                product.setApellidoMat(rs.getString(5));
                alumnos.add(product);
            } 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alumnos;
        
    }

    @Override
    public boolean cedulaRegistro(Alumno alumno) {
        
        String sql ="update Alumno set entidadNacimiento=?, tipo_sangre=?,"
                + " comunidad_indigena=?,estatus=? where id_alumno=?";
         try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,  alumno.getEntidadNacimiento());
            pstmt.setString(2,  alumno.getTipoSangre());
            pstmt.setString(3, alumno.getComunidadIndigena());
            pstmt.setString(4,  alumno.getEstatus());
            pstmt.setInt(5,  alumno.getIdAlumno());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }   
        
    }

    @Override
    public List<Alumno> buscarBaja(String nia) {
        String sql = "SELECT * FROM sadimi.alumno where nia=?";
       ArrayList<Alumno> alumnos = new ArrayList();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){  
            pstmt.setString(1, nia);
            try (ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                Alumno product = new Alumno();
                product.setIdAlumno(rs.getInt(1));
                product.setNia(rs.getString(2));
                product.setNombre(rs.getString(3));
                product.setApellidoPat(rs.getString(4));
                product.setApellidoMat(rs.getString(5));
                alumnos.add(product);
            } 
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alumnos;
        
    }

    @Override
    public boolean bajaAlumno(Integer idAlumno) {
        System.out.println("llega "+idAlumno);
        String sql ="update sadimi.alumno set estatus='BAJA' where id_alumno=?";
         try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idAlumno);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Alumno> getByGradGrup(String idGrupo, Integer idGrado) {
        String sql="select * from alumno where id_grupo=? and id_grado=? and estatus='INSCRIPCIONFINAL'";

         List<Alumno> pers =  new ArrayList();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, idGrupo);
            pstmt.setInt(2, idGrado);
            try (ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                Alumno product = new Alumno();
                product.setIdAlumno(rs.getInt(1));
                product.setNia(rs.getString(2));
                product.setNombre(rs.getString(3));
                product.setApellidoPat(rs.getString(4));
                product.setApellidoMat(rs.getString(5));
                pers.add(product);
            } 
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pers;
    }

    @Override
    public boolean cambiarAnnio(Integer idAlumno, String idGrupo, Integer idGrado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AlumnoMaterias> getmaterias(Integer nia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CalificacionesAlumno> getmaterias(Integer idAlumno, Integer idMateria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardaCalificacion(Calificaciones calificaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
