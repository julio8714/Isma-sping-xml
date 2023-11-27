package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ditribuida.entities.Cliente;
import com.ditribuida.entities.Factura;
import com.ditribuida.entities.FacturaDetalle;
import com.ditribuida.entities.Producto;

public class Principal {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Cliente cliente = context.getBean("beanCliente", Cliente.class);
		Cliente cliente2 = context.getBean("beanCliente2", Cliente.class);
		Cliente cliente3 = context.getBean("beanCliente3", Cliente.class);
		
		Producto producto = context.getBean("beanProducto", Producto.class);
		Producto producto2 = context.getBean("beanProducto2", Producto.class);
		Producto producto3 = context.getBean("beanProducto3", Producto.class);
		Producto producto4 = context.getBean("beanProducto4", Producto.class);
		Producto producto5 = context.getBean("beanProducto5", Producto.class);
		
		Factura factura = context.getBean("beanFactura", Factura.class);
		Factura factura2 = context.getBean("beanFactura2", Factura.class);
		
		FacturaDetalle facturadetalle = context.getBean("beanFacturaDetalle", FacturaDetalle.class);
		FacturaDetalle facturadetalle2 = context.getBean("beanFacturaDetalle", FacturaDetalle.class);	
		
		//CLIENTES
		
		cliente.setIdCliente(1);
		cliente.setCedula("12341234356");
		cliente.setNombre("juan");
		cliente.setApellido("perez");
		cliente.setEdad(18);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tababela");
		cliente.setTelefono("098573647");
		cliente.setCorreo("juan@hotmail.com");
		
		cliente2.setIdCliente(2);
		cliente2.setCedula("174678390");
		cliente2.setNombre("maria");
		cliente2.setApellido("silva");
		cliente2.setEdad(25);
		cliente2.setFechaNacimiento(new Date());
		cliente2.setDireccion("cumbaya");
		cliente2.setTelefono("0956748938");
		cliente2.setCorreo("maria@gmail.com");
		
		cliente3.setIdCliente(3);
		cliente3.setCedula("1734569098");
		cliente3.setNombre("carlos");
		cliente3.setApellido("torres");
		cliente3.setEdad(30);
		cliente3.setFechaNacimiento(new Date());
		cliente3.setDireccion("quito");
		cliente3.setTelefono("0987564738");
		cliente3.setCorreo("carlos@yahoo.com");
		
		factura.setIdFactura(1);
		factura.setNumFactura("FACT-1");
		factura.setFecha(new Date());
		factura.setTotalNeto(40);
		factura.setIva(0.12);
		factura.setTotal(52);
		
		factura2.setIdFactura(2);
		factura2.setNumFactura("FACT-2");
		factura2.setFecha(new Date());
		factura2.setTotalNeto(15);
		factura2.setIva(0.12);
		factura2.setTotal(15);
		
		producto.setIdProducto(1);
		producto.setNombre("caldo magui");
		producto.setDescripcion("sopa intantanea");
		producto.setPrecio(50);
		producto.setStock(30);
		
		producto2.setIdProducto(2);
		producto2.setNombre("chorizo");
		producto2.setDescripcion(" paquetes chorizo");
		producto2.setPrecio(9.9);
		producto2.setStock(15);
		
		producto3.setIdProducto(3);
		producto3.setNombre("aguacate");
		producto3.setDescripcion("4 aguacates");
		producto3.setPrecio(1);
		producto3.setStock(7);
		
		producto4.setIdProducto(4);
		producto4.setNombre("tabacos");
		producto4.setDescripcion(" 2 csjetillsd");
		producto4.setPrecio(3.50);
		producto4.setStock(40);
		
		producto5.setIdProducto(5);
		producto5.setNombre("camaron");
		producto5.setDescripcion("3 libras camaron pelado");
		producto5.setPrecio(6.25);
		producto5.setStock(70);
		
		
		facturadetalle.setIdFacturaDetalle(1);
		facturadetalle.setCantidad(9);
		facturadetalle.setFactura(factura);
		
		facturadetalle2.setIdFacturaDetalle(2);
		facturadetalle2.setCantidad(4);
		facturadetalle2.setFactura(factura2);
	
		System.out.println(factura.toString());
		System.out.println(facturadetalle.toString());
		System.out.println(factura2.toString());
		System.out.println(facturadetalle2.toString());
		
					
		context.close();

	}

}
