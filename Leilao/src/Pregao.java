
public class Pregao {
	//Lote[] lotes;
	String data_oferta;
	boolean situacao;
	Lance[] lances;
	Lance higher_lance;
	
	public Pregao(int quantidade_lotes, String data_oferta, boolean situacao, int qtd_lances)
	{
		this.data_oferta = data_oferta;
		this.lotes = new Lote[quantidade_lotes];
		this.situacao = situacao;
		this.lances = new Lance[qtd_lances];
		this.higher_lance = new Lance();
	}
	
	public void addLote(Lote lote)
	{
		for (int i=0; i < lotes.length; i++)
		{
			if(lotes[i] == null)
			{
				lotes[i] = lote;
				System.out.println("\nLote Registrado");
				return;
			}
		}
		System.out.println("\nSem mais espaco para lote neste pregao, num max de "+lotes.length+" atingido");
	}
	
	public boolean searchLote(Lote l)
	{
		for(int i=0; i < this.lotes.length; i++)
		{
			if(this.lotes[i] == l)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean confereEspaco()
	{
		for(int i=0; i < lotes.length; i++)
		{
			if(lotes[i] == null)
			{
				System.out.println("Você ainda não preencheu todos os espaços de lote! ("+lotes.length+")");
				return false;
			}
		}
		return true;
	}
	
	public void darLance(Lance lance)
	{
		if(searchLote(lance.lote)) {
			for (int i=0; i < lances.length; i++)
			{
				if(lances[i] == null)
				{
					lances[i] = lance;
					System.out.println("\nLance Registrado");
					if(lance.valor_lance > higher_lance.valor_lance)
					{
						this.higher_lance = lance;
					}
					return;
				}
			}
			System.out.println("\nSem mais lances disponiveis para este Pregao");
			this.situacao = false;
			return;
			}
		else
		{
			System.out.println("\nLote Nao encontrado para lance");
			return;
		}
	}
	
	public void relatorio()
	{
		if(this.confereEspaco()) {
			System.out.println("\nDados do Pregao:");
			
			if(situacao)
			{
				System.out.println("ABERTO para lances");
			}else {System.out.println("FECHADO para lances");}
			
			System.out.println("\nLotes do Pregao:");
			
			for(Lote lote: lotes)
			{
				System.out.println(lote.codigo);
			}
			
			System.out.println("\nData do pregao: "+this.data_oferta);
			
			for(Lance lance: lances)
			{
				System.out.println("Codigo:"+lance.codigo);
			}
		}
	}
}
