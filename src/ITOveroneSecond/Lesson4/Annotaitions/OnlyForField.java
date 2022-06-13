package ITOveroneSecond.Lesson4.Annotaitions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)
public @interface OnlyForField {
}
