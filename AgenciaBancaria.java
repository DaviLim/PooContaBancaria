package exemplos;

import java.util.ArrayList;
import java.util.List;

public class AgenciaBancaria {
	private static int numAge = 1;
    private int num;
    private List<ContaBancaria> contas;

    public AgenciaBancaria() {
        this.num = numAge;
        numAge += 1;
        this.contas = new ArrayList<>();
    }
    
    public int getnumAge() {
    	return num;
    }

    public void adConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso");
        
    }

    public void depositar(int num, double valor) {
        for (ContaBancaria conta : contas) {
            if (conta.getNum() == num) {
            	if (valor > 0) {
            		 conta.depositar(valor);
            		 System.out.println("Depósito realizado com sucesso.");
                     
            	}
            	else {
            		System.out.println("Valor inválido para depósito.");
            		break;
            	}
               
            }
        }
    }

    public void sacar(int num, double valor) {
        for (ContaBancaria conta : contas) {
        	if (conta.getNum() == num) {
                if (valor > 0 && conta.getSaldo() >= valor) {
                    conta.sacar(valor);
                    System.out.println("Saque realizado com sucesso.");   
                 }
                if (valor <= 0) {
                	System.out.println("Valor inválido para saque.");
                }
                else {
                    System.out.println("Saldo insuficiente.");
                }
                break; 
        }
    }
 }
    public void mostrar() {
        System.out.println("Lista de contas da Agência " + num + ":");
        for (ContaBancaria conta : contas) {
            System.out.println("Número da Conta: " + conta.getNum());
            System.out.println("Nome do Titular: " + conta.getNome());
            System.out.println("Saldo da Conta: " + conta.getSaldo());
            System.out.println();
            
        }
    }

}
