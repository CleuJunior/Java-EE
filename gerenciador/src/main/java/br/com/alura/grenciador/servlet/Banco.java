package br.com.alura.grenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresaA = new Empresa();
		empresaA.setId(Banco.chaveSequencial++);
		empresaA.setNome("Empresa A");
		
		Empresa empresaB = new Empresa();
		empresaB.setId(Banco.chaveSequencial++);
		empresaB.setNome("Empresa B");
		
		lista.add(empresaA);
		lista.add(empresaB);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas()
	{
		for (Empresa empresa : lista) {
			System.out.println(empresa);
		}
		System.out.println();
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) { 

	    Iterator<Empresa> it = lista.iterator();

	    while(it.hasNext()) { 
	        Empresa emp = it.next();

	        if(emp.getId() == id ) {
	            it.remove();
	        }
	    }
	}
	
}
