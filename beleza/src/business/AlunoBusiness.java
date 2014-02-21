package business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import model.Aluno;
import dao.AlunoDAO;

@Stateless
public class AlunoBusiness {
	
	@EJB
	AlunoDAO alunoDAO; 
	
	public void save(Aluno aluno){
		alunoDAO.save(aluno);
	}
	
	public List<Aluno> list(){
		return alunoDAO.list();
	}
	
}
