package Observable;

import java.util.Observable;
import java.util.Observer;

public class TaoBaoObserver implements Observer {
    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.err.println("发送新产品【"+newProduct+"】同步到淘宝商城");
    }

    public static void main(String[] args){
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        jingdongObserver jingdongObserver = new jingdongObserver();
        observable.addProductListObserver(jingdongObserver);
        observable.addProductListObserver(taoBaoObserver);
        observable.addProduct("新产品1");
    }
}

