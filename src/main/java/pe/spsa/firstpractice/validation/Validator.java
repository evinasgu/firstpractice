package pe.spsa.firstpractice.validation;

import java.util.List;

public class Validator <T> {
    List<ValidationSPSA<T>> validationSPSAList;

    public Validator(List<ValidationSPSA<T>> validationSPSAList) {
        this.validationSPSAList = validationSPSAList;
    }

    public Boolean validate(T target) {
        return validationSPSAList
                .stream()
                .allMatch(t -> t.validate(target));
    }
}
