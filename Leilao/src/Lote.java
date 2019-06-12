abstract class Lote {
	private double valor_inicial; // Valor que o lote se iniciará
	private double incremento_minimo; // O valor mínimo de cada lance
	private String resumo; // Um resumo da situação do lote, como ele é e suas informações gerais
	private boolean situacao; // Caso esteja TRUE: lote aberto / Caso esteja FALSE: lote fechado
	private String codigo; // Codigo unico de cada lote
	private static int ID = 1;
	
	public Lote(double val_ini, double inc_min, String resumo)
	{
		this.valor_inicial = val_ini;
		this.incremento_minimo = inc_min;
		this.resumo = resumo; // Caso esteja TRUE: lote aberto / Caso esteja FALSE: lote fechado
		this.situacao = true;
		this.codigo = "L"+Integer.toString(ID);
		ID++;
	}
	
	public void swSituacao()
	{
		if(this.situacao) {
			this.situacao = false;
		}else {
			this.situacao = true;
		}
	}

	public double getIncremento_minimo()
	{
		double copia = this.incremento_minimo;
		return copia;
	}
	
	public double getValor_inicial()
	{
		double copia = this.valor_inicial;
		return copia;
	}
	
	public String getResumo()
	{
		String copia = this.resumo;
		return copia;
	}
	
	public String getCodigo()
	{
		String copia = this.codigo;
		return copia;
	}
	
	public boolean getSituacao()
	{
		boolean copia = this.situacao;
		return copia;
	}
	
	@Override 
	public String toString()
	{
		return
		"\nResumo deste Lote: "+this.resumo+
		"\nValor Inicial "+this.valor_inicial+" Reais"+
		"\nLance Minimo: "+this.incremento_minimo+" Reais"+
		"\nCodigo Lote: "+this.codigo+" \n\n"		
		;
	}
}

