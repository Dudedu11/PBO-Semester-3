package John;

public class Commission extends Hourly {
    double total_sales;
    double commission_rate;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commission_rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commission_rate = commission_rate;
    }

    public void addSales(double total_sales){
        this.total_sales = total_sales;
    }

    public double pay(){
        return super.pay() + commission_rate;
    }

    public String toString(){
        return super.toString() + " , total sales is " + total_sales ;
    }

}
