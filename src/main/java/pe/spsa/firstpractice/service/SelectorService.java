package pe.spsa.firstpractice.service;

import pe.spsa.firstpractice.model.OperationResponse;

public interface SelectorService {
    OperationResponse executeOperation(String operationType, Integer firstOperand, Integer secondOperand);
}
