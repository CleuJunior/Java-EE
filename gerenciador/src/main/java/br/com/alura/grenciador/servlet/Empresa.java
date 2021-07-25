package br.com.alura.grenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String nome;
    private Date dataAbertura;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public Date getDataAbertura() { 
        return dataAbertura;
    }

}
