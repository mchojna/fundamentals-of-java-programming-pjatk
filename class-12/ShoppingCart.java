public class ShoppingCart {
    private String customerName;
    private Product[] product;
    private int productCount;

    ShoppingCart(String customerNameVal){
        this.customerName = customerNameVal;
        this.productCount = 0;
        this.product = new Product[10];
    }

    public void addProduct(Product productVal){
        if(this.productCount < this.product.length){
            this.product[this.productCount] = productVal;
        }else{
            Product[] tmpProduct = new Product[this.product.length * 2];

            for(int i = 0; i < this.product.length; i++){
                tmpProduct[i] = this.product[i];
            }

            this.product = tmpProduct;
            this.product[this.productCount] = productVal;
        }   

        this.productCount++;
    }

    public void displayProducts(){
        System.out.println("wlascicel: " + this.customerName);

        for(int i = 0; i < productCount; i++){
            System.out.println("name: " + product[i].showName() + "\tprice: " + product[i].showPrice());
        }
    }
}
