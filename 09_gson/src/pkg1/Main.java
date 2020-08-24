package pkg1;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class Flower {
    private int productId;
    private String name;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Flower{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



public class Main {

    public static void main(String[] args) {
        String fileName = "data.json";
        Gson gson = new Gson();
        try{
            FileReader fileReader = new FileReader(fileName);
            JsonReader reader = new JsonReader(fileReader);
            Flower[] data = gson.fromJson(reader, Flower[].class);
            for(Flower flower: data){
                System.out.println(flower);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
