package ar.edu.unlam.pb2;

public class Celular implements Dispositivo {

	private String sistemaOperativo;
	private String direccionIp;
	private String localidad;
	private String iMei;
	private Boolean registroBiometrico;

	public Celular(String sistemaOperativo, String direccionIp, String localidad, String iMei, Boolean registroBiometrico) {
		this.sistemaOperativo = sistemaOperativo;
		this.direccionIp = direccionIp;
		this.localidad = localidad;
		this.iMei = iMei;
		this.registroBiometrico = registroBiometrico;
	}

	@Override
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	@Override
	public String getLocalidad() {
		return localidad;
	}

	@Override
	public String getDireccionIp() {
		return direccionIp;
	}

	@Override
	public String getImei() {
		return iMei;
	}

	@Override
	public Boolean tieneRegistroBiometrico() {
		return registroBiometrico;
	}

}
