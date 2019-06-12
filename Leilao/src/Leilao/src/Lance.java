import java.time.Instant;

public class Lance {
	private Client cliente;
	private Lote lote;
	private double valor_lance;
	private String codigo;
	private static int ID = 1;
	private Instant hora_do_lance;
	
	public Lance(Client cliente, Lote lote, double valor_lance)
	{
		if(valor_lance >= lote.getIncremento_minimo())
		{
			this.cliente = cliente;
			this.lote = lote;
			this.valor_lance = valor_lance;
			this.codigo = lote.getCodigo()+"-"+Integer.toString(ID);
			ID++;
			
		}
		else 
		{
			System.out.println("O Lance não foi efetuado, valor invalido, deve ser maior ou igual a "+lote.getIncremento_minimo()+"\n");
		}
		
	}
	public Lance() {}
	
	public void setHora_do_lance(Instant hora) {
		this.hora_do_lance = hora;
	}
	
	public Instant getHora() {
		Instant x = this.hora_do_lance;
		return x;
	}
	
	
	public Client getCliente()
	{
		Client copia = this.cliente;
		return copia;
	}
	
	public String getClienteName()
	{
		String copia = this.cliente.getName();
		return copia;
	}
	
	public double getValor_lance()
	{
		double copia = this.valor_lance;
		return copia;
	}
	
	public String getCodigo()
	{
		String copia = this.codigo;
		return copia;
	}
	
	public Lote getLote()
	{
		Lote copia = this.lote;
		return copia;
	}
	
	@Override
	public String toString()
	{
		return
		"Cliente: "+this.cliente.getName()+"("+this.cliente.getCodigo()+")"+
		"\nLote: "+this.lote.getCodigo()+
		"\nLance dado: "+Double.toString(this.valor_lance)+" Reais"+
		"\nCódigo do Lance: "+this.codigo+" \n\n"
		;
	}
}
