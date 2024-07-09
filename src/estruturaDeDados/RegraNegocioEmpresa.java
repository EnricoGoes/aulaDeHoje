package estruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class RegraNegocioEmpresa {

ArrayList<Empresa> Empresa = new ArrayList<>();
	
	public void cadastrarEmpresa() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CNPJ da empresa: ");
		String cnpj = scan.nextLine();
		System.out.println("Nome da empresa: ");
		String nome = scan.nextLine();
		System.out.println("Telefone da empresa: ");
		String telefone = scan.nextLine();
	
		Empresa emp1 = new Empresa(cnpj, nome, telefone);
		
		Empresa.add(emp1);

		System.out.println("\nEmpresa cadastrada!");
		
	}
	
	public void listarEmpresa(){
		System.out.println("\nEmpresa Listada: \n");
			for(Empresa empresa : Empresa) {
				System.out.println("CPF: " + empresa.getCnpj());
				System.out.println("Nome: " + empresa.getNome());
				System.out.println("Telefone: " + empresa.getTelefone());
				
		}
		
	}

}
