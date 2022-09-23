/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionariaprojeto.controller;

import com.mycompany.concessionariaprojeto.dao.CarroDAO;
import com.mycompany.concessionariaprojeto.model.Carro;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vini
 */
public class ConcessionariaController {

    List<Carro> listaCarro;

    public ConcessionariaController() {
        listaCarro = new ArrayList<>();
    }
    
    public void cadastrar(String marca, String modelo, BigDecimal preco) {
        try {
            Carro carro = new Carro(0l, marca, modelo, preco);
            CarroDAO crDao = new CarroDAO();
            crDao.cadastrar(carro);
        } catch (SQLException ex) {
            System.err.printf("nao foi possivel inserir carro", ex.toString());
        }
    }

    public void buscar() {

    }

    public void excluir() {

    }
}
