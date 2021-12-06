package service.ordine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import model.Ordine;
import service.base.BaseService;

public class OrdineServiceImpl extends BaseService implements OrdineService {

	@Override
	public void inserisciOrdine(Ordine ordine) {
		// TODO Auto-generated method stub
		int numeroOrdine = getDB().getOrdini().size() + 1;
		ordine.setNumeroOrdine(numeroOrdine);
		getDB().writeOrdine(ordine);
	}

	@Override
	public HashMap<Integer, Ordine> getOrdini() {
		// TODO Auto-generated method stub
		return getDB().getOrdini();
	}

	@Override
	public List<Ordine> getTuttiOrdiniCliente(String idCLiente) {
		// TODO Auto-generated method stub
		List<Ordine> ordiniCliente = new ArrayList<Ordine>();
		Iterator<Ordine> iterator = getDB().getOrdini().values().iterator();
		Ordine ordine = null;
		
		while(iterator.hasNext()) {
			ordine = iterator.next();
			if(ordine.getIdCliente().equals(idCLiente)) {
				ordiniCliente.add(ordine);
			}
		}
		return ordiniCliente;
	}
}