package br.edu.ifpb.esperanca.daw2.atvidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Disciplina implements Identificavel {

	
	@Id
	@GeneratedValue (generator="Disciplina_seq" , strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="Disciplina_seq")
	private Long id;
	
	private String Alunos;
	private String Turma;
	private String Professores;
	
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlunos() {
		return Alunos;
	}
	public void setAlunos(String alunos) {
		Alunos = alunos;
	}
	public String getTurma() {
		return Turma;
	}
	public void setTurma(String turma) {
		Turma = turma;
	}
	public String getProfessores() {
		return Professores;
	}
	public void setProfessores(String professores) {
		Professores = professores;
	}
}
