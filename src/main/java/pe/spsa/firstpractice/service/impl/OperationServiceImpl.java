package pe.spsa.firstpractice.service.impl;

import org.springframework.stereotype.Service;
import pe.spsa.firstpractice.model.OperationResponse;
import pe.spsa.firstpractice.service.OperationService;

@Service
public class OperationServiceImpl implements OperationService {
    @Override
    public OperationResponse sum(Integer value1, Integer value2) {
        OperationResponse operationResponse = new OperationResponse("Sum", value1 + value2);
        return operationResponse;
    }

    @Override
    public OperationResponse substraction(Integer value1, Integer value2) {
        OperationResponse operationResponse = new OperationResponse("Substraction", value1 - value2);
        return operationResponse;
    }
}
