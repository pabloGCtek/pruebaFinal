package com.softtek.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		//inicializa la clase factura con iva general
		Factura factura = new Factura(new IvaGeneral());
		//inyectamos productos
		factura.listaProds.add(new Producto("pan",0.60));
		factura.listaProds.add(new Producto("leche",0.90));
		factura.listaProds.add(new Producto("carne",11.50));
		//mostramos resultado
		System.out.println("Total con IVA general: "+ factura.calcularTotalFactura());
		//cambiamos a iva reducido y mostramos nueva factura
		factura.impuesto = new IvaSuperReducido();
		System.out.println("Total con IVA reducido: "+ factura.calcularTotalFactura());
	}



}
