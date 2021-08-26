package friend;

import com.service.ServiceRegistry;

public class Friend implements ServiceRegistry{
    @Override
    public void sayHello() {
        System.out.println("Hello Friends");
    }


}

