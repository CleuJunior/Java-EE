package br.com.alura.Teste;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

import br.com.alura.Model.Produto;

public class LerXmlStax {

	 public static void main(String[] args) throws Exception {
	        InputStream is = new FileInputStream("src/vendas.xml");
	        XMLInputFactory factory = XMLInputFactory.newInstance();
	        XMLEventReader eventos = factory.createXMLEventReader(is);
	        List<Produto> produtos = new ArrayList<>();

	        while(eventos.hasNext()) {
	            XMLEvent evento = eventos.nextEvent();

	            if(evento.isStartElement() && evento.asStartElement().getName().getLocalPart().equals("produto")) {
	                Produto produto = criaUmProduto(eventos);
	                produtos.add(produto);
	            }

	        }

	        System.out.println(produtos);
	    }

	    private static Produto criaUmProduto(XMLEventReader eventos) throws Exception {
	        Produto produto = new Produto();

	        while(eventos.hasNext()) {
	            XMLEvent evento = eventos.nextEvent();

	                if(evento.isStartElement() && evento.asStartElement().getName().getLocalPart().equals("nome")) {
	                    evento = eventos.nextEvent();
	                    String nome = evento.asCharacters().getData();
	                    produto.setNome(nome);
	                }else if(evento.isStartElement() && evento.asStartElement().getName().getLocalPart().equals("preco")) {
	                    evento = eventos.nextEvent();
	                    String conteudo = evento.asCharacters().getData();
	                    double preco = Double.parseDouble(conteudo);
	                    produto.setPreco(preco);
	                }else if(evento.isEndElement() && evento.asEndElement().getName().getLocalPart().equals("produto")) {
	                    break;
	            }

	        } return produto;
	    }
}
