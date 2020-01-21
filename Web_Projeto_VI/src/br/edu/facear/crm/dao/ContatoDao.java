package br.edu.facear.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.crm.entity.Contato;


public class ContatoDao implements InterfaceDao <Contato>{



@Override
public void Salvar(Contato contato) {
	// TODO Auto-generated method stub
	EntityManager em = Conexao.getEntityManager();
	
    em.getTransaction().begin();
    em.persist(contato);
    em.getTransaction().commit();
}

@SuppressWarnings("unchecked")
@Override
public List<Contato> listar() {
	// TODO Auto-generated method stub
	EntityManager em = Conexao.getEntityManager();
	
	  Query q = em.createQuery("select a from Tipo_contato a ");
	
	  return q.getResultList();

}

@Override
public void editar(Contato contato) {
	// TODO Auto-generated method stub
	EntityManager em = Conexao.getEntityManager();
	em.getTransaction().begin();
	em.merge(contato);
	em.getTransaction().commit();
}

@Override
public void excluir(Long id) {
	// TODO Auto-generated method stub
	EntityManager em = Conexao.getEntityManager();
	Contato contato = em.find(Contato.class, id);
	
	em.getTransaction().begin();
	em.remove(contato);		
	em.getTransaction().commit();
}

@Override
public Contato getObjectById(Long id) {
	// TODO Auto-generated method stub
	 EntityManager em= Conexao.getEntityManager();
		
		return em.find(Contato.class,id);
}

@Override
public void deletar(Long id) {
	// TODO Auto-generated method stub
	
}

@Override
public void voltar(Contato contato) {
	// TODO Auto-generated method stub
	
}

@Override
public void novo(Contato contato) {
	// TODO Auto-generated method stub
	
}
}
