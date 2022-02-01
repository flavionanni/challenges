public class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    double moneyCurrent = principal;
    int years = 0;
    
    
    while(moneyCurrent < desired) {
      double moneyInterest = moneyCurrent * interest;
      double moneyTax = moneyInterest * tax;
      moneyCurrent += (moneyInterest - moneyTax);
      years++;
    }
    
    return years;
  }
}
