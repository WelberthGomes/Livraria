package br.com.caelum.livraria.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {
	
	@Inject
	AutorDao autorDao;
	
	public void adiciona(Autor autor) throws LivrariaExcption {
		autorDao.salva(autor);
		
		//throw new LivrariaExcption();
	}
	

	public List<Autor> getAutores() {
		return this.autorDao.todosAutores();
	}

}
