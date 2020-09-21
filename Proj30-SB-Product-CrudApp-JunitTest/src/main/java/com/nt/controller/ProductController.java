package com.nt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Product;
import com.nt.service.ProductService;

@Controller
@RequestMapping("/prod")                                                                           //prod/save
public class ProductController {                                                                   //prod/show
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/show", method=RequestMethod.GET )
	public String showHome(@ModelAttribute("product") Product product) {
		System.out.println("hi");
		return "product_frm";
	}
	
	@RequestMapping(value = "/save", method=RequestMethod.POST )
	public String saveProduct(@ModelAttribute("product") Product prod,Model model) {
		Integer prodId = productService.saveProduct(prod);
		Optional<Product> product = productService.getProdById(prodId);
		model.addAttribute("product",product );
		return "saveInfo";
	}
	
	/*@RequestMapping(value = "/showProdInfo", method=RequestMethod.GET )
	public String showProdInfo(@ModelAttribute("prod")Product prod,@RequestParam("prodId") Integer prodId, Model model) {
		System.out.println("prodId==="+prodId);
		model.addAttribute("product", product);
		//return "product_frm";
		return "prodInfo";
	}*/
	
	@RequestMapping(value = "/showAll", method=RequestMethod.GET )
	public String showAllProducts(Model model) {
		List<Product> listProds = productService.findAll();
		model.addAttribute("product", listProds);
		return "prodInfo";
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET )
	public String deleteProduct(@RequestParam("prodId")Integer id,Model model) {
		Integer Id = productService.deleteById(id);
	    if(id!=null) {
	    	model.addAttribute("successMsg", Id+"deleted Successfully!");
	    	return "prodInfo";
	    }else {
	    		model.addAttribute("errorMsg", Id+"Not Found");
		   return "prodInfo";
	    }
		
	}
	
	@RequestMapping(value = "/edit", method=RequestMethod.GET )
	public String editProductById(@RequestParam("prodId")Integer id,Model model) {
	Optional<Product> product = productService.editProductById(id);
		model.addAttribute("product", product);
		return "editProduct";
	}
}
