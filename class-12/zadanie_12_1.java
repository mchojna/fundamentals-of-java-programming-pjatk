public class zadanie_12_1{
    public static void main(String[] args){
        Product p1 = new Product("jablko", 1.9);
        Product p2 = new Product("banan", 2.25);
        Product p3 = new Product("chleb", 5.5);
        Product p4 = new Product("kurczak", 12.25);
        Product p5 = new Product("czekolada", 2.5);
        Product p6 = new Product("woda", 1);
        
        ShoppingCart s1 = new ShoppingCart("Adam");
        ShoppingCart s2 = new ShoppingCart("Jakub");
        ShoppingCart s3 = new ShoppingCart("Mikalaj");

        p1.addToShoppingCart(s1);

        p2.addToShoppingCart(s2);
        p3.addToShoppingCart(s2);

        p4.addToShoppingCart(s3);
        p5.addToShoppingCart(s3);
        p6.addToShoppingCart(s3);

        s1.displayProducts();
        s2.displayProducts();
        s3.displayProducts();

        Product p7 = new Product("kiwi", 1);
        Product p8 = new Product("cola", 1);
        Product p9 = new Product("ser", 1);
        Product p10 = new Product("bulka", 1);
        Product p11 = new Product("maslo", 1);
        Product p12 = new Product("olej", 1);
        Product p13 = new Product("olwia", 1);
        Product p14 = new Product("pomidor", 1);
        Product p15 = new Product("koks", 1);
        Product p16 = new Product("chipsy", 1);
        Product p17 = new Product("baton", 1);
        Product p18 = new Product("ciastka", 1);
        Product p19 = new Product("kawa", 1);
        Product p20 = new Product("sol", 1);

        ShoppingCart s4 = new ShoppingCart("Michal");

        p7.addToShoppingCart(s4);
        p8.addToShoppingCart(s4);
        p9.addToShoppingCart(s4);
        p10.addToShoppingCart(s4);
        p11.addToShoppingCart(s4);
        p12.addToShoppingCart(s4);
        p13.addToShoppingCart(s4);
        p14.addToShoppingCart(s4);
        p15.addToShoppingCart(s4);
        p16.addToShoppingCart(s4);
        p17.addToShoppingCart(s4);
        p18.addToShoppingCart(s4);
        p19.addToShoppingCart(s4);
        p20.addToShoppingCart(s4);

        s4.displayProducts();
    }
}