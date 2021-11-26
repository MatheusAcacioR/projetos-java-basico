package com.ap3frameworks.ap3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ap3frameworks.ap3.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

}
