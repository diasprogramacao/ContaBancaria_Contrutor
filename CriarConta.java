
public class CriarConta {
	
	public static void main (String[]agrs) {
		
		Conta conta01 = new Conta("544444");
		conta01.deposita(100);
		System.out.println(conta01.getSaldo());
		
		conta01.saca(50);
		System.out.println (conta01.getSaldo());
		
		conta01.transfere(10, conta01);
		System.out.println (conta01.getSaldo());
		
		System.out.println(conta01.getAgencia());
	}

}
