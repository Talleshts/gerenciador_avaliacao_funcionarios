/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.dao;

import com.ufes.gerenciadoravaliacoesfuncionarios.model.Funcionario;
import java.util.List;

/**
 *
 * @author talle
 */
public interface FuncionarioDAO {
    List<Funcionario> buscarTodos();
    Funcionario buscarPorId(int id);
    void inserir(Funcionario funcionario);
    void deletar(int id);    
}
