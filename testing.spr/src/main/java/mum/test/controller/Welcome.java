package mum.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mum.test.service.ProductService;

@RequestMapping(value="/")
@Controller
public class Welcome {
	@Autowired
	ProductService productService;
	//method level mapping must exist for this to work even if we have class level mapping
	@RequestMapping
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public String getProducts(Model model) {
		model.addAttribute("products", productService.products());
		return "products";
	}
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String getProduct(@RequestParam("id")Long id, Model model) {
		model.addAttribute("product", productService.product(id));
		return "detail";
	}
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public String getProductPath(@PathVariable("id")Long id, Model model) {
		model.addAttribute("product", productService.product(id));
		return "detail";
	}
	
}
