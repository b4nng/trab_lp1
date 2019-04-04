

public class Leilao {

	public static void main(String[] args) {
		
		Lote volvo = new Lote(5000, 500, "carro em excelente estado, precisando ajustar o retrovisor", 0, "Ford", "ka", 2017);
		Client jao = new Client("Joao Marques Silva","Rua dos albuquerque, numero 190", "31994440392","jao@jao.com");
		Lance l1 = new Lance(jao, volvo, 500);
		
		System.out.println(volvo.toString());
		System.out.println(jao.toString());
		System.out.println(l1.toString());
		
		
		
	}
	

}
