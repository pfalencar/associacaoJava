package pessoaendereco;

import java.util.Scanner;

public class AppPessoaEndereco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		char resp;
		//Objetos Pessoa e Endereco
		Pessoa p = new Pessoa();
		Endereco e = new Endereco();
		
		//Dados da pessoa
		System.out.println("Digite o nome: ");
		p.setNome(entradaString.nextLine());		
		
		System.out.println("Digite a idade: ");
		p.setIdade(entrada.nextInt());		
		
		System.out.println("Digite o sexo (f/m): ");
		p.setSexo(entrada.next().charAt(0));
		
		
		//Dados do endereço
		System.out.println("Logradouro: ");
		e.setLogradouro(entradaString.nextLine());
		
		System.out.println("Número: ");
		e.setNumero(entrada.nextInt());
		
		System.out.println("Tem complemento?(s/n): ");
		resp = entrada.next().charAt(0);
		//comparação de char usa-se o método: boolean res = c1.equals(c2);
		//Mas pra não se importar com CAPS usa-se: (Character.toLowerCase(newGame.charAt(0)) == 'y');
		if ( Character.toLowerCase(resp) == 's'){
			System.out.println("Complemento: ");
			e.setComplemento(entradaString.nextLine());
		} else {
			e.setComplemento("");
		}		
		System.out.println("CEP: ");
		e.setCep(entradaString.nextLine());
		
		//associação entre pessoa e endereco
		p.setEnd(e);
		
		
		System.out.println("Dados da pessoa: \n" + p.imprimir());
		
		entrada.close();
		entradaString.close();
		
	}

}
