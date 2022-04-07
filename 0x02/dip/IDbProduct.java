
public interface IDbProduct {
	 String getProductById(String productID);
	  String getAll();
	  String update(Product product);
	  String delete(String productID);
}
