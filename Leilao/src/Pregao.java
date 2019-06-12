import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

public class Pregao {
	private String data_oferta; 			// A data que se iniciara o pregao
	private boolean situacao; 				// Caso esteja TRUE: pregao aberto a lances / Caso esteja FALSE: pregao fechado a lances
	private ArrayList<Lance> lances; 		// Os lances ficarao armazenados nessa array
	private Lance higher_lance; 			// O lance de maior valor (que virá da array "lances")
	private int tam_lances; 				// Quantos lances cabem dentro desde pregão
	private Instant hora_inicio; 			// Define o momento em que o pregao foi instanciado (iniciado)
	
	public Pregao(String data_oferta, int qtd_lances)
	{
		this.data_oferta = data_oferta;
		this.situacao = true;
		this.tam_lances = qtd_lances;
		this.lances = new ArrayList<Lance>();
		this.higher_lance = new Lance();
	}

	public void ordemCrescente()
	{
		CriterioLanceCresc criterioPreco = new CriterioLanceCresc();
		Collections.sort(this.lances,criterioPreco);
	}
	
	public void iniciaPregao() { 			//Inicia ou reinicia o tempo do pregao
		if(!this.situacao) {this.situacao = true;}
		this.hora_inicio = Instant.now();
	}
	
	public Lance getHigher_lance(){
		Lance x = this.higher_lance;
		return x;
	}
	
	public boolean Situacao() {
		boolean x = this.situacao;
		return x;
	}
	
	public boolean isEmpty() {
		return this.lances.isEmpty();
	}
	
	public void fechaPregao() {
		this.situacao = false;
	}
	
	public Instant getHora_inicio(){
		Instant i = this.hora_inicio;
		return  i;
	}
	
	public void ordemDecrescente()
	{
		CriterioLanceDecresc criterioPreco = new CriterioLanceDecresc();
		Collections.sort(this.lances,criterioPreco);
	}
	
	public void ordemAlfabetica()
	{
		CriterioAlfabetico criterioAlfa = new CriterioAlfabetico();
		Collections.sort(this.lances,criterioAlfa);
	}
	
	public void adicionaLance(Lance ln) throws PregaoFechadoException //Adiciona um lance no pregao, dentro da arraylist lances
	{
		if(this.situacao && this.lances.size() < this.tam_lances) {

            this.lances.add(ln);

            if(this.higher_lance.getValor_lance() < ln.getValor_lance()) {
                this.higher_lance = ln;
            }

            if(this.lances.size() == this.tam_lances){
                this.situacao = false;
            }
		}
		else {
            	throw new PregaoFechadoException("Pregão fechado");
            }

        
	}

	
	public void relatorio()
	{
			System.out.println("\nDados do Pregao:");
			
			if(situacao)
			{
				System.out.println("ABERTO para lances");
			}
			
			else {System.out.println("FECHADO para lances");}
			
			
			System.out.println("\nData do pregao: "+this.data_oferta);
			System.out.println("\nLances do Pregao:\n");
			for(Lance l: lances)
			{
				System.out.println(l.toString());
			}
	}
}
