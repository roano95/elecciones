/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.dao;

import com.mx.opin.sadimiapp.model.PersonalSeguridad;

/**
 *
 * @author jgali
 */
public interface LoginDAO {
    
    PersonalSeguridad login (String userName,String contrasenna);
    
    PersonalSeguridad save (PersonalSeguridad personalSeguridad);
}
