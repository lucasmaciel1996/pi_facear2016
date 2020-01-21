package br.edu.facear.crm.dao;

import java.util.List;

public interface InterfaceDao <T> {
	
	public void Salvar (T t);
	
	public List<T> listar ();
	 
	public void editar (T t);
	
	public void excluir (Long id);
	  
	public T getObjectById(Long id);
	  
	public void deletar (Long id);
	
	public void voltar (T t);
	
	public void novo (T t);
	  

}
