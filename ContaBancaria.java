package exemplos;

public class ContaBancaria {
    
	private int num;
    private String nome;
    private double saldo;
    private int numAge;

    public ContaBancaria(int num, String nome, int numAge) {
        this.num = num;
        this.nome = nome;
        this.saldo = 0.0;
        this.numAge = numAge;
    }
    
    public int getNum() {
        return num;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(int numero) {
		this.num = numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } 
        else {
            System.out.println("Saldo insuficiente.");
        }
    }
  }
