package model;

public class Ordine {
	
	private String idCliente;
	private int numeroOrdine;
	private String nomeProdotto;
	
	
	public Ordine(String idCliente, String nomeProdotto) {
		this.idCliente = idCliente;
		this.nomeProdotto = nomeProdotto;
	}
	
	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}


	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ordine numero: " + numeroOrdine + ", " +  "Nome prodotto: " + nomeProdotto;
	}

	
}
