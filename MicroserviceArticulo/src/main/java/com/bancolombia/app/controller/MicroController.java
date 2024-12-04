package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Articulo;
import com.bancolombia.app.services.Iservice;

@RestController
@RequestMapping("/articulo") //http://ip:port/Articulo
public class MicroController {
	
	

	
	@Autowired
	private Iservice servicio;
	
	
	@PostMapping //POST ->http//ip:port/Articulo
	public ResponseEntity<String> insert(@RequestBody Articulo articulo){
		
		if(servicio.insert(articulo))
			return new ResponseEntity<String>("OK",HttpStatus.CREATED);
		
		return new ResponseEntity<String>("NOT OK", HttpStatus.BAD_REQUEST);

}

	@GetMapping // Get -> http://ip:port/Articulo
	public ResponseEntity<List<Articulo>> get(){
		return new ResponseEntity<List<Articulo>>(servicio.getAll(), HttpStatus.OK);
	}
}
	
	
	
	
	
	
	
