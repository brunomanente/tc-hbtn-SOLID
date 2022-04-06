

public interface IPayment {
	void validate() throws Exception;
    void collectPayment();
}
