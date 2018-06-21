package com.cadena;

import com.mensajes.Mensaje;
import com.vista.ControladorCliente;

public abstract class ChainCliente {
	protected ChainCliente siguiente;

	public void enlazarSiguiente(ChainCliente sig) {
		siguiente=sig;
	}
	
	public abstract void manejarPeticion(Mensaje msj);
			
}
