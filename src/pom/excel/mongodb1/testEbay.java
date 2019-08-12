package pom.excel.mongodb1;

import static pom.excel.mongodb1.EbayPom.*;

import java.io.IOException;

import org.junit.Test;

public class testEbay {




	@Test
	public void test() throws IOException, InterruptedException {
		Conexion conect = new Conexion();
			abrirPaginaInicialDeEbay();
			escribirEnElCampoDeBusqueda(obtenerDatosDeExcel());
			 darClickEnElBotonBuscar();
			 seleccionarBusqueda();
			 agregarAlCarritoDeCompras();
			 conect.insertar(obtenerDatosDeExcel());
			 validacionDelCarrito();
			 cerrarNavegador();
		 
		
	}
}


