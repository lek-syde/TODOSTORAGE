package com.example.demo.controllers;


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
import com.todo.repository.StorageSpaceRepo;
import com.todo.restmodels.StorageSpace;



@Controller
public class pageController {
	
	@Autowired
	StorageSpaceRepo storagerepo;

	@RequestMapping(method = RequestMethod.GET, value = "/book")
	public String index(Model model, @RequestParam(required = false, defaultValue = "0") Integer StoreId, HttpSession session, HttpServletRequest request) {
		
		
		Booking booking=(Booking) session.getAttribute("booking");
		
		if (booking == null) {
			booking = new Booking();
			
		}
		
		
		if(StoreId > 0) {
			StorageSpace storageinfo= storagerepo.findByInformationid(StoreId);
			
			System.out.println(storageinfo.getInformation().getTitle());
			booking.setStoreid(StoreId);
			booking.setStoragename(storageinfo.getInformation().getTitle());
			
			return "stora";
			
			
		}
		
		request.getSession().setAttribute("booking", booking);
		return "storage";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/storage/select-size")
	public String selectsize(Model model, @RequestParam(required = false, defaultValue = "0") Integer unitsize, HttpServletRequest request) {
		
		
		Booking booking=(Booking)request.getSession().getAttribute("booking");
		
		if (booking==null) {
			
			return "redirect:/book";
			
		}
		
		booking.setSize(unitsize);
		request.getSession().setAttribute("booking", booking);
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
		
		request.getSession().setAttribute("booking", booking);
		System.out.println("size- "+ booking.getSize());
		 model.addAttribute("booking", booking);
		 
		 
		return "quote";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "todoapi/storage/generatequote")
	public ResponseEntity<Quote> showQuote(Model model,HttpServletRequest request) {
		
		
		Booking booking=(Booking)request.getSession().getAttribute("booking");
		
		
		
	System.out.println("trying to generate quote");
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(generateQuote(booking));
	}
	
	@Value("${PRICE_PER_SQ_FEET}")
	private int pricepersqfeet;
	
	public Quote generateQuote(Booking booking) {
		Quote qt= new Quote();
		
		
		NumberFormat numberFormat = new DecimalFormat( "#,###.00" );
		
		
		
		double pricepermonth= booking.getSize() * pricepersqfeet * 30;
		double priceperweek= booking.getSize() * pricepersqfeet * 7;
		
		
		String pricepermonthtxt = numberFormat.format(pricepermonth);
		String priceperweektxt = numberFormat.format(priceperweek);
		
		qt.setMainSize(booking.getSize());
		qt.setMainFullPricePerMonth(pricepermonthtxt);
		qt.setMainFullPricePerWeek("₦47.54");
		qt.setMainDiscountedPricePerMonth("₦"+pricepermonthtxt);
		qt.setMainDiscountedPricePerWeek("₦23.77");
		qt.setMainDiscountPerMonthDescription("₦103.00");
		
		qt.setMainDiscountedPricePerWeek("₦"+priceperweektxt);  // price per week
		qt.setUpgradePricePerWeek("₦103.00");
		qt.setUpgradeSize(0);
		
		
		return qt;
		
		
	}
	
	
	
	
	 
	}
	
	
	
	
	


	
	
	
	
	

