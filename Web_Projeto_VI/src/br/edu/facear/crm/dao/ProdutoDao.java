package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Produto;

public class ProdutoDao implements InterfaceDao <Produto>{

	@Override
	public void Salvar(Produto produto) {
	EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		
		
	}

	
	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
	
		 EntityManager em = Conexao.getEntityManager();

			Query q = em.createQuery("select a from Produto a ");
			
			return q.getResultList();
		
	}

	@Override
	public void editar(Produto produto) {
		// TODO Auto-generated method stub
		
		
	      EntityManager em = Conexao.getEntityManager();
			
			em.getTransaction().begin();
			em.merge(produto);//faz o editar//
			
			em.getTransaction().commit();
	}

	@Override
	public Produto getObjectById(Long id) {
		// TODO Auto-generated method stub
		
EntityManager em = Conexao.getEntityManager();
		
		return em.find(Produto.class,id);
		
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
		
		EntityManager em = Conexao.getEntityManager();
		try {
			em.getTransaction().begin();
			Produto obj = em.find(Produto.class,id);
			em.remove(obj);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
		
	}


	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
		EntityManager pr = Conexao.getEntityManager();
		Produto produto = pr.find(Produto.class, id);
		
		pr.getTransaction().begin();
		pr.remove(produto);		
		pr.getTransaction().commit();
		
	}

	@Override
	public void voltar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Produto produto) {
		// TODO Auto-generated method stub
		
	}




		
	
}
