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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini
 */
public class ConcessionariaController {

    public void cadastrar(String marca, String modelo, BigDecimal preco) {
        try {
            Carro carro = new Carro(0, marca, modelo, preco);
            CarroDAO crDao = new CarroDAO();
            crDao.cadastrar(carro);
        } catch (SQLException ex) {
            System.out.println("nao foi possivel inserir carro" + ex.toString());
        }
    }

    public DefaultTableModel buscar() {
        DefaultTableModel dados = new DefaultTableModel();
        dados.setNumRows(0);
        dados.addColumn("#");
        dados.addColumn("Modelo");
        dados.addColumn("Marca");
        dados.addColumn("Preço");
        try {

            CarroDAO crDao = new CarroDAO();
            List<Carro> carros = crDao.buscar();
            for (Carro c : carros) {
                dados.addRow(new Object[]{c.getId(), c.getModelo(), c.getMarca(), c.getPreco()});
            }
        } catch (SQLException ex) {
            System.out.println("nao foi possivel inserir carro" + ex.toString());
        }
        return dados;
    }

    public void excluir(int id) {
        try {
            CarroDAO crDao = new CarroDAO();
            crDao.excluir(id);
        } catch (SQLException ex) {
            System.out.println("nao foi possivel excluir carro" + ex.toString());
        }
    }
}
