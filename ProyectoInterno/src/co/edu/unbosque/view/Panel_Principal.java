package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Principal extends JPanel{


	private static final long serialVersionUID = 1L;
	private JButton jugadores;
	private JButton juegos;
	private JButton partidas;
	private JButton torneos;
	
	public Panel_Principal() {
		
		setLayout(new GridLayout(2,2,27,10));
		funcionar();
		
	}
	
	public void funcionar() {
		
		jugadores = new JButton("Jugadores");
		jugadores.setActionCommand("jugadores");
		add(jugadores);
		
		juegos = new JButton("Juegos");
		juegos.setActionCommand("juegos");
		add(juegos);
		
		partidas = new JButton("Partidas");
		partidas.setActionCommand("partidas");
		add(partidas);
		
		torneos = new JButton("Torneos");
		torneos.setActionCommand("torneos");
		add(torneos);
		
	}

	
	public JButton getJugadores() {
		return jugadores;
	}

	public void setJugadores(JButton jugadores) {
		this.jugadores = jugadores;
	}

	public JButton getJuegos() {
		return juegos;
	}

	public void setJuegos(JButton juegos) {
		this.juegos = juegos;
	}

	public JButton getPartidas() {
		return partidas;
	}

	public void setPartidas(JButton partidas) {
		this.partidas = partidas;
	}

	public JButton getTorneos() {
		return torneos;
	}

	public void setTorneos(JButton torneos) {
		this.torneos = torneos;
	}
	
}
