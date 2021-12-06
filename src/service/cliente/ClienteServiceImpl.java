package service.cliente;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import service.base.BaseService;

public class ClienteServiceImpl extends BaseService implements ClienteService {

	@Override
	public void inserisciCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		int numeroCliente = getDB().getClienti().size() + 1;
		cliente.setNumeroCliente(numeroCliente);
		getDB().writeCliente(cliente);
	}
	
	

	@Override
	public Cliente getCliente(String idCliente) {
		// TODO Auto-generated method stub
		return getDB().getClienti().get(idCliente);
	}



	@Override
	public List<Cliente> getClienti() {
		// TODO Auto-generated method stub
		return new ArrayList<Cliente>(getDB().getClienti().values());
	}
}