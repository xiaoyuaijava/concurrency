package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 用来标记线程【不推荐】的类
 * */
@Target(ElementType.TYPE)   //Target属性来设置这个注解的作用范围，这里作用范围是类，类对应的就是.Type
@Retention(RetentionPolicy.SOURCE)    //SOURCE是学习的时候忽略就选这个，如果真的是工程中就用RUNTIME
public @interface NotRecommend {
    String value() default "";
}
