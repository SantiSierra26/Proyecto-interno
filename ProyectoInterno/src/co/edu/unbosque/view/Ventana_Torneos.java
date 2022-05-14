package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class Ventana_Torneos extends JFrame{
	
	private Panel_Torneos paneltorneos;
	
	public Ventana_Torneos() {
		
		setTitle("Torneos");
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
		
		paneltorneos = new Panel_Torneos();
		getContentPane().add(paneltorneos);
		paneltorneos.setBounds(5, 5, 3, 1);
		paneltorneos.setOpaque(true);
	}

	public Panel_Torneos getPaneltorneos() {
		return paneltorneos;
	}

	public void setPaneltorneos(Panel_Torneos paneltorneos) {
		this.paneltorneos = paneltorneos;
	}
	
}
