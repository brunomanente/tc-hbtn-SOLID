
public class DbProductFactory {
    public static IDbProduct create(DB type) {
        if (type == DB.MYSQL) {
            return new MySQLProductRepository();
        }else if(type == DB.MONGODB){
            return new MongoDBProductRepository();
        }else if (type == DB.POSTGRESQL){
            return new PostgreSqlProductRepository();
        } else{
            return null;
        }
    }
}
