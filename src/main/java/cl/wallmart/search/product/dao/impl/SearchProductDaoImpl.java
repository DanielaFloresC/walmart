package cl.wallmart.search.product.dao.impl;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import cl.wallmart.search.product.dao.SearchProductDao;
import cl.wallmart.search.product.model.Product;

public class SearchProductDaoImpl implements SearchProductDao {

	@Override
	public Product searchbd(String busqueda) {
		Product product = null;
		DB db = null;
		String tabla = null;
	        //Recoge datos de la tabla
	        DBCollection table = db.getCollection(tabla);
	 
	        //Busca y muestra todos los datos de la tabla
	        DBCursor cur = table.find();
	        while (cur.hasNext()) {
	            System.out.println(" - " + cur.next().get("nombre") + " " + cur.curr().get("apellidos") + " -- " + cur.curr().get("anyos") + " años (" + cur.curr().get("fecha") + ")");
	        }
	    
		// TODO Auto-generated method stub
		return product;
	}

	
}
