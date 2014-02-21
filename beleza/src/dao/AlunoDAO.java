package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.Aluno;

@Stateless
public class AlunoDAO {
	@PersistenceContext
	private EntityManager manager;
	
	
	
	public void save(Aluno aluno){
		manager.persist(aluno);
	}
	
	public List<Aluno> list(){
		Query query = manager.createQuery("select a from Aluno a");
		return (List<Aluno>) query.getResultList();
	}
}
