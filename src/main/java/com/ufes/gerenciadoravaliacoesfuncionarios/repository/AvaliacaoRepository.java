/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.repository;

import com.ufes.gerenciadoravaliacoesfuncionarios.dao.AvaliacaoDAO;
import com.ufes.gerenciadoravaliacoesfuncionarios.factory.DAOFactory;
import com.ufes.gerenciadoravaliacoesfuncionarios.model.Avaliacao;
import java.util.List;

/**
 *
 * @author talle
 */
public class AvaliacaoRepository implements IAvaliacaoRepository {

    private AvaliacaoDAO avaliacaoDAO;

    public AvaliacaoRepository() {
        this.avaliacaoDAO = DAOFactory.criarAvaliacaoDAO();  // Obtemos o DAO pela fábrica
    }

    @Override
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacaoDAO.inserir(avaliacao);
    }

    @Override
    public List<Avaliacao> listarAvaliacoesPorFuncionario(int funcionarioId) {
        return avaliacaoDAO.buscarPorFuncionarioId(funcionarioId);
    }
}
