package org.crce.interns.controller;

import org.crce.interns.beans.AllotmentBean;
import org.crce.interns.service.ManageAllotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageAllotment {

	@Autowired
	private ManageAllotmentService manageAllotmentService;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
				return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/saveAllotment", method = RequestMethod.POST)
	public ModelAndView addAllotment(@ModelAttribute("allotmentBean")AllotmentBean allotmentBean,BindingResult result) {
		manageAllotmentService.addAllotment(allotmentBean);
		
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/addAllotment", method = RequestMethod.GET)
	public ModelAndView createAllotment(Model model) {
		AllotmentBean allotmentBean = new AllotmentBean(); // declaring

         model.addAttribute("allotmentBean", allotmentBean); // adding in model

		return new ModelAndView("addAllotment");
	}


}
