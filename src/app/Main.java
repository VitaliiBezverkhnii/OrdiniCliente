package app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Ordine;
import service.cliente.ClienteServiceImpl;
import service.ordine.OrdineServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		ClienteServiceImpl clienteService = new ClienteServiceImpl();
		OrdineServiceImpl ordineService = new OrdineServiceImpl();
		Scanner scanner = new Scanner(System.in);;
		List<Cliente> clienti;
		int opzione = -1;
		
		do {
			stampaOpzioni();
			try {
				opzione = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e){
				System.err.println(e.getMessage());
			}
			
			switch(opzione) {
			
			case 1:
				System.out.println("===NUOVO CLIENTE===");
				
				System.out.println("-Codice Fiscale:");
				String codiceFiscale = scanner.nextLine();
				
				System.out.println("-Nome:");
				String nome = scanner.nextLine();
				
				System.out.println("-Cognome:");
				String cognome = scanner.nextLine();
				
				clienteService.inserisciCliente(new Cliente(codiceFiscale, nome, cognome));
				System.out.println("---Hai inserito nuovo cliente!---");
				break;
				
			case 2:
				clienti = clienteService.getClienti();
				if(clienti.size() > 0) {
					
					System.out.println("===Lista dei clienti:");
					for(Cliente cliente : clienti) {
						System.out.println(cliente.toString());
					}
					System.out.println("===NUOVO ORDINE===");
					System.out.println("- ID di cliente che ordina:");
					String idCliente = scanner.nextLine();
					
					System.out.println("- Nome del prodotto:");
					String nomeProdotto = scanner.nextLine();
					
					ordineService.inserisciOrdine(new Ordine(idCliente, nomeProdotto));
					System.out.println("---Hai inserito nuovo ordine!---");
				} else {
					System.err.println("- Devi avere prima clienti...");
				}
				break;
				
			case 3:
				clienti = clienteService.getClienti();
				
				if(clienti.size() > 0) {
					System.out.println("===ORDINI DI CLIENTE===");
					for(Cliente tmp : clienti) {
						System.out.println(tmp.toString());
					}
					System.out.println("- Scegli ID di un cliente per visualizzare gli ordini:");
					String idCliente = scanner.nextLine();
					Cliente cliente = clienteService.getCliente(idCliente);
					String mesage = "Gli ordini di: " + cliente.getNome() + " " + cliente.getCognome();
					System.out.println(mesage);
					
					List<Ordine> ordini = ordineService.getTuttiOrdiniCliente(idCliente);			
					if(ordini.size() > 0) {
						for(Ordine ordine : ordini) {
							System.out.println(ordine.toString());
						}
					} else {
						System.err.println("- Cliente non ha ancora ordini...");
					}
				} else {
					System.err.println("- Devi avere prima clienti...");
				}
				break;
				
			case 0:
				System.out.println("===SEI USCITO===");
				break;
				
				default:
					System.err.println("...Erore di input...");
			}
		} while(opzione != 0);
		scanner.close();
	}
	
	private static void stampaOpzioni() {
		List<String> opzioni = new ArrayList<String>();
		opzioni.add("[1] - Inserisci cliente");
		opzioni.add("[2] - Inserisci ordine");
		opzioni.add("[3] - Visualizza ordini di un cliente");
		opzioni.add("[0] - Esci");
		
		System.out.println("===OPZIONI===");
		for(String opzione : opzioni) {
			System.out.println(opzione);
		}
	}
}