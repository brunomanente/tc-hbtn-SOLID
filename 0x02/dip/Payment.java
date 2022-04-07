
public class Payment {
	public void pay(String productID, DB type){
        IDbProduct dbProduct = DbProductFactory.create(type.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}

