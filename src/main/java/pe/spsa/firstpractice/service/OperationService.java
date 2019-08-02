package pe.spsa.firstpractice.service;

import pe.spsa.firstpractice.model.OperationResponse;

public interface OperationService {
    OperationResponse sum(Integer value1, Integer value2);
    OperationResponse substraction(Integer value1, Integer value2);
}
