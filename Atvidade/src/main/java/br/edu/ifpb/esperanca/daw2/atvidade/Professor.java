package br.edu.ifpb.esperanca.daw2.atvidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Professor implements Identificavel {
	
	@Id
	@GeneratedValue(generator="disciplina_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="disciplina_seq")
	private Long id_cpf;
	
	private String nome;
	private int idade;
	private String username; 
	private String password;
	private String grupo;
	
	@Override
	public Long getId() {
		return id_cpf;
	}
	
	@Override
	public void setId(Long id) {
		this.id_cpf = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	

}
