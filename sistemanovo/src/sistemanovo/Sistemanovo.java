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
        Scanner entrada = new Scanner(System.in);
        
        ArrayList listaDeClientes = new ArrayList();
        Cliente usuario = new Cliente();
        int op = 0;
        int opcao1 = 0;
        

        
	//cpf, nome, email, senha, endereco residencial, endereco de entrega.
        
       do {
           System.out.println("\n \n (Digite 1 = cadastrar , Digite 2= Listar, Digite 0 = sair) ");
            System.out.println([======>   Digite a opção desejada:  <===========]");
             opcao1 = entrada.nextInt();

            switch (opcao1) {
            case 1:
                System.out.println("Digite o CPF:");
                usuario.setCpf(entrada.next());
                
                System.out.println("Digite o nome do Cliente!");
                usuario.setNome(entrada.next());

                System.out.println("Digite o EMAIL:");;
                usuario.setEmail(entrada.next());
                
                System.out.println("Digite o senha:");;
                usuario.setSenha(entrada.next());
                
                System.out.println("Endereço de Residencia");
                usuario.setEnderecoresidencia(entrada.next());

                System.out.println("***Endereço de Entrega");
                usuario.setEnderecoentrega(entrada.next());

                listaDeClientes.add(usuario);
                
                System.out.println("\n >>>> (cadastrado) <<<<< \n ");
                break;

            case 2:

                for (int i = 0; i < listaDeClientes.size(); i++) {
                    
                    System.out.println("CPF:"+usuario.getCpf());
                
               
                System.out.println("NOME:"+usuario.getNome());
                

                System.out.println("EMAIL:"+usuario.getEmail());;
               
                
                System.out.println("senha:"+usuario.getSenha());;
                
                
                System.out.println("Endereço de Residencia:"+usuario.getEnderecoresidencia());
                

                System.out.println("Endereço de Entrega:"+usuario.getEnderecoentrega());
			
                
		}
                
                default:
                    if(opcao1 >2)
                System.out.println("Opção Invalida!\n \n ");
                break;
            }
        } while (opcao1 != 0);

    }
    
}
