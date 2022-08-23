/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.registros.Register.controller;

import com.registros.Register.model.LiderModel;
import com.registros.Register.service.LiderService;
import com.registros.Register.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Niko
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/lider")
public class LiderController {
    @Autowired 
    private LiderService liderService;
    
    @PostMapping("/")
    public CustomResponse registrarLider(@RequestBody LiderModel lider) {
        CustomResponse customeResponse = new CustomResponse();
        liderService.createLider(lider);        
        return customeResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getLideres(){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(liderService.getLideres());
        return customeResponse;
    }
    
    @GetMapping("/{username}")
    public CustomResponse getLider(@RequestBody LiderModel lider, @PathVariable String username){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(liderService.getLider(username));
        return customeResponse;
    }
    
    
    
    @PutMapping("/{username}")
    public CustomResponse updateLider(@RequestBody LiderModel lider, @PathVariable String username){
        CustomResponse customResponse = new CustomResponse();
        liderService.updateLider(lider, username);        
        return customResponse;       
    
    }
    
    @DeleteMapping("/{username}")
    public CustomResponse deleteLider(@PathVariable String username){
        CustomResponse customeResponse = new CustomResponse();
        liderService.deleteLider(username);        
        return customeResponse;       
    
    }
    
    @GetMapping("/lideres/{coordinador}")
    public CustomResponse getPromovidosLider(@PathVariable String coordinador){
       CustomResponse customResponse = new CustomResponse(); 
       customResponse.setData(liderService.getLideresCoordinador(coordinador));
       return customResponse;
    }

}