public class Product {
    //id ürünü tanımlayan eşsiz numaralardır diyebiliriz.
    // attribute | field
    public Product(int id, String name, String description, double price,int stockAmount,String kod){
        System.out.println("Yapıcı blok çalıştır");
        this.id=id;
        this.kod=renk;
        this.name=name;
        this.stockAmount=stockAmount;
        this.price=price;
        this.description=description;
    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private  String kod;


    //getter
    int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}
