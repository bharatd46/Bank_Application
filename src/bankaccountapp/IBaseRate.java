package bankaccountapp;

public interface IBaseRate {
	//write a method to return base rate
	default double getBaseRate() {
		return 2.5;
	}

}
