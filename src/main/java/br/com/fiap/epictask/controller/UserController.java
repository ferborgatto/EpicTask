package br.com.fiap.epictask.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.epictask.model.User;
import br.com.fiap.epictask.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	
	@GetMapping("/user")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("users");
		List<User> tasks = repository.findAll();
		modelAndView.addObject("users", tasks );
		return modelAndView;
	}
	
	@RequestMapping("/user/new")
	public String create(User task) {
		return "user-form";
	}
	
	@PostMapping("/user")
	public String save(@Valid User task, BindingResult result) {
		if(result.hasErrors()) return "user-form";
		repository.save(task);
		return "users";
	}

}
