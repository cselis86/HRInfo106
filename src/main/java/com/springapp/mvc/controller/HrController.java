package com.springapp.mvc.controller;

import com.springapp.mvc.dao.DepartmentDao;
import com.springapp.mvc.dao.EmployeeDao;
import com.springapp.mvc.dao.LocationDao;
import com.springapp.mvc.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HrController {

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	LocationDao locationDao;

	@Autowired
	DepartmentDao departmentDao;



	//Show all locations
	@RequestMapping(value = "/")
	public String ListLocations(ModelMap model){
		model.addAttribute("location", new Location());
		model.addAttribute("locList",locationDao.getAll());
		return "locations";
	}

	//show Departments by LocId
	@RequestMapping(value = "/getDeptByLocId/{locId}",method = RequestMethod.GET)
	public String getDeptByLocId(@PathVariable(value = "locId") Long locId, ModelMap model){
		model.addAttribute("deptListByLocId",departmentDao.getDeptByLocFk(locId) );
		return "departments";
	}

	//	Show all Employers
	@RequestMapping(value = "/listEmploee",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		model.addAttribute("empList", employeeDao.getAll());
		return "employee";
	}



	//	Add a location
	@RequestMapping(value = "/addLoc",method = RequestMethod.POST)
	public String addLocations(@ModelAttribute(value = "location") Location location){
		locationDao.save(location);
		return "redirect:/";
	}

	//	delete a location
	@RequestMapping(value = "/deleteLoc",method = RequestMethod.POST)
	public String addLocations(@PathVariable(value = "locId") Long locId){
		locationDao.delete(locId);

		return "redirect:/";
	}



}



