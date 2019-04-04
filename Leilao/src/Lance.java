
public class Lance {
	Client cliente;
	Lote lote;
	double valor_lance;
	String codigo;
	static int ID = 1;
	
	public Lance(Client cliente, Lote lote, double valor_lance)
	{
		this.cliente = cliente;
		this.lote = lote;
		this.valor_lance = valor_lance;
		this.codigo = lote.codigo+"-"+Integer.toString(ID);
		ID++;
	}
	
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
