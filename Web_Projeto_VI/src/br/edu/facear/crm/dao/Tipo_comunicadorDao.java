package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.facear.crm.entity.Tipo_comunicador;
public class Tipo_comunicadorDao implements InterfaceDao<Tipo_comunicador>{

	@Override
	public void Salvar(Tipo_comunicador tipo_comunicador) {
		// TODO Auto-generated method stub
        EntityManager em = Conexao.getEntityManager();
		
           em.getTransaction().begin();
           em.persist(tipo_comunicador);
           em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tipo_comunicador> listar() {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		
		Query q = em.createQuery("select a from Tipo_comunicador a ");
		
		return q.getResultList();
		
	}

	@Override
	public void editar(Tipo_comunicador tipo_comunicador) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(tipo_comunicador);
		em.getTransaction().commit();
		
	}

	@Override
	public Tipo_comunicador getObjectById(Long id) {
		// TODO Auto-generated method stub
        EntityManager em= Conexao.getEntityManager();
		
		return em.find(Tipo_comunicador.class,id);
			
	}



	@Override
	public void excluir(Long id) {
		EntityManager em = Conexao.getEntityManager();
		Tipo_comunicador tipo_comunicador = em.find(Tipo_comunicador.class, id);
		
		em.getTransaction().begin();
		em.remove(tipo_comunicador);		
		em.getTransaction().commit();
	}
	

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
			
			EntityManager em = Conexao.getEntityManager();
			try {
				em.getTransaction().begin();
				Tipo_comunicador obj = em.find(Tipo_comunicador.class,id);
				em.remove(obj);
				em.getTransaction().commit();
			} finally {
				em.close();
			}
	}

	@Override
	public void voltar(Tipo_comunicador tipo_comunicador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novo(Tipo_comunicador tipo_comunicador) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
