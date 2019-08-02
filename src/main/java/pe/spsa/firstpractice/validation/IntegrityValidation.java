package pe.spsa.firstpractice.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class IntegrityValidation<V> implements ValidationSPSA<V> {
    private V target;
    private Set<ConstraintViolation<V>> constraintViolationSet;

    public IntegrityValidation(V target) {
        this.target = target;
        this.constraintViolationSet = recollectConstraints();
    }

    private Set<ConstraintViolation<V>> recollectConstraints() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator validator = validatorFactory.getValidator();
        return validator.validate(this.target);
    }

    @Override
    public Boolean validate(V target) {
        return this.constraintViolationSet.size() == 0;
    }
}
