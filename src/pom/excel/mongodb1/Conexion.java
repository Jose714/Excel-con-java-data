package pom.excel.mongodb1;


import java.util.logging.Level;
import java.util.logging.Logger;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;




public class Conexion {
	static DB baseDatos;
	static DBCollection coleccion;
	static BasicDBObject documento = new BasicDBObject();
	
public Conexion() {
	try {
		
		MongoClient mongo = new MongoClient("localhost",27017);
		baseDatos = mongo.getDB("BuscarEnGoogle");
		coleccion = baseDatos.getCollection("consultas");
		System.out.println("conectado a la base de datos satisfactoriamente");
	} catch (Exception e) {
		Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,e);
		
	}
}
	public  boolean insertar(String nombre) {
		documento.put("nombre", nombre);
		coleccion.insert(documento);
		return true;
		
	}
	
	public static void mostrar() {
	DBObject cursor = coleccion.findOne();
	//while(cursor.hasNext()) {
		System.out.println("los datos son "+cursor);
		System.out.println();
	
	}
	
}
