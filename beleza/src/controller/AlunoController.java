package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Aluno;
import business.AlunoBusiness;

@ManagedBean
@RequestScoped
public class AlunoController {
	
	@EJB
	AlunoBusiness alunoBusiness;
	
	List<Aluno> alunos = new ArrayList<Aluno>();
		
	private Aluno aluno = new Aluno();
	
	public String prepareAdd(){
		return "form?faces-redirect=true";
	}
	
	public String add(){
		alunoBusiness.save(this.aluno);
		return "list";
	}
	
	public List<Aluno> list(){
		return alunos = alunoBusiness.list();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
