package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel_Jugadores extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel enunciado;
	private JTextField txt;
	private JButton butEscribir;
	private JButton butLeer;
	private JButton atras;

	public Panel_Jugadores() {
		
		setLayout(new GridLayout(1,1));		
		atras = new JButton("Volver al menu principal");
		atras.setActionCommand("atrasjugadores");
		add(atras);
	}
	
	public JTextField getTxt() {
		return txt;
	}

	public void setTxt(JTextField txt) {
		this.txt = txt;
	}

	public JButton getButEscribir() {
		return butEscribir;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

}
