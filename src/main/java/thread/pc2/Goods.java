package thread.pc2;

public class Goods {
    private String name;
    private String brand;

    public Goods() {
    }

    public Goods(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    private String getName() {
        return name;
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

    public synchronized void setGoods(String brand, String name){
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了："+this.getBrand()+"--"+this.getName());
    }

    public synchronized void getGoods(){
        System.out.println("消费者消费了："+this.getBrand()+"--"+this.getName());
    }
}
