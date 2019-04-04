import java.util.ArrayList;

public class Pregao {
	private ArrayList<Lote> lotes;
	private String data_oferta;
	private boolean situacao;
	private ArrayList<Lance> lances;
	private Lance higher_lance;
	private int tam_lotes;
	private int tam_lances;
	
	public Pregao(int quantidade_lotes, String data_oferta, boolean situacao, int qtd_lances)
	{
		this.data_oferta = data_oferta;
		this.lotes = new ArrayList<Lote>();
		this.situacao = situacao;
		this.tam_lotes = quantidade_lotes;
		this.tam_lances = qtd_lances;
		this.lances = new ArrayList<Lance>();
		this.higher_lance = new Lance();
	}
	
	public void addLote(Lote lote)
	{
		if(this.lotes.size() < tam_lotes) 
		{
			lotes.add(lote);
			System.out.println("\nLote Registrado");
		}
		else
		{
			System.out.println("\nSem mais espaco para lote neste pregao, num max de"+ tam_lotes +" atingido");
		}
	}
	
	public boolean searchLote(Lote l)
	{
		return lotes.contains(l);
			
	}
	
	public boolean confereEspaco()
	{
		if(this.lotes.size() < tam_lotes)
		{
			System.out.println("Você ainda não preencheu todos os espaços de lote! ("+tam_lotes+")");
			return false;
		}
		else {return true;}
	}
	
	public void darLance(Lance lance)
	{
		if(searchLote(lance.getLote())) {
			for (int i=0; i < lances.size(); i++)
			{
				if(lances.get(i) == null)
				{
					lances.add(lance);
					System.out.println("\nLance Registrado");
					if(lance.getValor_lance() > higher_lance.getValor_lance())
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
				System.out.println(lote.getCodigo());
			}
			
			System.out.println("\nData do pregao: "+this.data_oferta);
			
			for(Lance lance: lances)
			{
				System.out.println("Codigo:"+lance.getCodigo());
			}
		}
	}
}
