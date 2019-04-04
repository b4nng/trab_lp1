
public class Pregao {
	Lote[] lotes;
	String data_oferta;
	boolean situacao;
	String[] lances;
	int livre=0;
	
	public Pregao(int quantidade_lotes, String data_oferta, boolean situacao)
	{
		this.data_oferta = data_oferta;
		lotes = new Lote[quantidade_lotes];
		this.situacao = situacao;
	}
	
	public void lances(int n)
	{
		this.lances = new String[n];
	}
	
	public void getSituacao()
	{
		if(this.situacao)
		{
			System.out.println("Pregao aberto");
		}
		else
		{
			System.out.println("Pregao fechado");
		}
	}
	
	public boolean addLote(Lote lote)
	{
		if(livre<=this.lotes.length)
		{
			this.lotes[this.livre] = lote;
			livre++;
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public lance(Cliente cliente, Pregao pregao)
	
	public void relatorio()
	{
		
	}
}
