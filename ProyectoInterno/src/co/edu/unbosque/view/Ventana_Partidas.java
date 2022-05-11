package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Partidas extends JFrame{
	
	private Panel_Partidas panelpartidas;
	
	public Ventana_Partidas() {
		
		setTitle("Partidas");
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
		panelpartidas = new Panel_Partidas();
		getContentPane().add(panelpartidas);
		panelpartidas.setBounds(50, 50, 300, 100);
		panelpartidas.setOpaque(false);
	}

	public Panel_Partidas getPanelpartidas() {
		return panelpartidas;
	}

	public void setPanelpartidas(Panel_Partidas panelpartidas) {
		this.panelpartidas = panelpartidas;
	}
	

}
