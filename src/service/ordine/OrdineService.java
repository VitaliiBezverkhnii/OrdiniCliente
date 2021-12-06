package service.ordine;

import java.util.HashMap;
import java.util.List;

import model.Ordine;

public interface OrdineService {

	public void inserisciOrdine(Ordine ordine);
	
	public HashMap<Integer, Ordine> getOrdini();
	
	public List<Ordine> getTuttiOrdiniCliente(String idCLiente);
}
