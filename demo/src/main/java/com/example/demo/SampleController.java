package com.example.demo;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.websocket.server.PathParam;

@Controller
public class SampleController {
 
  @GetMapping("/form")
  public ModelAndView form(ModelAndView mv) {
    mv.setViewName("form");
      mv.addObject("title", "�t�H�[�����M");
      mv.addObject("msg", "���O����́F");
    return mv;
  }
   
  @RequestMapping(value="/form", method=RequestMethod.POST)
  public ModelAndView formed(ModelAndView mv, 
      @PathParam("input1") String input1) {
    mv.setViewName("form");
       mv.addObject("title", "�t�H�[�����M��");
       mv.addObject("msg", "����ɂ��́A" + input1 + "����I");
    return mv;
  }
}
