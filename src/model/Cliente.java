package model;

public class Cliente {
	
	private int numeroCliente;
	private String idCliente;
	private String nome;
	private String cognome;
	
	public Cliente() {
		
	}

	public Cliente(String idCliente, String nome, String cognome) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String div = ",";
		return "[" + numeroCliente +  "] - " +  " ID: " + idCliente + div +  " Nome: " + nome + div + " Cognome: " + cognome;
	}
}
