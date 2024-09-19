/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.gerenciadoravaliacoesfuncionarios.repository;

import com.ufes.gerenciadoravaliacoesfuncionarios.dao.FuncionarioDAO;
import com.ufes.gerenciadoravaliacoesfuncionarios.factory.DAOFactory;
import com.ufes.gerenciadoravaliacoesfuncionarios.model.Funcionario;
import java.util.List;

/**
 *
 * @author talle
 */
public class FuncionarioRepository implements IFuncionarioRepository {

    private FuncionarioDAO funcionarioDAO;

    public FuncionarioRepository() {
        this.funcionarioDAO = DAOFactory.criarFuncionarioDAO();
    }

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarioDAO.inserir(funcionario);
    }

    @Override
    public Funcionario buscarFuncionarioPorId(int id) {
        return funcionarioDAO.buscarPorId(id);
    }

    @Override
    public List<Funcionario> listarFuncionarios() {
        return funcionarioDAO.buscarTodos();
    }

    @Override
    public void deletarFuncionario(int id) {
        funcionarioDAO.deletar(id);
    }
}
