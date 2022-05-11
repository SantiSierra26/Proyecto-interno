package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Ventana_Juegos extends JFrame{
	
	private Panel_Juegos paneljuegos;
	
	public Ventana_Juegos() {
		
		setTitle("Juegos");
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
		
		paneljuegos = new Panel_Juegos();
		getContentPane().add(paneljuegos);
		paneljuegos.setBounds(50, 50, 300, 100);
		paneljuegos.setOpaque(false);
	}

	public Panel_Juegos getPaneljuegos() {
		return paneljuegos;
	}

	public void setPaneljuegos(Panel_Juegos paneljuegos) {
		this.paneljuegos = paneljuegos;
	}
	
}
