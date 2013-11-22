package javax.edi.model.x12.v5010.validator;

import java.math.BigInteger;

import javax.edi.model.x12.v5010.constraint.BigIntegerContraint.BigIntegerSize;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BigIntegerValidator implements ConstraintValidator<BigIntegerSize, BigInteger> {
	int min;
	int max;

	public void initialize(BigIntegerSize constrainAnnotation) {
		min = constrainAnnotation.min();
		max = constrainAnnotation.max();
	}

	public boolean isValid(BigInteger value, ConstraintValidatorContext context) {
		if(value == null) {
			return true;
		}
		int length = value.toString().length();
		if(length >= min && length <= max ) {
			return true;
		}
		return false;
	}
}
