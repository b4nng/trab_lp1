
public class testaPregao {

	public static void main(String[] args) {
		
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
			p1.adicionaLance(l1);
		} catch (PregaoFechadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.relatorio();
		
		try {
			p1.adicionaLance(l2);
		} catch (PregaoFechadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.relatorio();
		
		try {
			p1.adicionaLance(l3);
		} catch (PregaoFechadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p1.relatorio();
		
		try {
			p1.adicionaLance(l4);
		} catch (PregaoFechadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		p1.relatorio();
		
		p1.ordemCrescente();
		p1.relatorio();
		
		p1.ordemDecrescente();
		p1.relatorio();
		
		p1.ordemAlfabetica();
		p1.relatorio();
	}

}
