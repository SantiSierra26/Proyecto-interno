package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Jugadores extends JFrame{
	
	private Panel_Jugadores paneljugadores;
	
	
	public Ventana_Jugadores() {
		
		setTitle("Jugadores");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		funcionar();
	}
	
	public void funcionar() {
		
		paneljugadores = new Panel_Jugadores();
		getContentPane().add(paneljugadores);
		paneljugadores.setBounds(50, 50, 300, 100);
		paneljugadores.setOpaque(false);
	}

	public Panel_Jugadores getPaneljugadores() {
		return paneljugadores;
	}

	public void setPaneljugadores(Panel_Jugadores paneljugadores) {
		this.paneljugadores = paneljugadores;
	}
	

}
