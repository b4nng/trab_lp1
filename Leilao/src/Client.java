import java.util.Scanner;
public class Client {
	String name;
	String adress;
	String number;
	String email;
	
	public Client()
	{}
	
	public Client(String name,String adress,String number,String email)
	{
		this.name = name;
		this.adress = adress;
		this.number = number;
		this.email = email;
	}
	
	@Override
	public String toString()
	{
		return
		"Nome: "+this.name+
		"\nEndereço: "+this.adress+
		"\nNumero de Telefone: "+this.number+
		"\nEmail: "+this.email
		;
	}
}


