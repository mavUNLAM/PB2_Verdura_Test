package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGeneral {

	@Test
	public void queSePuedaCrearUnCliente() {
		String cuit = "00-33.333.333-00";
		String nombre = "Jaimito";
		
		Cliente cliente = new Cliente(cuit,nombre);
		
		assertEquals(cuit, cliente.getCuit());
		assertEquals(nombre, cliente.getNombre());
	}
	
	@Test
	public void queSePuedaCrearUnDispositivo() {
		String so = "windows pepito 2023";
		String dirIp = "192.168.1.50";
		String localidad = "localidad";
		String soCel = "Android";
		String iMei = "johsjhdsldsjldsjl";
		Boolean registroBiometrico = true;
		Dispositivo pc = new Pc(so, dirIp, localidad);
		Dispositivo movil = new Celular(soCel,dirIp,localidad,iMei, registroBiometrico);
		
		assertEquals(so,pc.getSistemaOperativo());
		assertEquals(dirIp, pc.getDireccionIp());
		assertEquals(localidad, pc.getLocalidad());
		assertEquals(soCel, movil.getSistemaOperativo());
		assertEquals(dirIp, movil.getDireccionIp());
		assertEquals(localidad, movil.getLocalidad());
		assertEquals(iMei, movil.getImei());
		assertEquals(registroBiometrico, movil.tieneRegistroBiometrico());
		
	}
	
	@Test
	public void queSePuedaMonitorearUnaExtraccion() {
		TransaccionMonetaria extraccion = new Extraccion();
		
	}

}
