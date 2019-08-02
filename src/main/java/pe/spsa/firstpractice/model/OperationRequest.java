package pe.spsa.firstpractice.model;

public class OperationRequest {
    private String operation;
    private Integer value1;
    private Integer value2;

    public OperationRequest(String operation, Integer value1, Integer value2) {
        this.operation = operation;
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }
}
