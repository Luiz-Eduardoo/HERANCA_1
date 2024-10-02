//classe Pessoa com os atributos comuns em todas as outras classes
	class Pessoa {
		//Atributos gerais
	 private String nome;
	 private String endereço;
	 private String email;
	 // metodo construtor para montar as caracteristicas
	 public Pessoa(String nome, String endereço, String email) {
	        this.nome = nome; // o this. serve para direcionar o metodo construtor para a variavel
	        this.endereço = endereço;
	        this.email = email;
	 }
	 // método get para acessar o atributo
	public String getNome() {
		return nome;
	}
	// método set para modificar o valor do atributo
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// metodo para retornar as informações formatadas
	public String descricao() {
		return " Nome: " + nome + "\n Endereço " + endereço + " \n E-mail: " + email;
	}
 }
	// classe PessoaFisica com os atributos específicos necessários
 	class PessoaFisica extends Pessoa { // extends para fazer a Herança dos atributos gerais colocados na classe Pessoa
 		// atributo específico
 		private String cpf;
 		// metodo construtor para montar as caracteristicas
 		public PessoaFisica(String nome, String endereço, String email, String cpf) {
 	        super(nome, endereço, email); // pega as caracteristicas do InfoComum
 	        this.cpf = cpf; // o this. serve para direcionar o metodo construtor para a variavel
 	    }
 		// método get para acessar o atributo
		public String getCpf() {
			return cpf;
		}
		// método set para modificar o valor do atributo
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
	        return super.descricao() + "\n CPF: " + cpf; // "super" para pegar as informaçoes formatadas da classe Pessoa e adicionar as informações especificas dessa classe
	    }
 	}
 	// classe PessoaJuridica com os atributos necessários
 	class PessoaJuridica extends Pessoa { // extends para fazer a Herança dos atributos gerais colocados na classe Pessoa
 		// atributo específico
 		private String cnpj;
 		// metodo construtor para montar as caracteristicas
 		public PessoaJuridica(String nome, String endereço, String email, String cnpj) {
 	        super(nome, endereço, email); // Pega as caracteristicas do InfoComum
 	        this.cnpj = cnpj; // o this. serve para direcionar o metodo construtor para a variavel
 	    }
 		// método get para acessar o atributo
		public String getCnpj() {
			return cnpj;
		}
		// método set para modificar o valor do atributo
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
	        return super.descricao() + "\n CNPJ: " + cnpj; // "super" para pegar as informaçoes formatadas da classe Pessoa e adicionar as informações especificas dessa classe
	    }
 	}
 	// classe Funcionario com os atributos específicos necessários
 	class Funcionario extends Pessoa {
 		// atributos específicos
 		private String cpf;
 		private float salario;
 		// metodo construtor para montar as caracteristicas
 		public Funcionario(String nome, String endereço, String email, String cpf, float salario) {
 	        super(nome, endereço, email); // Pega as caracteristicas do InfoComum
 	        this.cpf = cpf; // o this. serve para direcionar o metodo construtor para a variavel
 	        this.salario = salario;
 	    }
 		// método get para acessar o atributo
		public String getCpf() {
			return cpf;
		}
		// método set para modificar o valor do atributo
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		// metodo para retornar as informações formatadas
		public String descricao() {
	        return super.descricao() + "\n CPF: " + cpf + " \n Salário: " + salario; // "super" para pegar as informaçoes formatadas da classe Pessoa e adicionar as informações especificas dessa classe
	    }
 	}
public class Herança_1 {
	public static void main(String[] args) {
		// criando novo objeto dando valor aos atributos
		PessoaFisica p1 = new PessoaFisica("Marcos", "Rua Ubirajara, 932, Sorocaba", "marcospereira@outlook.com", "124.578.903.21");
		PessoaJuridica p2 = new PessoaJuridica("Luiz", "Rua Luiz Silveira, 124, Sorocaba", "luizinhovp@outlook.com", "12.345.678/0001-90");
		Funcionario p3 = new Funcionario("Pedro", "Avenida Comendador Pereira, 2112, Sorocaba", "pedrosntff@outlook.com", "432.765.098.21", 2500.75f);
		
		
		// imprimindo as informações formatadas de cada objeto
		System.out.println(p1.descricao());
		System.out.println(" ");
		System.out.println(p2.descricao());
		System.out.println(" ");
		System.out.println(p3.descricao());
		
	}
}