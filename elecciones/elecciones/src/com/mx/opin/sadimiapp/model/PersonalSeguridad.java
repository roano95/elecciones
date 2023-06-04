/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.model;

import java.util.Date;

/**
 *
 * @author jgali
 */
public class PersonalSeguridad {

    private int idPersonalSeguridad;
    private String userName;
    private String contrasenna;
    private Date fechaCreacion;
    private byte activo;

    public int getIdPersonalSeguridad() {
        return idPersonalSeguridad;
    }

    public void setIdPersonalSeguridad(int idPersonalSeguridad) {
        this.idPersonalSeguridad = idPersonalSeguridad;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public byte getActivo() {
        return activo;
    }

    public void setActivo(byte activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "PersonalSeguridad{" + "idPersonalSeguridad=" + idPersonalSeguridad + ", userName=" + userName + ", contrasenna=" + contrasenna + ", fechaCreacion=" + fechaCreacion + ", activo=" + activo + '}';
    }

}
