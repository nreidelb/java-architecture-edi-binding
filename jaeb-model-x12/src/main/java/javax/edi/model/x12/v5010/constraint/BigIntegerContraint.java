package javax.edi.model.x12.v5010.constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.edi.model.x12.validator.BigDecimalValidator;
import javax.edi.model.x12.validator.BigIntegerValidator;
import javax.validation.Constraint;

public class BigIntegerContraint {
	@Documented
	@Constraint(validatedBy = BigIntegerValidator.class)
	@Target({ ElementType.METHOD, ElementType.FIELD,
			ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR,
			ElementType.PARAMETER })
	@Retention(RetentionPolicy.RUNTIME)
	public @interface BigIntegerSize {
		String message() default "{Big Integer has invalid size}";

		Class[] groups() default {};

		Class[] payload() default {};

		int min();

		int max();
	}
}
