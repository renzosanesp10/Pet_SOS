package com.petsos.api.repositories;

import com.petsos.api.model.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdoptanteRepository extends JpaRepository<Adoptante, Integer> {
    //QUERY ---> Utiliza un lenguaje de consulta JPQL (Java Persistence Query Languaje)
}
