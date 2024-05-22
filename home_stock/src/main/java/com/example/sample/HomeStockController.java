package com.example.sample;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.sample.data.HomeStock;
import com.example.sample.repositories.HomeStockRepository;
@Controller
public class HomeStockController {
	@Autowired
	private HomeStockRepository repository;
	
	@GetMapping("/")
	public ModelAndView index(ModelAndView mv) {
		System.out.println("test");
		mv.setViewName("index");
		mv.addObject("title", "サンプル");
		mv.addObject("msg", "これはサンプルのメッセージです。");
		return mv;
	}
	
	@GetMapping("/home_stock/index")
	public ModelAndView home_stock(ModelAndView mv) {
		System.out.println("home_stock/index");
		List<HomeStock> home_stock = this.repository.findAll();
	    mv.setViewName("home_stock/index");
		mv.setViewName("home_stock/index");
		mv.addObject("title", "家のストック");
		mv.addObject("msg", "食品・日用品を管理します");
		mv.addObject("data", home_stock);
		return mv;
	}
	
	@GetMapping("/home_stock/add")
	public ModelAndView add(ModelAndView mv) {
		System.out.println("home_stock/add");
		mv.setViewName("home_stock/add");
		mv.addObject("title", "新規登録");
		mv.addObject("msg", "新たに情報を登録します");
		return mv;
	}
	
	@GetMapping("/home_stock/update")
	public ModelAndView update(ModelAndView mv, @RequestParam("id") Integer id) {
		System.out.println("home_stock/update");
		mv.setViewName("home_stock/update");
		mv.addObject("title", "更新");
		mv.addObject("msg", "ID=" + id + "の登録情報を更新します");
		Optional<HomeStock> form = this.repository.findById(id);
		mv.addObject("form", form.orElse(new HomeStock()));
		return mv;
	}

	@GetMapping("/home_stock/delete")
	public ModelAndView delete(ModelAndView mv, @RequestParam("id") Integer id) {
		System.out.println("home_stock/delete");
		mv.setViewName("home_stock/delete");
		mv.addObject("title", "削除");
		mv.addObject("msg", "ID=" + id + "の登録情報を削除します");
		Optional<HomeStock> form = this.repository.findById(id);
		mv.addObject("form", form.orElse(new HomeStock()));
		return mv;
	}

	@PostMapping("/home_stock/add")
	public String add(@RequestParam("name") String name, @RequestParam("stock") int stock, @RequestParam("tel") String tel) {
	    HomeStock newStock = new HomeStock();
	    newStock.setName(name);
	    newStock.setStock(stock);
	    //newStock.setTel(tel); // HomeStockクラスにsetTel()メソッドが必要
	    repository.save(newStock);
	    return "redirect:/home_stock";
	}


	@PostMapping("/home_stock/update")
	@Transactional(readOnly=false)
	public String update(HomeStock fruit) {
		System.out.println("fruits/update(post)");
		repository.saveAndFlush(fruit);
		return "redirect:/home_stock";
	}

	@PostMapping("/home_stock/delete")
	@Transactional(readOnly=false)
	public String delete(HomeStock fruit) {
		System.out.println("home_stock/delete(post)");
		repository.delete(fruit);
		return "redirect:/home_stock";
	}

}
