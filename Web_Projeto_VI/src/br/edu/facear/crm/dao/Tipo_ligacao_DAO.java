package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Historico_ligacao;
import br.edu.facear.crm.entity.Tipo_ligacao;

public class Tipo_ligacao_DAO {

	public void Salvar(Tipo_ligacao tp_ligacao) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.persist(tp_ligacao);
		em.getTransaction().commit();

	}


	public List<Tipo_ligacao> listar() {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		Query q = em.createQuery("select a from Tipo_ligacao a ");

		return q.getResultList();

	}


	public void editar(Tipo_ligacao tp_ligacao) {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.merge( tp_ligacao);// faz o editar//

		em.getTransaction().commit();
	}
	
	public Tipo_ligacao getObjectById(Long id) {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		return em.find(Tipo_ligacao .class, id);
	}



	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Tipo_ligacao tp_ligacao = em.find(Tipo_ligacao .class, id);

		em.getTransaction().begin();
		em.remove(tp_ligacao);
		em.getTransaction().commit();

	


	}


}
