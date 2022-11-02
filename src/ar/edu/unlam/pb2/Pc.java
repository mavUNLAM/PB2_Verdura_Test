package ar.edu.unlam.pb2;

public class Pc implements Dispositivo {

	private String sistemaOperativo;
	private String direccionIp;
	private String localidad;

	public Pc(String sistemaOperativo, String direccionIp, String localidad) {
		this.sistemaOperativo = sistemaOperativo;
		this.direccionIp = direccionIp;
		this.localidad = localidad;
	}

	@Override
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	

	@Override
	public String getDireccionIp() {
		return direccionIp;
	}

	

	@Override
	public String getLocalidad() {
		return localidad;
	}

	@Override
	public String getImei() {
		return "no disponible";
	}

	@Override
	public Boolean tieneRegistroBiometrico() {
		return false;
	}

	

	

}
