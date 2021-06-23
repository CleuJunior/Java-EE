package br.com.alura.grenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresaA = new Empresa();
		empresaA.setNome("Empresa A");
		
		Empresa empresaB = new Empresa();
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
	
}
