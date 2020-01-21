package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.facear.crm.entity.Funcionario;

public class FuncionarioDao implements InterfaceDao<Funcionario>{

	@Override
	public void Salvar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
      EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
	em.persist(funcionario);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Funcionario> listar() {
		// TODO Auto-generated method stub
		
		EntityManager func = Conexao.getEntityManager();

		Query q = func.createQuery("select a from Funcionario a ");
		
		return q.getResultList();
	
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
		 EntityManager func = Conexao.getEntityManager();
			
			func.getTransaction().begin();
			func.merge(funcionario);//faz o editar//
			
			func.getTransaction().commit();
		
		
	}

	@Override
	public Funcionario getObjectById(Long id) {
		// TODO Auto-generated method stub
		
        EntityManager func = Conexao.getEntityManager();
		
		return func.find(Funcionario.class,id);
	}

	@Override
	public void deletar (Long id) {
		// TODO Auto-generated method stub
		
		EntityManager func = Conexao.getEntityManager();
		try {
			func.getTransaction().begin();
			Funcionario obj = func.find(Funcionario.class,id);
			func.remove(obj);
			func.getTransaction().commit();
		} finally {
			func.close();
		}
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Funcionario funcionario = em.find(Funcionario.class, id);
		
		em.getTransaction().begin();
		em.remove(funcionario);		
		em.getTransaction().commit();
	}

	@Override
	public void voltar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
