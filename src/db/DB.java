package db;

import java.util.HashMap;

import model.Cliente;
import model.Ordine;

public class DB {

	private HashMap<String, Cliente> clienti = new HashMap<String, Cliente>();
	private HashMap<Integer, Ordine> ordini = new HashMap<Integer, Ordine>();
	
	public void writeCliente(Cliente cliente) {
		clienti.put(cliente.getIdCliente(), cliente);
	}
	
	public void writeOrdine(Ordine ordine) {
		ordini.put(ordine.getNumeroOrdine(), ordine);
	}
	
	public HashMap<String, Cliente> getClienti() {
		return clienti;
	}
	
	public HashMap<Integer, Ordine> getOrdini() {
		return ordini;
	}
}
