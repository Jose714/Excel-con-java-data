package pom.excel.mongodb1;
import static pom.excel.mongodb1.EbayPom.*;

import java.io.IOException;



public class MongoAutomation{
   public static void main( String args[] ) throws IOException{
     
Conexion conectar = new Conexion();
conectar.insertar(obtenerDatosDeExcel());
Conexion.mostrar();
//conectar.buscarEnGoogle();
   }
}