package ar.edu.unlam.pb2;

public interface Dispositivo {

	String getSistemaOperativo();

	String getLocalidad();

	String getDireccionIp();

	String getImei();

	Boolean tieneRegistroBiometrico();

}
