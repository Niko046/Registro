/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.registros.Register.repository;

import com.registros.Register.model.PromovidoModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Niko
 */
@Repository
public interface PromovidoRepository extends JpaRepository<PromovidoModel,String> {
    public PromovidoModel findByCurp(String curp); 
   public List findByidentificador(String identificador); 
   public void deleteById(String curp); 
}
