
public final class Automovel extends Lote{
	private double kmtragem;
	private String marca;
	private String modelo;
	private float fab_ano;
	
	
	//           k = kmtragem / m = modelo / mod = modelo / fab_ano = fab_ano
	public Automovel(double val_ini, double inc_min, String resumo, double k, String m, String mod, float fab_ano)
	{
		super(val_ini, inc_min, resumo);
		this.kmtragem = k;
		this.marca = m;
		this.modelo = mod;
		this.fab_ano = fab_ano;
	}
	
	@Override
	public String toString()
	{
		return
				"\nMarca do carro: "+this.marca+
				"\nModelo: "+this.modelo+
				"\nQuilometragem"+this.kmtragem+
				"\nAno: "+this.fab_ano+
				"\nResumo deste Lote: "+super.getResumo()+
				"\nValor Inicial "+super.getValor_inicial()+" Reais"+
				"\nLance Minimo: "+super.getIncremento_minimo()+" Reais"+
				"\nCodigo Lote: "+super.getCodigo()+" \n\n"		
				;
	}
}
