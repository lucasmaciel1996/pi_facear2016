package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Tarefa;

public class TarefaDao  {

	public void Salvar(Tarefa tarefa) {
	//  System.out.print("DAO");
		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.persist(tarefa);
		em.getTransaction().commit();
		//System.out.print("FIM");
	}

	
	public List<Tarefa> listar() {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		Query q = em.createQuery("select a from Tarefa a ");

		return q.getResultList();

	}


	public void editar(Tarefa tarefa) {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.merge(tarefa);// faz o editar//

		em.getTransaction().commit();
	}


	public Tarefa getObjectById(Long id) {
		// TODO Auto-generated method stub

		EntityManager tarefa = Conexao.getEntityManager();

		return tarefa.find(Tarefa.class, id);

	}


	public void deletar(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		try {
			em.getTransaction().begin();
			Tarefa obj = em.find(Tarefa.class, id);
			em.remove(obj);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}


	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Tarefa tarefa = em.find(Tarefa.class, id);

		em.getTransaction().begin();
		em.remove(tarefa);
		em.getTransaction().commit();

	}

	

}
