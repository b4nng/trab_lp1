
public class Lote {
	private double valor_inicial;
	private double incremento_minimo;
	private String resumo;
	private boolean situacao;
	private double kmtragem;
	private String marca;
	private String modelo;
	private float fab_ano;
	private String codigo;
	private static int ID = 1;
	
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

	public double getIncremento_minimo()
	{
		double copia = this.incremento_minimo;
		return copia;
	}
	
	public String getCodigo()
	{
		String copia = this.codigo;
		return copia;
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

