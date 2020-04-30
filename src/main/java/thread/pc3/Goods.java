package thread.pc3;

public class Goods {
    private String name;
    private String brand;
    private int goodId;

    public Goods() {
    }

    public Goods(String name, String brand, int goodId) {
        this.name = name;
        this.brand = brand;
        this.goodId = goodId;
    }

    private String getName() {
        return name;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }
    //默认是不存在商品的，如果值等于true的话，代表有商品
    boolean mointer = false;

    public synchronized void setGoods(String brand, String name, int goodId){
        if(mointer){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        this.setGoodId(goodId);
        System.out.println("生产者生产了："+this.getBrand()+"--"+this.getName()+"--"+this.getGoodId());
        mointer = true;
        notify();
    }

    public synchronized void getGoods(){
        if(!mointer){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了："+this.getBrand()+"--"+this.getName()+"--"+this.getGoodId());
        mointer = false;
        notify();
    }
}
