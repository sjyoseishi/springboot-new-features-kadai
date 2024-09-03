package com.example.samuraitravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.repository.HouseRepository;
 
//クラスに@Controllerアノテーションをつける
 @Controller
public class HomeController {
	 
     private final HouseRepository houseRepository;        
     
     public HomeController(HouseRepository houseRepository) {
         this.houseRepository = houseRepository;            
     }  
     
	 //メソッドに@GetMappingアノテーションをつける
     @GetMapping("/")
     public String index(Model model) {
         List<House> newHouses = houseRepository.findTop10ByOrderByCreatedAtDesc();
         model.addAttribute("newHouses", newHouses);    
    	 //呼び出すビューの名前をreturnで返す
         return "index";
     }   
}