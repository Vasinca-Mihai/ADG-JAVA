package Lecture_3_Design_patterns.DrinkingTime;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class PersonInvocationHandler implements java.lang.reflect.InvocationHandler{
    private IPerson tr;

    public PersonInvocationHandler(IPerson tr) {
        this.tr = tr;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Instant one = Instant.now();
        Object  res = method.invoke(tr,args);//duke stats doing stuff
        Instant two = Instant.now();//duke finished doing stuff
        System.out.println(tr.getName()+" was "+method.getName()+"ing for "+Duration.between(one,two));
        return res;
    }
}
