package exemplos;

import java.util.Locale;


public class Main {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        AgenciaBancaria agencia1 = new AgenciaBancaria();
        AgenciaBancaria agencia2 = new AgenciaBancaria();
        AgenciaBancaria agencia3 = new AgenciaBancaria();
        
        
        ContaBancaria conta1 = new ContaBancaria(1, "Luiz", agencia1.getnumAge());
        ContaBancaria conta2 = new ContaBancaria(2, "Helena", agencia1.getnumAge());
        ContaBancaria conta3 = new ContaBancaria(3, "João", agencia1.getnumAge());
        
        ContaBancaria conta4 = new ContaBancaria(1, "Laura", agencia2.getnumAge());
        ContaBancaria conta5 = new ContaBancaria(2, "Vitor", agencia2.getnumAge());
        ContaBancaria conta6 = new ContaBancaria(3, "Manuela", agencia2.getnumAge());
        
        ContaBancaria conta7 = new ContaBancaria(1, "Miguel", agencia3.getnumAge());
        ContaBancaria conta8 = new ContaBancaria(2, "Liz", agencia3.getnumAge());
        ContaBancaria conta9 = new ContaBancaria(3, "Pedro", agencia3.getnumAge());
        
        
        

        agencia1.adConta(conta1);
        agencia1.adConta(conta2);
        agencia1.adConta(conta3);
        
        agencia2.adConta(conta4);
        agencia2.adConta(conta5);
        agencia2.adConta(conta6);
        
        agencia3.adConta(conta7);
        agencia3.adConta(conta8);
        agencia3.adConta(conta9);
        
        
        //Depósitos sem erro 
        agencia1.depositar(2, 100.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta2.getSaldo(),conta2.getNome(), agencia1.getnumAge());
        agencia1.depositar(3, 683.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta3.getSaldo(),conta3.getNome(), agencia1.getnumAge());
        agencia1.depositar(2, 304.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta2.getSaldo(),conta2.getNome(), agencia1.getnumAge());
        agencia1.depositar(1, 467.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta1.getSaldo(),conta1.getNome(), agencia1.getnumAge());
        agencia1.depositar(3, 518.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta3.getSaldo(),conta3.getNome(), agencia1.getnumAge());
        agencia1.depositar(3, 890.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta3.getSaldo(),conta3.getNome(), agencia1.getnumAge());
        
       
        agencia2.depositar(3, 695.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta6.getSaldo(),conta6.getNome(), agencia2.getnumAge());
        agencia2.depositar(1, 496.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta4.getSaldo(),conta4.getNome(), agencia2.getnumAge());
        agencia2.depositar(2, 715.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta5.getSaldo(),conta5.getNome(), agencia2.getnumAge());
        agencia2.depositar(2, 961.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta5.getSaldo(),conta5.getNome(), agencia2.getnumAge());
        agencia2.depositar(3, 749.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta6.getSaldo(),conta6.getNome(), agencia2.getnumAge());
        agencia2.depositar(1, 560);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta4.getSaldo(),conta4.getNome(), agencia2.getnumAge());
        
        
        agencia3.depositar(3, 166.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta9.getSaldo(),conta9.getNome(), agencia3.getnumAge());
        agencia3.depositar(2, 690.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta8.getSaldo(),conta8.getNome(), agencia3.getnumAge());
        agencia3.depositar(3, 452.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta9.getSaldo(),conta9.getNome(), agencia3.getnumAge());
        agencia3.depositar(2, 833.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta8.getSaldo(),conta8.getNome(), agencia3.getnumAge());
        agencia3.depositar(2, 725.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta8.getSaldo(),conta8.getNome(), agencia3.getnumAge());
        agencia3.depositar(1, 446.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta7.getSaldo(),conta7.getNome(), agencia3.getnumAge());
                
        //Saques sem erro
        agencia1.sacar(3, 500.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta3.getSaldo(),conta3.getNome(), agencia1.getnumAge());
        agencia1.sacar(2, 131.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta2.getSaldo(),conta2.getNome(), agencia1.getnumAge());
        agencia1.sacar(1, 36.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta1.getSaldo(),conta1.getNome(), agencia1.getnumAge());
        agencia1.sacar(2, 144.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta2.getSaldo(),conta2.getNome(), agencia1.getnumAge());
        agencia1.sacar(2, 42.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta2.getSaldo(),conta2.getNome(), agencia1.getnumAge());
        agencia1.sacar(1, 128.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta1.getSaldo(),conta1.getNome(), agencia1.getnumAge());

        
        agencia2.sacar(3, 80.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta6.getSaldo(),conta6.getNome(), agencia2.getnumAge());
        agencia2.sacar(2, 139.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta5.getSaldo(),conta5.getNome(), agencia2.getnumAge());
        agencia2.sacar(1, 63.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta4.getSaldo(),conta4.getNome(), agencia2.getnumAge());
        agencia2.sacar(2, 71.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta5.getSaldo(),conta5.getNome(), agencia2.getnumAge());
        agencia2.sacar(3, 120.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta6.getSaldo(),conta6.getNome(), agencia2.getnumAge());
        agencia2.sacar(1, 68.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta4.getSaldo(),conta4.getNome(), agencia2.getnumAge());
        
        
        agencia3.sacar(3, 81.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta9.getSaldo(),conta9.getNome(), agencia3.getnumAge());
        agencia3.sacar(3, 108.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta9.getSaldo(),conta9.getNome(), agencia3.getnumAge());
        agencia3.sacar(3, 75.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta9.getSaldo(),conta9.getNome(), agencia3.getnumAge());
        agencia3.sacar(2, 122.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta8.getSaldo(),conta8.getNome(), agencia3.getnumAge());
        agencia3.sacar(1, 53.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta7.getSaldo(),conta7.getNome(), agencia3.getnumAge());
        agencia3.sacar(2, 59.0);
        System.out.printf("Saldo da conta: %.2f, pertecente: %s, na Agência: %d%n", conta8.getSaldo(),conta8.getNome(), agencia3.getnumAge());
        
        
        
        
        //Depósitos com erro
        agencia1.depositar(1, -100);
        agencia1.depositar(2, -19);
        agencia1.depositar(3, -156);
        
        agencia2.depositar(1, -10);
        agencia2.depositar(2, -0);
        agencia2.depositar(3, -40);
        
        agencia3.depositar(1, -53);
        agencia3.depositar(2, -1);
        agencia3.depositar(3, -36);
        
        //Saques com erro
        agencia1.sacar(1, -1000);
        agencia1.sacar(2, 100000);
        agencia1.sacar(3, 6910);
        
        agencia2.sacar(1, -58);
        agencia2.sacar(2, 1000);
        agencia2.sacar(3, 3000);
        
        agencia3.sacar(1, 0);
        agencia3.sacar(2, -10);
        agencia3.sacar(3, 50000);
        
        
        //Mostrar as contas das agências
        agencia1.mostrar();
        agencia2.mostrar();
        agencia3.mostrar();

    }
    
}



