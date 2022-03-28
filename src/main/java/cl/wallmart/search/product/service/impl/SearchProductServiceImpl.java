package cl.wallmart.search.product.service.impl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.wallmart.search.product.model.Product;
import cl.wallmart.search.product.service.SearchProductService;

@RestController
public class SearchProductServiceImpl implements SearchProductService {
	
	@PostMapping("/searchProduct")
	public @ResponseBody Product search(@RequestBody String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}
}
