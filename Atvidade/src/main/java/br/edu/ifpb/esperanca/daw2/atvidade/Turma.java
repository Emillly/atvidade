package br.edu.ifpb.esperanca.daw2.atvidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Turma 	implements Identificavel {
	
	@Id
	@GeneratedValue (generator="Turma_seq" , strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="Turma_seq")
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
	
	private int id_turma;
	private String descricao;
	private int n_alunos;
	
	
	public int getId_turma() {
		return id_turma;
	}
	
	public void setId_turma (int id_turma) {
		this.id_turma = id_turma;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getN_alunos() {
		return n_alunos;
	}
	public void setN_alunos(int n_alunos) {
		this.n_alunos = n_alunos;
	}
		
}
	
	
	


