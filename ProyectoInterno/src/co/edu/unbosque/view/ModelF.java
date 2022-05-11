package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModelF implements ActionListener {
	
	private Ventana_Principal principal;
	private Ventana_Jugadores jugadores;
	private Ventana_Juegos juegos;
	private Ventana_Partidas partidas;
	private Ventana_Torneos torneos;
	
	public ModelF() {
		
		principal = new Ventana_Principal();
		jugadores = new Ventana_Jugadores();
		juegos = new Ventana_Juegos();
		partidas = new Ventana_Partidas();
		torneos = new Ventana_Torneos();
		
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		
		principal.getPanelp().getJugadores().addActionListener(this);
		principal.getPanelp().getJuegos().addActionListener(this);
		principal.getPanelp().getPartidas().addActionListener(this);
		principal.getPanelp().getTorneos().addActionListener(this);
		jugadores.getPaneljugadores().getAtras().addActionListener(this);
		juegos.getPaneljuegos().getAtras().addActionListener(this);
		partidas.getPanelpartidas().getAtras().addActionListener(this);
		torneos.getPaneltorneos().getAtras().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		if(comando.equals("jugadores")) {
			
			principal.setVisible(false);
			jugadores.setVisible(true);
			
		}else if(comando.equals("juegos")) {
			
			principal.setVisible(false);
			juegos.setVisible(true);
			
		}else if(comando.equals("partidas")) {
			
			principal.setVisible(false);
			partidas.setVisible(true);
			
		}else if(comando.equals("torneos")) {
			
			principal.setVisible(false);
			torneos.setVisible(true);
			
		}else if(comando.equals("atrasjuegos")) {
			
			juegos.setVisible(false);
			principal.setVisible(true);
			
		}else if(comando.equals("atrasjugadores")) {
			
			jugadores.setVisible(false);
			principal.setVisible(true);
			
		}else if(comando.equals("atraspartidas")) {
			
			partidas.setVisible(false);
			principal.setVisible(true);
			
		}else if(comando.equals("atrastorneos")) {
			
			torneos.setVisible(false);
			principal.setVisible(true);
		}
		
		principal.repaint(); //este método provoca una llamada al método de actualización de este componente tan pronto como sea posible.
		

	}
	//Creación de Getters and Setters.

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
