package test;


@Aspect
@Component
public class CheckLogin {
    @Pointcut("execution(* test.*.*.*(...))")
    public void pc(){

    }
    @Beforet("pc()")
    public void aopBefefore(){
        System.out.println("aopBefefore");
    }

    @After("pc()")
    public void aopAfter(){
        System.out.println("aopAfter");
    }

}
