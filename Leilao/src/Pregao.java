import java.util.ArrayList;

public class Pregao {
	private String data_oferta;
	private boolean situacao; //  Caso esteja TRUE: pregao aberto a lances / Caso esteja FALSE: pregao fechado a lances
	private ArrayList<Lance> lances;
	private Lance higher_lance;
	private int tam_lances;
	
	public Pregao(int quantidade_lotes, String data_oferta, boolean situacao, int qtd_lances)
	{
		this.data_oferta = data_oferta;
		this.situacao = situacao;
		this.tam_lances = qtd_lances;
		this.lances = new ArrayList<Lance>();
		this.higher_lance = new Lance();
	}

	public boolean adicionaLance(Lance ln) //Adiciona um lance no pregao, dentro da arraylist lances
	{
		if(this.lances.size() >= this.tam_lances)
		{
			this.lances.add(ln);
			if(this.lances.size() == this.tam_lances)
			{
				this.situacao = false;
			}
			if(this.higher_lance.getValor_lance() < ln.getValor_lance())
			{
				this.higher_lance = ln;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void relatorio()
	{
			System.out.println("\nDados do Pregao:");
			
			if(situacao)
			{
				System.out.println("ABERTO para lances");
			}
			
			else {System.out.println("FECHADO para lances");}
			
			
			System.out.println("\nData do pregao: "+this.data_oferta);
			
			for(Lance lance: lances)
			{
				System.out.println("Codigo:"+lance.getCodigo());
			}
	}
}
