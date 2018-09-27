package xi.chun.lin.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * Created by Lin.XiChun on 2018/7/19.
 */
//@Aspect
@Component
public class NotVeryUsefulAspect {
    /*@AfterReturning(value="execution(* com.cn.spring.aspectj.NotVeryUsefulAspectService.*(..))")
    private void logReceiver(){
        System.out.println("切入点logReceiver...");
    }

    @Pointcut(value="execution(* com.cn.spring.aspectj.NotVeryUsefulAspectService.*(..)) && args(param)")
    private void pointcut(String param){
        System.out.println("切入点pointcut()"+param);
    }

    //方法体将不执行
    @Pointcut("within(com.cn.spring.aspectj.*)")
    public String inWebLayer() {
        System.out.println("切入点inWebLayer()");
        return "返回值加载";
    }

    @Before(value="inWebLayer()")
    private void beforeinWebLayer(){
        System.out.println("beforeinWebLayer~~");
    }

    @Before(value="pointcut(param)")
    private void beforePointcut(String param){
        System.out.println("beforePointcut:"+param);
    }


    @AfterReturning(pointcut="inWebLayer()",returning="retVal")
    public void doAccessCheck(Object retVal) {
        System.out.println("doAccessCheck:"+retVal);
    }

    @Around(value="execution(* com.cn.spring.aspectj.NotVeryUsefulAspectService.*(..))")
    private Object aroundLayer(ProceedingJoinPoint pjp) throws Throwable{
// start stopwatch
        Object retVal = pjp.proceed();
// stop stopwatch
        System.out.println("aroundLayer~~");
        return retVal;
    }*/
}