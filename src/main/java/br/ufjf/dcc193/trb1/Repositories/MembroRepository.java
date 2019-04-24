package br.ufjf.dcc193.trb1.Repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.trb1.Models.Membro;

public interface MembroRepository extends JpaRepository<Membro, Integer>{
    List<Membro> findByFkIdSede(Integer fkIdSede);
}