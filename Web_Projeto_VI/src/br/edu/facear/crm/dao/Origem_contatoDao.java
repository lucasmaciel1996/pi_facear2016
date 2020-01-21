package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Origem_contato;

public class Origem_contatoDao implements InterfaceDao<Origem_contato> {

	@Override
	public void Salvar(Origem_contato origem_contato) {
		// TODO Auto-generated method stub
EntityManager em = Conexao.getEntityManager();
		
            em.getTransaction().begin();
            em.persist(origem_contato);
            em.getTransaction().commit();
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Origem_contato> listar() {
		// TODO Auto-generated method stub
		
		EntityManager em = Conexao.getEntityManager();

		Query q = em.createQuery("select a from Origem_contato a ");
		
		return q.getResultList();
		
	}

	@Override
	public void editar(Origem_contato origem_contato) {
		// TODO Auto-generated method stub
		
		 EntityManager em = Conexao.getEntityManager();
			
			em.getTransaction().begin();
			em.merge(origem_contato);//faz o editar//
			
			em.getTransaction().commit();
	}

	@Override
	public Origem_contato getObjectById(Long id) {
		// TODO Auto-generated method stub
	
         EntityManager em = Conexao.getEntityManager();
		
		   return em.find(Origem_contato.class,id);
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
		
		EntityManager origem_cont = Conexao.getEntityManager();
		try {
			origem_cont.getTransaction().begin();
			Origem_contato obj = origem_cont.find(Origem_contato.class,id);
			origem_cont.remove(obj);
			origem_cont.getTransaction().commit();
		} finally {
			origem_cont.close();
		}
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Origem_contato origem_contato = em.find(Origem_contato.class, id);
		
		em.getTransaction().begin();
		em.remove(origem_contato);		
		em.getTransaction().commit();
		
	}

	@Override
	public void voltar(Origem_contato origem_contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Origem_contato origem_contato) {
		// TODO Auto-generated method stub
		
	}
}
