public class Product {
    private String name;
    private double price;
    private ShoppingCart shoppingCart;

    Product(String nameVal, double priceVal){
        this.name = nameVal;
        this.price = priceVal;
    }

    public void addToShoppingCart(ShoppingCart shoppingCartVal){
        this.shoppingCart = shoppingCartVal;
        this.shoppingCart.addProduct(this);
    }

    public String showName(){
        return this.name;
    }

    public double showPrice(){
        return this.price;
    }
}
