package Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    private List<String> productlist = null; //产品列表
    private static ProductList instance; //类唯一实例
    private ProductList(){}

    /**
     * 取得唯一实例
     * @return 产品列表唯一实例
     */
    public static ProductList getInstance(){
        if(instance == null){
            instance = new ProductList();
            instance.productlist = new ArrayList<>();
        }
        return instance;
    }

    /**
     * 添加观察者
     * @param observer 观察者
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String newProduct){
        productlist.add(newProduct);
        System.err.println("产品列表新增了产品: " + newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}
