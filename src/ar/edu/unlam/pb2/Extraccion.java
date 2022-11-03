package ar.edu.unlam.pb2;

public class Extraccion implements TransaccionMonetaria, Rechazable, Alertable, Monitoreable {

	private Integer id;
	private Cliente cliente;
	private Double monto;

	public Extraccion(Integer id, Cliente cliente, Double monto) {
		this.id = id;
		this.cliente = cliente;
		this.monto = monto;
	}

	@Override
	public Boolean monitorear() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marcarComoCasoSospechoso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {
		// TODO Auto-generated method stub
		
	}

}
