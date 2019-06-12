import java.util.Set;

public class testaRanking {

	public static void main(String[] args) {
		
		DivisaoRanking d = new DivisaoRanking();
		
		Pregao p1 = new Pregao("10/05/2019",3);
		Pregao p2 = new Pregao("11/05/2019",2);
		Pregao p3 = new Pregao("12/05/2019",5);
		Pregao p4 = new Pregao("13/05/2019",9);
		
		Client c1 = new Client("JON KLEBER","rua das canoa, 777","8843477","jao@jao.com");
		Client c2 = new Client("MARQUIN","rua das pipa, 555","88423477","marc00s@jao.com");
		Client c3 = new Client("ALMEIDA","rua das alpaca, 123","8822777","almeidao@jao.com");
		
		Imovel i1 = new Imovel(30000, 200, "suavera aqui", "rua cleito rasta, 777", 90000);
		Imovel i2 = new Imovel(50000, 20000, "lugar tranquilo", "rua mendes, 123", 200000);
		Imovel i3 = new Imovel(20000, 15000, "pintado recentemente", "rua padre cafe, 15", 60000);
		Imovel i4 = new Imovel(100000, 5000, "lugar tranquilo", "av. lobo, 90", 150000);
		
		Lance l1 = new Lance(c1,i1,150000);
		Lance l2 = new Lance(c2,i2,60000);
		Lance l3 = new Lance(c3,i3,40000);
		Lance l4 = new Lance(c3,i4,11000);
		
		String A = "Categoria A"; // Lote com lance acima de 100.000
		String B = "Categoria B"; // Lote com lance 50.000> x > 100.000
		String C = "Categoria C"; // Lote com lance abaixo de 50.000
		
		try {
			
			p1.adicionaLance(l1);
			p2.adicionaLance(l2);
			p3.adicionaLance(l3);
			p4.adicionaLance(l4);
			
			d.distribuiLote(l1, A);
			d.distribuiLote(l2, B);
			d.distribuiLote(l3, C);
			d.distribuiLote(l4, C);
			
			Set<Lote> lista = d.getLista();
			
			for(Lote l: lista)
			{
				System.out.println("Lote: "+l.getCodigo()+" "+d.getCategoria(l));
			}
			
		} catch (PregaoFechadoException e) {
			e.printStackTrace();
		}

	}

}
