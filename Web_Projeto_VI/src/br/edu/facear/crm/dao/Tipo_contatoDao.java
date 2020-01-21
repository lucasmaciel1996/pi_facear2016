package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Tipo_contato;

public class Tipo_contatoDao implements InterfaceDao <Tipo_contato>{

	@Override
	public void Salvar(Tipo_contato tipo_contato) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		
        em.getTransaction().begin();
        em.persist(tipo_contato);
        em.getTransaction().commit();
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo_contato> listar() {
		// TODO Auto-generated method stub
         EntityManager em = Conexao.getEntityManager();
		
		  Query q = em.createQuery("select a from Tipo_contato a ");
		
		  return q.getResultList();
		
	}

	@Override
	public void editar(Tipo_contato tipo_contato) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(tipo_contato);
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Tipo_contato tipo_contato = em.find(Tipo_contato.class, id);
		
		em.getTransaction().begin();
		em.remove(tipo_contato);		
		em.getTransaction().commit();
	}

	@Override
	public Tipo_contato getObjectById(Long id) {
		// TODO Auto-generated method stub
		 EntityManager em= Conexao.getEntityManager();
			
			return em.find(Tipo_contato.class,id);
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar(Tipo_contato tipo_contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Tipo_contato tipo_contato) {
		// TODO Auto-generated method stub
		
	}
}
	


