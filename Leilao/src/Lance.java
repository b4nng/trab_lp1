
public class Lance {
	Client cliente;
	Lote lote;
	double valor_lance;
	String codigo;
	static int ID = 1;
	
	public Lance(Client cliente, Lote lote, double valor_lance)
	{
		if(valor_lance >= lote.incremento_minimo)
		{
			this.cliente = cliente;
			this.lote = lote;
			this.valor_lance = valor_lance;
			this.codigo = lote.codigo+"-"+Integer.toString(ID);
			ID++;
		}
		else 
		{
			System.out.println("O Lance não foi efetuado, valor invalido, deve ser maior ou igual a "+lote.incremento_minimo+"\n");
		}
		
	}
	public Lance() {}
	
	@Override
	public String toString()
	{
		return
		"Cliente: "+this.cliente.name+"("+this.cliente.codigo+")"+
		"\nLote: "+this.lote.codigo+
		"\nLance dado: "+Double.toString(this.valor_lance)+" Reais"+
		"\nCódigo do Lance: "+this.codigo+" \n\n"
		;
	}
}
