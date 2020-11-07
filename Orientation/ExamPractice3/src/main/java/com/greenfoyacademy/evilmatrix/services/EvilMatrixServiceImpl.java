package com.greenfoyacademy.evilmatrix.services;

import com.greenfoyacademy.evilmatrix.models.EvilMatrix;
import com.greenfoyacademy.evilmatrix.repositories.EvilMatrixRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvilMatrixServiceImpl implements EvilMatrixService {
    final
    EvilMatrixRepository evilMatrixRepository;

    public EvilMatrixServiceImpl(EvilMatrixRepository evilMatrixRepository) {
        this.evilMatrixRepository = evilMatrixRepository;
    }

    @Override
    public EvilMatrix findById(int id) {
        return evilMatrixRepository.findById(id);
    }

    @Override
    public List<EvilMatrix> findAll() {
        return evilMatrixRepository.findAll();
    }

    @Override
    public EvilMatrix findByAuthor(String author) {
        return evilMatrixRepository.findByAuthor(author);
    }

    @Override
    public void save(EvilMatrix evilMatrix) {
        evilMatrixRepository.save(evilMatrix);
    }

    @Override
    public boolean isSquare(String matrixForm) {
        String[] rows = matrixForm.split("\n");
        for (int i = 0; i < rows.length; i++) {
            String rowLenght = rows[i].replaceAll("(\\r|\\n)", "");
            for (int j = 0; j < rowLenght.length(); j++) {
                if (rows.length != rowLenght.length()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public List<EvilMatrix> getListOfMatricesFromSameAuthor(String author) {
        List<EvilMatrix> listOfMsFromSameA = new ArrayList<>();
        List<EvilMatrix> listOfAll = evilMatrixRepository.findAll();
        for (EvilMatrix evilMatrix : listOfAll) {
            String a = evilMatrix.getAuthor();
            if (a == null) {
                continue;
            }
            if (a.equals(author)) {
                listOfMsFromSameA.add(evilMatrix);
            }
        }
        return listOfMsFromSameA;
    }
}