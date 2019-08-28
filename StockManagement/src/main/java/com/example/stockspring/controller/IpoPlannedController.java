package com.example.stockspring.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.IPOPlanedDao;
import com.example.stockspring.model.IpoPlaned;
import com.example.stockspring.service.IpoPlanedService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
	public class IpoPlannedController {
	     @Autowired
	    IpoPlanedService ipoPlanedService;
	     
	     @Autowired
	     IPOPlanedDao ipoPlaned;
	  
	       
	@GetMapping("/insertIpoPlaned/{id}/{companyCode}/{date}/{pricePerShare}/{remarks}/{stockExchange}/{totalShare}")
	       public IpoPlaned insertIpoPlaned(@PathVariable("id") int id,@PathVariable("companyCode") int companyCode,@PathVariable("stockExchange") int stockExchange,@PathVariable("pricePerShare") Double pricePerShare,@PathVariable("totalShare") int totalShare,@PathVariable("date") Date openDateTime,@PathVariable("remarks") String remarks) throws Exception
	       {
	             IpoPlaned ipo=new IpoPlaned(id,companyCode,stockExchange,pricePerShare,totalShare,openDateTime, remarks);
	             return  ipoPlaned.save(ipo);
	       }
	@GetMapping("/IpoPlanedList")
	public List<IpoPlaned> getIpoPlaned() throws Exception
	{
		return ipoPlaned.findAll();
	}

}
