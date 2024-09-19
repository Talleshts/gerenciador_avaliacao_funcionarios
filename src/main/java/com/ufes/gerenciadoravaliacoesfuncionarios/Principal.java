/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.gerenciadoravaliacoesfuncionarios;

import com.ufes.gerenciadoravaliacoesfuncionarios.FuncionarioService.AvaliacaoService;
import com.ufes.gerenciadoravaliacoesfuncionarios.FuncionarioService.FuncionarioService;
import com.ufes.gerenciadoravaliacoesfuncionarios.model.Avaliacao;
import com.ufes.gerenciadoravaliacoesfuncionarios.model.Funcionario;
import com.ufes.gerenciadoravaliacoesfuncionarios.repository.AvaliacaoRepository;
import com.ufes.gerenciadoravaliacoesfuncionarios.repository.FuncionarioRepository;
import java.util.List;
import com.ufes.gerenciadoravaliacoesfuncionarios.repository.IAvaliacaoRepository;

/**
 *
 * @author talle
 */
public class Principal {
    public static void main(String[] args) {
        // Criar instância dos repositórios
        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();

        // Inserir um novo funcionário
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome("Ana Souza");
        novoFuncionario.setCargo("Gerente de Projetos");
        funcionarioRepository.adicionarFuncionario(novoFuncionario);
        System.out.println("Novo funcionário adicionado.");

        // Buscar o funcionário recém-adicionado
        Funcionario funcionario = funcionarioRepository.buscarFuncionarioPorId(novoFuncionario.getId());
        if (funcionario != null) {
            System.out.println("Funcionário encontrado: " + funcionario.getNome());

            // Adicionar uma avaliação para este funcionário
            Avaliacao avaliacao = new Avaliacao();
            avaliacao.setFuncionarioId(funcionario.getId());
            avaliacao.setDescricao("Excelente desempenho no último projeto");
            avaliacao.setNota(5);
            avaliacaoRepository.adicionarAvaliacao(avaliacao);
            System.out.println("Avaliação adicionada para o funcionário.");

            // Listar todas as avaliações do funcionário
            List<Avaliacao> avaliacoes = avaliacaoRepository.listarAvaliacoesPorFuncionario(funcionario.getId());
            System.out.println("Avaliações do Funcionário:");
            for (Avaliacao av : avaliacoes) {
                System.out.println("Avaliação: " + av.getDescricao() + ", Nota: " + av.getNota());
            }

            // Deletar o funcionário
            funcionarioRepository.deletarFuncionario(funcionario.getId());
            System.out.println("Funcionário deletado.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
