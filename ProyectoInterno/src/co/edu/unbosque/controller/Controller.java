package co.edu.unbosque.controller;

import co.edu.unbosque.view.ModelF;

public class Controller {
	
	private ModelF fachada;
	
	public Controller() {
		
		fachada = new ModelF();
		funcionar();
	}
	
	public void funcionar() {
		
		fachada.asignarOyentes();
		fachada.actionPerformed(null);
		
	}
	
	

}
