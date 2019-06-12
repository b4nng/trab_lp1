import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DivisaoRanking {
	private Map<Lote,String> divisao = new HashMap();
	
	public boolean estaVazia()
	{
		return divisao.isEmpty();
	}
	
	public void distribuiLote(Lance lance, String cat)
	{
		Lote lote = lance.getLote();
		this.divisao.put(lote, cat);
	}
	
	public String getCategoria(Lote lote)
	{
		return this.divisao.get(lote);
	}
	
	public Set<Lote> getLista() {
		Set<Lote> lista = this.divisao.keySet();
		return lista;
	}
}
