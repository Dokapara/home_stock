package com.example.demo;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.SampleDataRepository;
 
@Controller
public class AddressCountroller {
	@RequestMapping(value="/address/find", method=RequestMethod.GET)
public ModelAndView find(ModelAndView mv) {
	  mv.setViewName("/address/find");
	  mv.addObject("title", "検索");
	  mv.addObject("msg", "フルーツを検索します。");
	  mv.addObject("find","");
	  return mv;
	}
	 
	@RequestMapping(value="/address/find", method=RequestMethod.POST)
	public ModelAndView find(ModelAndView mv,
	    @RequestParam("find") String find) {
	  List list = repository.findByName(find); // ☆
	  mv.setViewName("/address/find");
	  mv.addObject("title", "検索");
	  mv.addObject("msg", "フルーツを検索します。");
	  mv.addObject("find",find);
	  mv.addObject("data", list);
	  return mv;
	}        

 
  @Autowired
  SampleDataRepository repository;
   
  @GetMapping("/address")
  public ModelAndView index(ModelAndView mv) {
	System.out.println("address/index");
    mv.setViewName("/address/index");
    mv.addObject("title", "登録情報");
    mv.addObject("msg", "現在、登録されているフルーツのリストです。");
    mv.addObject("data", repository.findAll());
    return mv;
  }
  
}        
