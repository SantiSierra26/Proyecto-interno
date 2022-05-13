package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Ventana_Principal extends JFrame{
	
	private Panel_Principal panelp; 
	private JLayeredPane Ipan;
	
	public Ventana_Principal() {
		
		setTitle("Sistema de Información de Juegos de Mesa");
		setPreferredSize(new Dimension(450, 200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		//getContentPane().setLayout(new GridLayout(2,2));
		pack();
		setResizable(false);// Establece si se puede cambiar el tamaño de la ventana.
		setLocationRelativeTo(null);//Coloca la ventana al centro de la pantalla.
		setVisible(true);
		funcionar();
		
	}
	
	public void funcionar() {
		
		Ipan = new JLayeredPane();
		getContentPane().add(Ipan, BorderLayout.CENTER);
		
		panelp = new Panel_Principal();
		panelp.setBounds(67, 27, 300, 100);
		panelp.setOpaque(false);
		
		Ipan.add(panelp);
	
	}

	public Panel_Principal getPanelp() {
		return panelp;
	}

	public void setPanelp(Panel_Principal panelp) {
		this.panelp = panelp;
	}

	public JLayeredPane getIpan() {
		return Ipan;
	}

	public void setIpan(JLayeredPane ipan) {
		Ipan = ipan;
	}
	
	

}
