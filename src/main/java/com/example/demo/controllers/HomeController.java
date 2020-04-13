package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Booking;
import com.todo.repository.StorageSpaceRepo;
import com.todo.restmodels.Information;
import com.todo.restmodels.Location;
import com.todo.restmodels.StorageSpace;

@RestController
public class HomeController {
	
	@Autowired
	StorageSpaceRepo storagerepo;

	@RequestMapping(method = RequestMethod.POST, value = "/test")
	public ResponseEntity<StorageSpace> index(Model model) {
		Location loc= new Location(9.0379,7.4534);
		Information info= new Information();
		info.setAddress("MKO Abiola Stadium");
		info.setEmail("lekanfolayan@todostorage.com");
		info.setImage("imahe/linh");
		info.setLocality("anuja");
		info.setPostCode("8065");
		info.setTelephone("07036273607");
		info.setTitle("TODO Storage");
		info.setLink("Storage");
		StorageSpace sp= new StorageSpace(loc, info);
		
		
		
		storagerepo.save(sp);
		
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(sp);
		
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/findall")
	public List<StorageSpace> findalls(Model model) {
		
		
		
		return storagerepo.findAll();
		
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/findby")
	public List<StorageSpace> findallsxs(@RequestParam(required = true) double lat, @RequestParam(required = true) double lon, Model model) {
		
		System.out.println("lat: "+ lat);
		System.out.println("long"+ lon);
		
		return storagerepo.findUserByStatusAndName(lat, lon);
		
		
	}
	
	
	

	
	

	
}