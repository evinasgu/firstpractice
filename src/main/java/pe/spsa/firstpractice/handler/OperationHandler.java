package pe.spsa.firstpractice.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.spsa.firstpractice.model.OperationRequest;
import pe.spsa.firstpractice.model.OperationResponse;
import pe.spsa.firstpractice.service.SelectorService;

@RestController
@RequestMapping(value = "/api/v1/operation")
public class OperationHandler {
    @Autowired
    private
    SelectorService selectorService;

    @PostMapping(value = "")
    public OperationResponse executeOperation(@RequestBody OperationRequest request) {
        return selectorService.executeOperation(request.getOperation(), request.getValue1(), request.getValue2());
    }
}
