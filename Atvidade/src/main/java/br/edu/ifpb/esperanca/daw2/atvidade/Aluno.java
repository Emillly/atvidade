package br.edu.ifpb.esperanca.daw2.atvidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Aluno implements Identificavel {
	
	@Id
	@GeneratedValue (generator="Aluno_seq" , strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="Aluno_seq")
	private Long id;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	private int cpf_aluno;
	
	private String nome;
	private int idade;
	private String serie;
	
	public int getCpf_aluno() {
		return cpf_aluno;
	}
	
	public void setCpf_aluno(int cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
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
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	

}
