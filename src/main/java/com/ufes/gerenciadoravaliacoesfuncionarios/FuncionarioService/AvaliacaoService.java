/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.FuncionarioService;

import com.ufes.gerenciadoravaliacoesfuncionarios.dao.AvaliacaoDAO;
import com.ufes.gerenciadoravaliacoesfuncionarios.dao.AvaliacaoDAOImpl;
import com.ufes.gerenciadoravaliacoesfuncionarios.factory.DAOFactory;
import com.ufes.gerenciadoravaliacoesfuncionarios.model.Avaliacao;
import java.util.List;

/**
 *
 * @author talle
 */
public class AvaliacaoService {
  private AvaliacaoDAO avaliacaoDAO;

    public AvaliacaoService() {
        this.avaliacaoDAO = DAOFactory.criarAvaliacaoDAO();
    }

    // Adicionar uma nova avaliação
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacaoDAO.inserir(avaliacao);
    }

    // Buscar todas as avaliações de um funcionário
    public List<Avaliacao> listarAvaliacoesPorFuncionario(int funcionarioId) {
        return avaliacaoDAO.buscarPorFuncionarioId(funcionarioId);
    }    
}
