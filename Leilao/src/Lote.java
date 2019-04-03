import java.util.Scanner;

public class Lote {
	double valor_inicial;
	double incremento_minimo;
	String resumo;
	boolean situacao;
	double kmtragem;
	String marca;
	String modelo;
	float fab_ano;
	
	void insert(Lote ins)
	{
		//ins = new Lote();
		Scanner input = new Scanner(System.in);
		System.out.println("Marca do carro: ");
		ins.marca = input.next();
		
		System.out.println("Modelo do carro: ");
		ins.modelo = input.next();
		
		System.out.println("Data de fabricação do carro(MM,AAAA): ");
		ins.fab_ano = input.nextFloat();
		
		System.out.println("Quilometragem: ");
		ins.kmtragem = input.nextDouble();
		
		System.out.println("Resumo deste lote: ");
		ins.resumo = input.next();
		
		System.out.println("Valor inicial: ");
		ins.valor_inicial = input.nextDouble();
		
		System.out.println("Lance mínimo: ");
		ins.incremento_minimo = input.nextDouble();
	}
}

