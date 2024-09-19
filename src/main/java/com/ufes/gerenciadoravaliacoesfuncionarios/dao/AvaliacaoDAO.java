/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.dao;

import com.ufes.gerenciadoravaliacoesfuncionarios.model.Avaliacao;
import java.util.List;

/**
 *
 * @author talle
 */
public interface AvaliacaoDAO {
    List<Avaliacao> buscarPorFuncionarioId(int funcionarioId);
    void inserir(Avaliacao avaliacao);    
}
