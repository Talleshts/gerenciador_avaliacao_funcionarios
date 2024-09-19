/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.FuncionarioService;

import com.ufes.gerenciadoravaliacoesfuncionarios.factory.DAOFactory;
import com.ufes.gerenciadoravaliacoesfuncionarios.model.Funcionario;
import com.ufes.gerenciadoravaliacoesfuncionarios.repository.FuncionarioRepository;
import com.ufes.gerenciadoravaliacoesfuncionarios.repository.IFuncionarioRepository;
import java.util.List;

/**
 *
 * @author talle
 */
public class FuncionarioService {
    private IFuncionarioRepository funcionarioRepository;

    public FuncionarioService() {
        this.funcionarioRepository = new FuncionarioRepository();
    }

    // Adicionar um novo funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarioRepository.adicionarFuncionario(funcionario);
    }

    // Buscar funcionário por ID
    public Funcionario buscarFuncionarioPorId(int id) {
        return funcionarioRepository.buscarFuncionarioPorId(id);
    }

    // Listar todos os funcionários
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.listarFuncionarios();
    }

    // Deletar um funcionário
    public void deletarFuncionario(int id) {
        funcionarioRepository.deletarFuncionario(id);
    }   
}
