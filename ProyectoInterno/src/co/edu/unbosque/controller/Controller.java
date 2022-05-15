package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View gui;
	
	public Controller() {
		
		gui = new View(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		
		if(comando.equals("jugadores")) {
			
			gui.getPrincipal().setVisible(false);
			gui.getJugadores().setVisible(true);
			
		}else if(comando.equals("juegos")) {
			
			gui.getPrincipal().setVisible(false);
			gui.getJuegos().setVisible(true);
			
		}else if(comando.equals("partidas")) {
			
			gui.getPrincipal().setVisible(false);
			gui.getPartidas().setVisible(true);
			
		}else if(comando.equals("torneos")) {
			
			gui.getPrincipal().setVisible(false);
			gui.getTorneos().setVisible(true);
			
		}else if(comando.equals("atrasjuegos")) {
			
			gui.getJuegos().setVisible(false);
			gui.getPrincipal().setVisible(true);
			
		}else if(comando.equals("atrasjugadores")) {
			
			gui.getJugadores().setVisible(false);
			gui.getPrincipal().setVisible(true);
			
			
		}else if(comando.equals("atraspartidas")) {
			
			gui.getPartidas().setVisible(false);
			gui.getPrincipal().setVisible(true);
			
		}else if(comando.equals("atrastorneos")) {
			
			gui.getTorneos().setVisible(false);
			gui.getPrincipal().setVisible(true);
			
		}
	
	}

}
