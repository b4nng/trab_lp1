import java.util.Scanner;
public class Cliente {
	String name;
	String adress;
	double number;
	String email;
	
	void insert()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Nome: ");
		this.name = input.next();
		
		System.out.println("Endereço: ");
		this.adress = input.next();
		
		System.out.println("Numero: ");
		this.number = input.nextDouble();
		
		System.out.println("email: ");
		this.email = input.next();
	}
}


