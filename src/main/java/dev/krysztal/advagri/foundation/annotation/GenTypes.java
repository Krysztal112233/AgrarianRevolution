package dev.krysztal.advagri.foundation.annotation;

import java.lang.annotation.*;

/**
 * For data generator
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GenTypes {
  GenType[] types() default { GenType.SimpleItemModel };
}
