import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DivisaoRanking {
	private Map<Lote, Lance> divisao = new HashMap();
	
	public boolean estaVazia()
	{
		return divisao.isEmpty();
	}
	
	public void distribuiLote(Lote lote, Lance lance)
	{
		this.divisao.put(lote, lance);
	}
	
	public Lance getLance(Lote lote)
	{
		return this.divisao.get(lote);
	}
}
