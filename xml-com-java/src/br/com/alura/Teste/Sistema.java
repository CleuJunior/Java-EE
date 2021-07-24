package br.com.alura.Teste;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Sistema {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fabrica.newDocumentBuilder();
		Document document = builder.parse("src/vendas.xml");
		
		NodeList formasdePagamento = document.getElementsByTagName("formaDePagamento");
		Element formPag = (Element) formasdePagamento.item(0);
		String formaDePagamento = formPag.getTextContent();
		System.out.println(formaDePagamento);

	}

}
