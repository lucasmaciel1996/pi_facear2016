package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Historico_ligacao;
import br.edu.facear.crm.entity.Origem_contato;

public class Historico_Ligacao_Dao {

	
	public void Salvar(Historico_ligacao historico) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.persist(historico);
		em.getTransaction().commit();

	}


	public List<Historico_ligacao > listar() {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		Query q = em.createQuery("select a from Historico_ligacao a ");

		return q.getResultList();

	}


	public void editar(Historico_ligacao historico) {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		em.getTransaction().begin();
		em.merge(historico);// faz o editar//

		em.getTransaction().commit();
	}
	public Historico_ligacao getObjectById(Long id) {
		// TODO Auto-generated method stub

		EntityManager em = Conexao.getEntityManager();

		return em.find(Historico_ligacao .class, id);
	}



	public void excluir(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = Conexao.getEntityManager();
		Historico_ligacao historico = em.find(Historico_ligacao.class, id);

		em.getTransaction().begin();
		em.remove(historico);
		em.getTransaction().commit();

	


	}

}
