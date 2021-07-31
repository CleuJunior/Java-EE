package br.com.alura.Model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccesType.FIELD)
public class Venda {

    private String formaDePagamento;
    
    @XmlElementWrapper(name="produtos")
    @XmlElement(name="produto")
    private List<Produto> produtos;
    private List<Produto> produtos;

    public String getFormaDePagamento() {
        return formaDePagamento;
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    } 
    
    @Override
    public String toString() {
        return "Forma de pagamento: " + formaDePagamento + "\n produtos: " + produtos;
    }

}