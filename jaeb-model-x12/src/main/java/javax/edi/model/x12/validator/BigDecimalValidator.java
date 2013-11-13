package javax.edi.model.x12.validator;

import java.math.BigDecimal;

import javax.edi.model.x12.constraint.BigDecimalConstraint.BigDecimalSize;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BigDecimalValidator implements ConstraintValidator<BigDecimalSize, BigDecimal> {
	
	int min;
	int max;

	public void initialize(BigDecimalSize constrainAnnotation) {
		min = constrainAnnotation.min();
		max = constrainAnnotation.max();
	}

	public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
		if(value == null) {
			return true;
		}
		int length = value.toPlainString().length();
		if(length >= min && length <= max ) {
			return true;
		}
		return false;
	}
}
