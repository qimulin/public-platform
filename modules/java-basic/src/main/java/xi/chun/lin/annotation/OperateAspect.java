package xi.chun.lin.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Lin.XiChun on 2018/7/18.
 */
@Aspect
@Component
public class OperateAspect {

    /**
     * @Pointcut 拦截的切入点方法，注解的在方法级别之上，但是不执行方法体，只表示切入点的入口。
     * @annotation 是指采用注解的形式进行拦截
     * */
    @Pointcut("@annotation(xi.chun.lin.annotation.Lxcation)")
//    @Pointcut("execution(* xi.chun.lin.controller.AnnotationTestController.test2(*))")
    public void annotationPointCut() {
        System.out.println("annotationPointCut方法");
    }

    /**
     * @Before 顾名思义 是在 切入点 之前执行 方法。
     * */
    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature sign =  (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        Lxcation annotation = method.getAnnotation(Lxcation.class);
        System.out.print("打印："+annotation.value()+" 开始前");
    }

    /**
     * @Around
     * */
    @Around("annotationPointCut()")
    public Object advice(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("通知之开始");
        Object retmsg=null;
//        try {
            retmsg=joinPoint.proceed();
            System.err.println("++++++++"+retmsg);
//        } catch (Throwable e) {
//            e.printStackTrace();
////            throw e;
//        }
        System.out.println("通知之结束");
        return retmsg;
    }

    /**
     * @After 在之上方法执行后执行结束操作
     * */
    @After("annotationPointCut()")
    public void after() {
        System.out.println("after方法执行后");
    }

    @AfterReturning(pointcut="annotationPointCut()",returning="returnVal")
    public void afterReturn(JoinPoint joinPoint,Object returnVal){
        System.out.println("AfterReturning:" + returnVal);
    }

    @AfterThrowing(pointcut="annotationPointCut()",throwing="error")
    public void afterThrowing(JoinPoint joinPoint,Throwable error){
        System.out.println("afterThrowing：" + error);
    }

}
