/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionariaprojeto.dao;
import com.mycompany.concessionariaprojeto.Conexao;
import com.mycompany.concessionariaprojeto.model.Carro;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author raulf
 */
public class CarroDAO {
    private Connection con;
    
    public void cadastrar(Carro carro) throws SQLException{
        con = new Conexao().getConnection();
        String sql = "Insert into CARRO (MODELO, MARCA, PRECO) values (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, carro.getMarca());
        stmt.setString(2, carro.getModelo());
        stmt.setString(3, carro.getPreco().toString());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public List<Carro> buscar() throws SQLException {
        con = new Conexao().getConnection();
        String sql = "Select * from CARRO";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Carro> ltCarro = new ArrayList<>();
        while(rs.next()){
            int id = rs.getInt("ID"); 
            String marca = rs.getString("MARCA");
            String modelo = rs.getString("MODELO");
            BigDecimal preco = new BigDecimal(rs.getString("PRECO"));
            ltCarro.add(new Carro(id, marca, modelo, preco));
        }
        stmt.close();
        con.close();
        return ltCarro;
    }

    public void excluir(int id) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "Delete from CARRO where ID = '"+id+"'";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.execute();
        stmt.close();
        con.close();
    }
}
