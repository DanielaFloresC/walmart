package cl.wallmart.search.product.dao;

import cl.wallmart.search.product.model.Product;

public interface SearchProductDao {

	Product searchbd(String busqueda);
}
