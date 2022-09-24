/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionariaprojeto.model;

import java.math.BigDecimal;

/**
 *
 * @author Vini
 */
public class Carro {

    private int id;
    private String Marca;
    private String Modelo;
    private BigDecimal Preco;

    public Carro() {
    }

    public Carro(int id, String Marca, String Modelo, BigDecimal Preco) {
        this.id = id;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Preco = Preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public BigDecimal getPreco() {
        return Preco;
    }

    public void setPreco(BigDecimal Preco) {
        this.Preco = Preco;
    }
}