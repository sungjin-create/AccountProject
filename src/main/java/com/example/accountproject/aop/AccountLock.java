package com.example.accountproject.aop;

import javax.swing.text.Element;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AccountLock {
    long tryLockTime() default 5000L;
}
