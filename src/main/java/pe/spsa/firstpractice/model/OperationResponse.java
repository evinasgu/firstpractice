package pe.spsa.firstpractice.model;

public class OperationResponse {
    private String operation;
    private Integer result;

    public OperationResponse(String operation, Integer result) {
        this.operation = operation;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
