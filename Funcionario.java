public class Funcionario {

	String nome,senha, sexo, celular, endereco, complemento, bairro, cidade, cep;
	int id;

	Funcionario (String nome, int id, String sexo, String celular, String endereco, String complemento, String bairro, String cidade, String cep) {

		this.nome = nome;
		this.id = id;
		this.sexo = sexo;
		this.celular = celular;
		this.endereco = endereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}


	Funcionario (String nome, int id, String sexo, String celular,String endereco, String bairro, String cidade, String cep) {

		this.nome = nome;
		this.id = id;
		this.sexo = sexo;
		this.celular = celular;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	void setNome (String nome) {
		this.nome = nome;
	}

	String getNome() {
		return this.nome;
	}

	void setID (int id) {
		this.id = id;
	}

	int getID() {
		return this.id;
	}

	void setCelular (String celular) {
		this.celular = celular;
	}

	String getCelular() {
		return this.celular;
	}

	void setEndereco(String endereco, String complemento) {
		this.endereco = endereco;
		this.complemento = complemento;
	}

	String getEndereco() {
		return this.endereco + ", " + this.complemento + " - " + this.bairro + " - " + this.cidade + " - CEP: " + this.cep;
	}

	void setBairro (String bairro) {
		this.bairro = bairro;
	}

	void setCidade(String cidade) {
		this.cidade = cidade;
	}

	void setCEP (String cep) {
		this.cep = cep
	}

	void setSenha(String senha) {
		this.senha = senha;
	}
}