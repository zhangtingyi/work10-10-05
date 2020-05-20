package test;


@Component("chkl")
public class CheckLogin2 {

    public void pc(){
    }
    public void aopBefefore(){
        System.out.println("aopBefore chkl");
    }

    public void aopAfter(){
        System.out.println("aopAfter chkl");
    }

}
