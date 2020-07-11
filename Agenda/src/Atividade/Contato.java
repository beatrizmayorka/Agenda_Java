package Atividade;

public class Contato {
	  
	private String nome;
	private String telefone;

		public Contato(String nome, String telefone) {
			this.setNome(nome);
			this.setTelefone(telefone);
		}

		public String getNome() {
			return this.nome;
		}

		public String getTelefone() {
			return this.telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
}