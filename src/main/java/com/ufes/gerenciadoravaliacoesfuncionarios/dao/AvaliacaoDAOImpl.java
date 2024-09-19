/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.dao;

import com.ufes.gerenciadoravaliacoesfuncionarios.model.Avaliacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talle
 */
public class AvaliacaoDAOImpl implements AvaliacaoDAO {
    private Connection connection;

    public AvaliacaoDAOImpl() {
        try {
            // Conecta ao banco de dados (SQLite)
            this.connection = DriverManager.getConnection("jdbc:sqlite:funcionarios.db");
            criarTabela();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void criarTabela() {
        // Cria a tabela de avaliações se não existir
        String sql = "CREATE TABLE IF NOT EXISTS avaliacoes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "funcionario_id INTEGER NOT NULL," +
                "descricao TEXT NOT NULL," +
                "nota INTEGER NOT NULL," +
                "FOREIGN KEY(funcionario_id) REFERENCES funcionarios(id))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Avaliacao> buscarPorFuncionarioId(int funcionarioId) {
        List<Avaliacao> avaliacoes = new ArrayList<>();
        String sql = "SELECT * FROM avaliacoes WHERE funcionario_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, funcionarioId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Avaliacao avaliacao = new Avaliacao();
                avaliacao.setId(rs.getInt("id"));
                avaliacao.setFuncionarioId(rs.getInt("funcionario_id"));
                avaliacao.setDescricao(rs.getString("descricao"));
                avaliacao.setNota(rs.getInt("nota"));
                avaliacoes.add(avaliacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return avaliacoes;
    }

    @Override
    public void inserir(Avaliacao avaliacao) {
        String sql = "INSERT INTO avaliacoes (funcionario_id, descricao, nota) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, avaliacao.getFuncionarioId());
            pstmt.setString(2, avaliacao.getDescricao());
            pstmt.setInt(3, avaliacao.getNota());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
