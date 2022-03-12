/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanovo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Sistemanovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        ArrayList listaDeClientes = new ArrayList();
        Cliente usuario = new Cliente();
        int op = 0;

        System.out.println("Digite 1 para cadastrar usuários ou 0 para sair !");
         op = scanner.nextInt();
	//cpf, nome, email, senha, endereco residencial, endereco de entrega.
        
	//while(op != 0){
		System.out.println("Bem vindo ao sistema de cadastros de usuários");
		
               
                
                System.out.println("Digite o nome do usuário:");
		usuario.setNome(scanner.nextLine());
                
                 System.out.println("Digite CPF do usuário:");
		usuario.setCpf(scanner.nextLine());
		
		 System.out.println("Digite E-MAIL:");
		usuario.setEmail(scanner.nextLine());
                
                System.out.println("Digite a senha");
		usuario.setSenha(scanner.nextLine());
		
                
                System.out.println("Digite o endereço residencial:");
		usuario.setEnderecoresidencia(scanner.nextLine());
		
		System.out.println("Digite o endereço de entrega:");
		usuario.setEnderecoentrega(scanner.nextLine());
                
               
		
		
		listaDeClientes.add(usuario);
		usuario = new Cliente();
		
		System.out.println("Digite 1 para cadastrar usuários ou 0 para sair !");
		op = scanner.nextInt();
	//}


    }
    
}
