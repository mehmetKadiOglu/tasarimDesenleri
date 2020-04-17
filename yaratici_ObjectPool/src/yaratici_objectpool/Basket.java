/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaratici_objectpool;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mehmet
 */
public abstract class Basket {

    abstract String type();

}

class IronBasket extends Basket {

    @Override
    public String type() {
        return "Iron Basket";
    }
}
class BasketSource {
    private static BasketSource source = new BasketSource();
    private Map<Class<? extends Basket> , Basket> poolMap = new HashMap<Class<? extends Basket>, Basket>();

    private BasketSource() {
    }


    public static Basket getBasket(Class<? extends Basket> clazz) throws IllegalAccessException, InstantiationException {
        Basket b = source.poolMap.get(clazz);
        if (b == null) {
            b = clazz.newInstance();
            source.poolMap.put(b.getClass(), b);
        }
        return b;
    }
}

