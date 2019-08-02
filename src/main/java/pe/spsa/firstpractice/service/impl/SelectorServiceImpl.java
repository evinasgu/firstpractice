package pe.spsa.firstpractice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.spsa.firstpractice.model.OperationResponse;
import pe.spsa.firstpractice.service.OperationService;
import pe.spsa.firstpractice.service.SelectorService;

@Service
public class SelectorServiceImpl implements SelectorService {

    @Autowired
    OperationService operationService;


    @Override
    public OperationResponse executeOperation(String operationType, Integer firstOperand, Integer secondOperand) {
        if (operationType.toLowerCase().equals("sum")) {
            return operationService.sum(firstOperand, secondOperand);
        } else {
            return operationService.substraction(firstOperand, secondOperand);
        }
    }
}
