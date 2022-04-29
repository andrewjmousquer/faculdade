package GeteSetname;
// Clase Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
// a classe Account com un construtor que inicializa o nome;

public class Account {
	
	private String name; //variável de instância
	
	//O construtor inicializa name com nome do parâmetro
	public Account(String name) // o nome do construtor é nome da classe
	{
		this.name = name;
	}

	//método para configurar o nome
	public void setName(String name) {
		
		this.name = name; // armazena o nome
	}
	
	//método para recuperar o nome do objeto
	public String getName() 
	{
		return name; //retorna valor do nome para o chamador
	}

} // fim da classe Account
