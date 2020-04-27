/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Devakian
 */
public class Itens {
    
    private int idItem;
    private int idProduto;
    private int idUsuario;
    private int idVenda;
    private int idQntd;
    private double valor;

    public Itens(int idItem, int idProduto, int idUsuario, int idVenda, int idQntd, double valor) {
        this.idItem = idItem;
        this.idProduto = idProduto;
        this.idUsuario = idUsuario;
        this.idVenda = idVenda;
        this.idQntd = idQntd;
        this.valor = valor;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdQntd() {
        return idQntd;
    }

    public void setIdQntd(int idQntd) {
        this.idQntd = idQntd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
