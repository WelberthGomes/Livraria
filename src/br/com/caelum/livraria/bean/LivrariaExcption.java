package br.com.caelum.livraria.bean;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class LivrariaExcption extends Exception {


}
