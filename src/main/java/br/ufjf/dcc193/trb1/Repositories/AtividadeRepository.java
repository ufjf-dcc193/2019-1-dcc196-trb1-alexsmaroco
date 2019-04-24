package br.ufjf.dcc193.trb1.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.trb1.Models.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{

    List<Atividade> findByFkIdSede(Integer fkIdSede);
}