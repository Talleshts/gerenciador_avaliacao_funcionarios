/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.repository;

import com.ufes.gerenciadoravaliacoesfuncionarios.model.Funcionario;
import java.util.List;

/**
 *
 * @author talle
 */
public interface IFuncionarioRepository {

    void adicionarFuncionario(Funcionario funcionario);

    Funcionario buscarFuncionarioPorId(int id);

    List<Funcionario> listarFuncionarios();

    void deletarFuncionario(int id);    
}
