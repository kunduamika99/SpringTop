package guest;

import com.service.ServiceRegistry;

public class Guest implements ServiceRegistry{
    @Override
    public void sayHello() {
        System.out.println("Hello Guest");
    }

}
