package com.greenfoyacademy.evilmatrix.repositories;

import com.greenfoyacademy.evilmatrix.models.EvilMatrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvilMatrixRepository extends CrudRepository<EvilMatrix, Integer> {
    EvilMatrix findById(int id);

    List<EvilMatrix> findAll();

    EvilMatrix findByAuthor(String author);

    void delete(EvilMatrix evilMatrix);
}
