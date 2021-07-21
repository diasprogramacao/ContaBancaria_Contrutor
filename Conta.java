
public class Conta {
	
	private String titular;
	private String agencia;
	private double saldo;
	
	// NESSE COMANDO A GENTE DEFINE QUE O CONTRATUTOR SEMPRE VAI SOLICITAR O NUMERO DA AGENCIA, SENDO ASSIM 
  //SEMPRE QUE CRIAMOS O OBJETO O VALOR PADRÃO DA AGENCIA SERÁ O VALOR INFORMANDO.
  
	public Conta(String agencia){
		this.agencia = agencia;
	}
	
	public void deposita (double valor) {
		
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		
		if (saldo >= valor && valor >= 0) {
			
			this.saldo -= valor;
			
			return true;
		} else
			
			return false;
	}
	
	public boolean transfere (double valor,Conta cliente) {
		
		if (saldo>= valor) {
			
			saldo -= valor;
			cliente.saldo = valor;
			
			return true;
		} else
			
			return false;
	}
	
	public double getSaldo() {
		
	 return saldo;		
	}

	public String getAgencia() {
		return agencia;
	}
	
}
