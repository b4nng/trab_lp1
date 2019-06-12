
public final class Imovel extends Lote{
	private String adress;
	private double valorAvaliado;
	
	public Imovel(double val_ini, double inc_min, String resumo, String adress, double valorAvaliado)
	{
		super(val_ini, inc_min, resumo);
		this.adress = adress;
		this.valorAvaliado = valorAvaliado;
	}
	
	public String getAddress()
	{
		String copia = this.adress;
		return copia;
	}
	
	public double getValorAvaliado()
	{
		double copia = this.valorAvaliado;
		return copia;
	}
	
	@Override
	public String toString()
	{
		return
				"\nEndereço do Imovel: "+this.adress+
				"\nValor Avaliado: "+this.valorAvaliado+
				"\nResumo deste Lote: "+super.getResumo()+
				"\nValor Inicial "+super.getValor_inicial()+" Reais"+
				"\nLance Minimo: "+super.getIncremento_minimo()+" Reais"+
				"\nCodigo Lote: "+super.getCodigo()+" \n\n"		
				;
	}
	
}
