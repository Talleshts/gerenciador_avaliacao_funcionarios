/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.repository;

import com.ufes.gerenciadoravaliacoesfuncionarios.model.Avaliacao;
import java.util.List;

/**
 *
 * @author talle
 */
public interface IAvaliacaoRepository {
    void adicionarAvaliacao(Avaliacao avaliacao);

    List<Avaliacao> listarAvaliacoesPorFuncionario(int funcionarioId);    
}
