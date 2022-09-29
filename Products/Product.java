package Products;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);
// default keyword is used to create methods in interface
    default String getBarcode(){
        return "no code";
    }

}
