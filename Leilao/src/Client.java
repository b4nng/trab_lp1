import java.util.Scanner;
public class Client {
	String name;
	String adress;
	String number;
	String email;
	String codigo;
	
	static int ID = 1;
	
	public Client(String name,String adress,String number,String email)
	{
		this.name = name;
		this.adress = adress;
		this.number = number;
		this.email = email;
		this.codigo = "C"+Integer.toString(ID);
		ID++;
	}
	
	@Override
	public String toString()
	{
		return
		"Nome: "+this.name+
		"\nCodigo Cliente: "+this.codigo+
		"\nEndereço: "+this.adress+
		"\nNumero de Telefone: "+this.number+
		"\nEmail: "+this.email+" \n\n"
		;
	}
}


