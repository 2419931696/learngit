package reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解 
 * Retention 用于声明注解的存在范围
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}

