package test;


@Component
public class PersonServiceBean implements PersonService{
    public void save(String str) {
        System.out.println(str);
    }
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicitionContext("applicationContext.xml");

        PersonServiceBean personServiceBean=applicationContext.getBean("personServiceBean");

        personServiceBean.save("hahaha");
    }

}
