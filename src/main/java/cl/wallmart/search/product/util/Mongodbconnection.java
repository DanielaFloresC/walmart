package cl.wallmart.search.product.util;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;


public class Mongodbconnection {

	/**
     * Clase para crear una conexión a MongoDB.
     * @return MongoClient conexión
     */
    private static MongoClient crearConexion() throws UnknownHostException {
        MongoClient mongo = null;
        mongo = new MongoClient("localhost", 27017);
 
        return mongo;
    }
}
