package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class LogInterceptador {
	
	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception {
		
		long millis = System.currentTimeMillis();

		Object o = context.proceed();

	    System.out.println("Tempo gasto:  " + (System.currentTimeMillis() - millis));
	    
	    System.out.println("Nome da Classe " + context.getTarget().getClass().getSimpleName());
	    System.out.println("Nome do metodo "+context.getMethod().getName()); 
	     
	    return o;
	    
	}
}
