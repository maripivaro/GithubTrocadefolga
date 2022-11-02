package com.trocadefolga.trocadefolga.repository;

import com.trocadefolga.trocadefolga.modelo.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
    @Override
    List<Funcionario> findAllById(Iterable<Integer> integers);

    List<Funcionario> findAllById(String regimeDeTrabalho);

    Funcionario buscaFuncionario(Integer id);

    boolean excluirAluno(Integer id);

    boolean atualizaFuncionario(Integer id, Funcionario aluno);
}
