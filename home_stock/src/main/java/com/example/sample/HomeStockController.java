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
		mv.addObject("title", "�T���v��");
		mv.addObject("msg", "����̓T���v���̃��b�Z�[�W�ł��B");
		return mv;
	}
	
	@GetMapping("/home_stock/index")
	public ModelAndView home_stock(ModelAndView mv) {
		System.out.println("home_stock/index");
		List<HomeStock> home_stock = this.repository.findAll();
	    mv.setViewName("home_stock/index");
		mv.setViewName("home_stock/index");
		mv.addObject("title", "�Ƃ̃X�g�b�N");
		mv.addObject("msg", "�H�i�E���p�i���Ǘ����܂�");
		mv.addObject("data", home_stock);
		return mv;
	}
	
	@GetMapping("/home_stock/add")
	public ModelAndView add(ModelAndView mv) {
		System.out.println("home_stock/add");
		mv.setViewName("home_stock/add");
		mv.addObject("title", "�V�K�o�^");
		mv.addObject("msg", "�V���ɏ���o�^���܂�");
		return mv;
	}
	
	@GetMapping("/home_stock/update")
	public ModelAndView update(ModelAndView mv, @RequestParam("id") Integer id) {
		System.out.println("home_stock/update");
		mv.setViewName("home_stock/update");
		mv.addObject("title", "�X�V");
		mv.addObject("msg", "ID=" + id + "�̓o�^�����X�V���܂�");
		Optional<HomeStock> form = this.repository.findById(id);
		mv.addObject("form", form.orElse(new HomeStock()));
		return mv;
	}

	@GetMapping("/home_stock/delete")
	public ModelAndView delete(ModelAndView mv, @RequestParam("id") Integer id) {
		System.out.println("home_stock/delete");
		mv.setViewName("home_stock/delete");
		mv.addObject("title", "�폜");
		mv.addObject("msg", "ID=" + id + "�̓o�^�����폜���܂�");
		Optional<HomeStock> form = this.repository.findById(id);
		mv.addObject("form", form.orElse(new HomeStock()));
		return mv;
	}

	@PostMapping("/home_stock/add")
	public String add(@RequestParam("name") String name, @RequestParam("stock") int stock, @RequestParam("tel") String tel) {
	    HomeStock newStock = new HomeStock();
	    newStock.setName(name);
	    newStock.setStock(stock);
	    //newStock.setTel(tel); // HomeStock�N���X��setTel()���\�b�h���K�v
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
