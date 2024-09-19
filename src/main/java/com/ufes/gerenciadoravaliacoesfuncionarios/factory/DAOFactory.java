/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.factory;

import com.ufes.gerenciadoravaliacoesfuncionarios.dao.AvaliacaoDAO;
import com.ufes.gerenciadoravaliacoesfuncionarios.dao.AvaliacaoDAOImpl;
import com.ufes.gerenciadoravaliacoesfuncionarios.dao.FuncionarioDAO;
import com.ufes.gerenciadoravaliacoesfuncionarios.dao.FuncionarioDAOImpl;

/**
 *
 * @author talle
 */
public class DAOFactory {
    // Método para criar o DAO de Funcionário
    public static FuncionarioDAO criarFuncionarioDAO() {
        return new FuncionarioDAOImpl();
    }

    // Método para criar o DAO de Avaliação
    public static AvaliacaoDAO criarAvaliacaoDAO() {
        return new AvaliacaoDAOImpl();  
    }
}