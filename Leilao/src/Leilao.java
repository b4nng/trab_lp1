import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Leilao {

	public static void main(String[] args) throws InterruptedException{

		Pregao p1 = new Pregao("10/05/2019",3);
		Client c1 = new Client("JON KLEBER","rua das canoa, 777","8843477","jao@jao.com");
		Client c2 = new Client("MARQUIN","rua das pipa, 555","88423477","marc00s@jao.com");
		Client c3 = new Client("ALMEIDA","rua das alpaca, 123","8822777","almeidao@jao.com");
		Imovel i1 = new Imovel(30000,200,"suavera aqui","rua cleito rasta, 777",90000);
		Lance l1 = new Lance(c1,i1,500);
		Lance l2 = new Lance(c2,i1,300);
		Lance l3 = new Lance(c3,i1,900);
		Lance l4 = new Lance(c3,i1,1100);
		
		try {
		p1.iniciaPregao();
		
			Leilao.lance(l1, p1);
			Leilao.checaPregao(p1);
			TimeUnit.SECONDS.sleep(3);
			Leilao.checaPregao(p1);
			
			Leilao.lance(l2, p1);
			TimeUnit.SECONDS.sleep(3);
			Leilao.checaPregao(p1);
			TimeUnit.SECONDS.sleep(10);
			Leilao.checaPregao(p1);
			
			p1.relatorio();

		
		} catch (PregaoFechadoException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void lance(Lance ln, Pregao pregao) throws PregaoFechadoException {
		ln.setHora_do_lance(Instant.now());
		if(ln.getHora().isBefore(pregao.getHora_inicio().plusSeconds(10))) {
			pregao.adicionaLance(ln);
			pregao.iniciaPregao();
			System.out.println("Lance "+ln.getCodigo()+" computado!");
		}else {
			pregao.fechaPregao();
			if(pregao.isEmpty())
			{
				System.out.println("O lote NÃO foi arrematado.");
			}else {
				System.out.println("Lote ARREMATADO, relatorio:");
				pregao.relatorio();
			}
		}
	}
	
	public static void checaPregao(Pregao pregao) {
		if(!pregao.Situacao()) {System.out.println("Pregao fechado");}
		else {
			if(Instant.now().isAfter(pregao.getHora_inicio().plusSeconds(10))) {
				if(pregao.isEmpty())
				{
					System.out.println("O lote NÃO foi arrematado.");
				}else {
					System.out.println("Lote ARREMATADO! Código do Lance Vencedor: "+pregao.getHigher_lance().getCodigo());
				}
			}else {
				System.out.println("Pregão ainda aberto e disponível para dar lances!");
			}
		}
	}
	

}
