package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Produtos_venda;

public class Produtos_vendaDao implements InterfaceDao<Produtos_venda> {

	@Override
	public void Salvar(Produtos_venda produtos_venda) {
		// TODO Auto-generated method stub
		System.out.println("AQUI--" +produtos_venda);
        EntityManager em = Conexao.getEntityManager();
		
             em.getTransaction().begin();
             em.persist(produtos_venda);
             em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produtos_venda> listar() {
		// TODO Auto-generated method stub
		   EntityManager em = Conexao.getEntityManager();

			Query q = em.createQuery("select a from Produtos_venda a ");
			
			return q.getResultList();
	}

	@Override
	public void editar(Produtos_venda produtos_venda) {
		// TODO Auto-generated method stub
        EntityManager em = Conexao.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(produtos_venda);//faz o editar//
		
		em.getTransaction().commit();
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Produtos_venda produtos_venda = em.find(Produtos_venda.class, id);
		
		em.getTransaction().begin();
		em.remove(produtos_venda);		
		em.getTransaction().commit();
		
	}

	@Override
	public Produtos_venda getObjectById(Long id) {
		// TODO Auto-generated method stub
        EntityManager em = Conexao.getEntityManager();
		
		return em.find(Produtos_venda.class,id);
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar(Produtos_venda produtos_venda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Produtos_venda produtos_venda) {
		// TODO Auto-generated method stub
		
	}

}
