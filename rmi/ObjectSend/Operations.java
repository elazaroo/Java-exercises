package rmi.ObjectSend;

import java.io.Serializable;

public class Operations implements Serializable {
    protected float var1;
    protected float var2;

    public Operations(float var1, float var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public float sum() {
        return var1 + var2;
    }

    public float sub() {
        return var1 - var2;
    }

    public float mul() {
        return var1 * var2;
    }

    public float div() {
        return var1 / var2;
    }
}
