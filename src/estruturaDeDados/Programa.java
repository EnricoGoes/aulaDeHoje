package estruturaDeDados;

public class Programa {
	public static void main(String[] args) {
		
		RegraNegocioFuncionario cadastro = new RegraNegocioFuncionario();
		System.out.println("-----Insira o funcionário-----");
		cadastro.cadastrarFuncionario();
		cadastro.listarFuncionario();
		
		RegraNegocioEmpresa cadastro2 = new RegraNegocioEmpresa();
		System.out.println("\n-----Insira a empresa-----");
		cadastro2.cadastrarEmpresa();
		cadastro2.listarEmpresa();
		
	}

}
