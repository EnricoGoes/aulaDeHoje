package estruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class RegraNegocioFuncionario {
	
	ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	public void cadastrarFuncionario() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CPF do funcionário: ");
		String cpf = scan.nextLine();
		System.out.println("Nome do funcionário: ");
		String nome = scan.nextLine();
		System.out.println("RG do funcionário: ");
		String rg = scan.nextLine();
		System.out.println("Telefone do funcionário: ");
		String telefone = scan.nextLine();
	
		Funcionario fun1 = new Funcionario(cpf, nome, rg, telefone);
		
		funcionarios.add(fun1);

		System.out.println("\nFuncionário cadastrado!");
		
	}
	
	public void listarFuncionario(){
		System.out.println("\nLista dos funcionários: \n");
			for(Funcionario funcionario : funcionarios) {
				System.out.println("CPF: " + funcionario.getCpf());
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("RG: " + funcionario.getRg());
				System.out.println("Telefone: " + funcionario.getTelefone());
				
		}
		
	}

}
