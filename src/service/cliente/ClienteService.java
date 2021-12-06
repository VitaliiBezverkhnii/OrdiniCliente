package service.cliente;

import java.util.List;

import model.Cliente;

public interface ClienteService {

	public void inserisciCliente(Cliente cliente);
	
	public Cliente getCliente(String idCliente);
	
	public List<Cliente> getClienti();
}