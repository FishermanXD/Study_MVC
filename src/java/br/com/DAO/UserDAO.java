/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.model.User;
import br.com.sql.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.jms.ConnectionFactory;

/**
 *
 * @author fisherman
 */
public class UserDAO {

    private Connection connection = new ConectionFactory().getConnection();

    public void adiciona(User usuario) throws SQLException {
        
        String sql = "insert into usuario(nome,email,senha,telefone) values(?,?,?,?)";

        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, usuario.getNome());
        stmt.setString(1, usuario.getEmail());
        stmt.setString(1, usuario.getSenha());
        stmt.setLong(1, usuario.getFone());

        stmt.execute();
        stmt.close();
    }
}
