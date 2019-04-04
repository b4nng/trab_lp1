
public class Lote {
	double valor_inicial;
	double incremento_minimo;
	String resumo;
	boolean situacao;
	double kmtragem;
	String marca;
	String modelo;
	float fab_ano;
	String codigo;
	static int ID = 1;
	
	public Lote(double val_ini, double inc_min, String resumo, double km, String marca, String modelo, float fab_ano)
	{
		this.valor_inicial = val_ini;
		this.incremento_minimo = inc_min;
		this.resumo = resumo;
		this.kmtragem = km;
		this.marca = marca;
		this.modelo = modelo;
		this.fab_ano = fab_ano;
		this.situacao = true;
		this.codigo = "L"+Integer.toString(ID);
		ID++;
	}

	@Override 
	public String toString()
	{
		return
		"Marca do Carro: "+this.marca+
		"\nModelo: "+this.modelo+
		"\nQuilometragem: "+this.kmtragem+
		"\nAno de Fab: "+this.fab_ano+
		"\nResumo deste Lote: "+this.resumo+
		"\nValor Inicial "+this.valor_inicial+" Reais"+
		"\nLance Minimo: "+this.incremento_minimo+" Reais"+
		"\nCodigo Lote: "+this.codigo+" \n\n"		
		;
	}
}

