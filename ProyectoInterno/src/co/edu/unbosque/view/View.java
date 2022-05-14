package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class View {
	
	private Ventana_Principal principal;
	private Ventana_Jugadores jugadores;
	private Ventana_Juegos juegos;
	private Ventana_Partidas partidas;
	private Ventana_Torneos torneos;
	
	public View(Controller control) {
		
		principal = new Ventana_Principal();
		principal.getPanelp().getJugadores().addActionListener(control);
		principal.getPanelp().getPartidas().addActionListener(control);
		principal.getPanelp().getJuegos().addActionListener(control);
		principal.getPanelp().getTorneos().addActionListener(control);
		
		jugadores = new Ventana_Jugadores();
		jugadores.getPaneljugadores().getAtras().addActionListener(control);
		
		juegos = new Ventana_Juegos();
		juegos.getPaneljuegos().getAtras().addActionListener(control);
		
		partidas = new Ventana_Partidas();
		partidas.getPanelpartidas().getAtras().addActionListener(control);
		
		torneos = new Ventana_Torneos();
		torneos.getPaneltorneos().getAtras().addActionListener(control);
		
	}

	
	public Ventana_Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Ventana_Principal principal) {
		this.principal = principal;
	}

	public Ventana_Jugadores getJugadores() {
		return jugadores;
	}

	public void setJugadores(Ventana_Jugadores jugadores) {
		this.jugadores = jugadores;
	}

	public Ventana_Juegos getJuegos() {
		return juegos;
	}

	public void setJuegos(Ventana_Juegos juegos) {
		this.juegos = juegos;
	}

	public Ventana_Partidas getPartidas() {
		return partidas;
	}

	public void setPartidas(Ventana_Partidas partidas) {
		this.partidas = partidas;
	}

	public Ventana_Torneos getTorneos() {
		return torneos;
	}

	public void setTorneos(Ventana_Torneos torneos) {
		this.torneos = torneos;
	}
	
}
