package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.modelo.Livro;


@Stateless
public class LivroDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Livro livro) {
		manager.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		
		return manager.createQuery("Select l from Livro l", Livro.class).getResultList();
		
	}

	public List<Livro> getLivrosPeloNome(String nome) {
		
		TypedQuery<Livro> query = this.manager.createQuery("SELECT L from Livro WHERE L.titulo like  :pTitulo", Livro.class);
		 	query.setParameter("pTitulo","%"+ nome +"%");
		
		return query.getResultList();
	}
	
}
