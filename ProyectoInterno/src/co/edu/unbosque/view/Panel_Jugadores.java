package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_Jugadores extends JPanel{

	private JLabel nada;
	private JButton atras;

	public Panel_Jugadores() {
		setLayout(new BorderLayout(1,1));
		setVisible(true);
		funcionar();
	}

	public void funcionar() {

		nada = new JLabel("Nada Por el Momento");
		nada.setForeground(Color.RED);
		Font lyric = new Font("arial", Font.ITALIC, 20);
		nada.setFont(lyric);
		add(nada);
		
		atras = new JButton("Volver al menu principal");
		atras.setActionCommand("atrasjugadores");
		add(atras);

	}

	public JLabel getNada() {
		return nada;
	}

	public void setNada(JLabel nada) {
		this.nada = nada;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

}
