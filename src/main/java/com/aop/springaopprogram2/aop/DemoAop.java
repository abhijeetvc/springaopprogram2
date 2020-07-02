package com.aop.springaopprogram2.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Aspect : Aspect is a cross-cutting concern
//Advice : Action taken by aspect
      // Types : After, Before, AfterReturning, Around, AfterThrowing

//Pointcut : A scenario which matches to joinpoint
//Joinpoint : It is a point that represents execution of a method

@Component
@Aspect
public class DemoAop {

    @Before(" execution(* com.aop.springaopprogram2.impl.DemoImpl.doSomething())")
    void checkAop(){
        System.out.println("Hellloooooooo");
    }
}
