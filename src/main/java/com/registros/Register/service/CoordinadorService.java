/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.registros.Register.service;

import com.registros.Register.model.CoordinadorModel;
import java.util.List;

/**
 *
 * @author Niko
 */
public interface CoordinadorService {
    public void createCoordinador(CoordinadorModel coordinador);
    
    public List getCoordinadores();
    public CoordinadorModel getCoordinador(String username);
    public void updateCoordinador(CoordinadorModel coordinadorModel, String username);
    public void deleteCoordinador(String username);

    
  
    
}
