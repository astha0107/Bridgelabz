package oops;
public class food_sys{
    public static void main(String[] args) {
        Product iced_latte=new Product(101,"Iced latte",500);
        Customer c1=new regularCustomer(1, "astha", "astha@isbest");
        Order o1=new Order(c1, iced_latte, 1);
        o1.orderInfo();
    }
}
class Customer{
    private int customerId;
    private String name;
    private String email;
    public Customer(int customerId,String name,String email){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
    }
    public void customerInfo(){
        System.out.println("customer id: "+customerId);
        System.out.println("customer name: "+name);
        System.out.println("customer email: "+email);
    }
    public double getDiscount(){
        return 0.0;
    }
}
//inheritance
class regularCustomer extends Customer{
    //using supeer keyword to inherit from parent class
    regularCustomer(int customerId,String name, String email){
        super(customerId, name, email);
    }
    @Override
    public double getDiscount(){
        return 0.05;
    }
}
class premiumCustomer extends Customer{
    premiumCustomer(int customerId,String name, String email){
        super(customerId, name, email);
    }
    @Override
    public double getDiscount(){
        return 0.15;
    }
}

class Product{
    private int productId;
    private String productName;
    private double price;
    Product(int productId,String productName,int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    //getter is used to get the price
    public double getPrice(){
        return price;
    }
    public void productInfo(){
        System.out.println("product Id: "+productId);
        System.out.println("product name: "+productName);
        System.out.println("price: "+price);
    }
}
class Order{
    // association and composition concept
    private Customer customer;
    private Product product;
    private int quantity;
    Order(Customer customer, Product product, int quantity){
        this.customer=customer;
        this.product=product;
        this.quantity=quantity;
    }

    public double calculateprice(){
        double baseprice=product.getPrice()*quantity;
        double discountprice=baseprice*customer.getDiscount();
        return baseprice-discountprice;

    }
    public void orderInfo(){
        System.out.println("order for customer:");
        customer.customerInfo();
        product.productInfo();
        System.out.println("quantity: "+quantity);
        System.out.println("final price: "+calculateprice());
    }
}