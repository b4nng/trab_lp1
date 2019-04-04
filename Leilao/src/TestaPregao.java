
public class TestaPregao {

	public static void main(String[] args) {
		Lote volvo = new Lote(5000, 500, "carro em excelente estado, precisando ajustar o retrovisor", 0, "Ford", "ka", 2017);
		Client jao = new Client("Joao Marques Silva","Rua dos albuquerque, numero 190", "31994440392","jao@jao.com");
		Lance l1 = new Lance(jao, volvo, 500);
		
		//Pregao(int quantidade_lotes, String data_oferta, boolean situacao, int qtd_lances)
		Pregao preg1 = new Pregao(3, "10/12/2000", true, 3);
		preg1.addLote(volvo);
		preg1.addLote(volvo);
		preg1.addLote(volvo);
		//preg1.addLote(volvo);
		
		preg1.darLance(l1);
		preg1.darLance(l1);
		preg1.darLance(l1);
		preg1.darLance(l1);
		
		preg1.relatorio();

	}

}
