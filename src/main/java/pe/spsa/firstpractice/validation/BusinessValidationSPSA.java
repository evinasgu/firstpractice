package pe.spsa.firstpractice.validation;

import java.util.function.Predicate;

public class BusinessValidationSPSA<T> implements ValidationSPSA<T> {
    Predicate<T> condition;

    public BusinessValidationSPSA(Predicate<T> condition) {
        this.condition = condition;
    }

    @Override
    public Boolean validate(T target) {
        return condition.test(target);
    }
}
