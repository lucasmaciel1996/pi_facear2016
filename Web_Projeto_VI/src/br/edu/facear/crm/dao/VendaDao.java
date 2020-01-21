package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Venda;

public class VendaDao implements InterfaceDao<Venda>{

	@Override
	public void Salvar(Venda venda) {
		// TODO Auto-generated method stub
		
EntityManager vd = Conexao.getEntityManager();
		
		vd.getTransaction().begin();
		vd.persist(venda);
		vd.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Venda> listar() {
		// TODO Auto-generated method stub
		
		EntityManager vd = Conexao.getEntityManager();

		Query q = vd.createQuery("select a from Venda a ");
		
		return q.getResultList();
		
	
	}

	@Override
	public void editar(Venda venda) {
		// TODO Auto-generated method stub
		
		EntityManager vd = Conexao.getEntityManager();
		
		vd.getTransaction().begin();
		vd.merge(venda);//faz o editar//
		
		vd.getTransaction().commit();
		
	}

	@Override
	public Venda getObjectById(Long id) {
		
		
         EntityManager vd = Conexao.getEntityManager();
		
		  return vd.find(Venda.class,id);
		
	
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
		
		EntityManager vd = Conexao.getEntityManager();
		try {
			vd.getTransaction().begin();
			VendaDao obj = vd.find(VendaDao.class,id);
			vd.remove(obj);
			vd.getTransaction().commit();
		} finally {
			vd.close();
		}
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager vd = Conexao.getEntityManager();
		Venda venda = vd.find(Venda.class, id);
		
		vd.getTransaction().begin();
		vd.remove(venda);		
		vd.getTransaction().commit();
		
		
	}

	@Override
	public void voltar(Venda venda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Venda venda) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
