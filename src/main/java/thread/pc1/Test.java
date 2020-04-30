package thread.pc1;

public class Test {
    /**
     * 存在的问题
     * 1、先生产后消费
     * 2.生产产品的品牌和名称对应
     * @param args
     */
    public static void main(String[] args) {
        Goods goods = new Goods();
        Thread t1 = new Thread(new Producter(goods));
        Thread t2 = new Thread(new Consumer(goods));
        t1.start();
        t2.start();

    }
}
