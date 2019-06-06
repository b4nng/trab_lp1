
public class testaPregao {

	public static void main(String[] args) {
		
		Pregao p1 = new Pregao("10/05/2019",2);
		Client c1 = new Client("JON KLEBER","rua das canoa, 777","884922777","jao@jao.com");
		Imovel i1 = new Imovel(30000,200,"suavera aqui","rua cleito rasta, 777",90000);
		Lance l1 = new Lance(c1,i1,200);
		Lance l2 = new Lance(c1,i1,600);
		Lance l3 = new Lance(c1,i1,800);
		
		p1.adicionaLance(l1);
		p1.relatorio();
		
		p1.adicionaLance(l2);
		p1.relatorio();
		/*
		p1.adicionaLance(l3);
		p1.relatorio();
		
		p1.adicionaLance(l3);
		p1.relatorio();*/
	}

}
