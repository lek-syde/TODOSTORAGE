package com.example.demo.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Booking;
import com.example.demo.models.Quote;
import com.todo.restmodels.StorageSpace;



@Controller
public class pageController {
	

	@RequestMapping(method = RequestMethod.GET, value = "/book")
	public String index(Model model, @RequestParam(required = false, defaultValue = "0") Integer StoreId, HttpSession session, HttpServletRequest request) {
		
		
		Booking booking=(Booking) session.getAttribute("booking");
		
		if (booking == null) {
			booking = new Booking();
			
		}
		request.getSession().setAttribute("booking", booking);
		
		if(StoreId > 0) {
			
			booking.setStoreid(StoreId);
			
			return "stora";
			
			
		}
		
		return "storage";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/storage/select-size")
	public String selectsize(Model model, @RequestParam(required = false, defaultValue = "0") Integer unitsize, HttpServletRequest request) {
		
		
		Booking booking=(Booking)request.getSession().getAttribute("booking");
		
		if (booking==null) {
			
			return "redirect:/book";
			
		}
		
		booking.setSize(unitsize);
		 model.addAttribute("booking", booking);
		return "details";
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/storage/your-details")
	public String processform(Model model,HttpServletRequest request, @ModelAttribute("booking") Booking formdetails) {
		
		
		Booking booking=(Booking)request.getSession().getAttribute("booking");
		
		if (booking==null) {
			
			return "redirect:/book";
			
		}
		
	
		
		booking.setEmail(formdetails.getEmail());
		booking.setFirstname(formdetails.getFirstname());
		booking.setLastname(formdetails.getLastname());
		booking.setPhone(formdetails.getPhone());
		
		 model.addAttribute("booking", booking);
		 
		 
		return "quote";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "todoapi/storage/generatequote")
	public ResponseEntity<Quote> showQuote(Model model,HttpServletRequest request) {
		
		
		Booking booking=(Booking)request.getSession().getAttribute("booking");
		
		
		
	System.out.println("trying to generate quote");
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(generateQuote(booking));
	}
	
	
	public Quote generateQuote(Booking booking) {
		Quote qt= new Quote();
		qt.setMainSize(booking.getSize());
		qt.setMainFullPricePerMonth("₦206.00");
		qt.setMainFullPricePerWeek("₦47.54");
		qt.setMainDiscountedPricePerMonth("₦103.00");
		qt.setMainDiscountedPricePerWeek("₦23.77");
		qt.setMainDiscountPerMonthDescription("₦103.00");
		qt.setMainDiscountedPricePerWeek("₦103.00");
		qt.setUpgradePricePerWeek("₦103.00");
		qt.setUpgradeSize(0);
		
		
		return qt;
		
		
	}
	
	
	
	
	 
	}
	
	
	
	
	


	
	
	
	
	

