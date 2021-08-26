package dumps;

import java.io.Serializable;

public class Confidential implements Serializable {
    private transient String data;

    public Confidential(String data){
        this.data = data;
    }
}
