package sistema;

import java.util.ArrayList;

public class Ruta {

	// ATRIBUTOS
	private Aeropuerto origen;
	private Aeropuerto destino;
	private ArrayList<Aerolinea> aerolineas;
	private double distancia;
	private boolean internacional;

	public Ruta(Aeropuerto origen, Aeropuerto destino, double distancia, boolean internacional) {

		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		this.internacional = internacional;
		this.aerolineas = new ArrayList<Aerolinea>();
	}

	// Averiguar esto, no me convence el retornar el objeto completo.
	public Aeropuerto getOrigen() {
		return origen;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}
	public boolean equals(Object o) {
		Ruta r = (Ruta) o;
		return this.origen.equals(r.getOrigen()) && this.destino.equals(r.getDestino());
	}
	// devuelvo los ToString concatenado de las aerolineas
	public String reservasTotales() {
		String reserva = "";
		for (int i = 0; i < aerolineas.size(); i++) {
			reserva += aerolineas.get(i).toString();
		}
		return reserva;
	}

	// Lo mismo que el caso del getOrigen()
	public Aeropuerto getDestino() {
		return destino;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public boolean esInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	public ArrayList<Aerolinea> getAerolineas() {
		ArrayList<Aerolinea> aux = new ArrayList<Aerolinea>(aerolineas);
		return aux;
	}

	// Agregado el add aerolineas para las rutas
	public void addAerolineas(ArrayList<Aerolinea> aerolineas) {
		this.aerolineas = aerolineas;
	}

	public String toString() {
		return origen.getNombre() + " País: " + origen.getPais() + " " + destino.getNombre() + " País " + destino.getPais();
	}
}
