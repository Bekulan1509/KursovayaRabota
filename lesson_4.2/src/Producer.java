import com.company.Products;

public class Producer extends Thread {



    private Products products;

    public Producer(Products products){
        this.products = products;
    }



    @Override
    public void run() {

        synchronized (products){
            for (int i = 0; i <5; i++) {

            }

        }
    }
}
