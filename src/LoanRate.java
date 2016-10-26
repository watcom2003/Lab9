import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoanRate {
	public static void main(String[] args) throws IOException {
		double loan,interest, mInterest, mPay,tPay;
		int year;
  		Reader.init(new FileInputStream(new File("data/input.txt")));
		Reader.setDelimeter("\t ,");
		
		loan = Reader.nextDouble();
		year = Reader.nextInt();
		
		System.out.printf("Loan = %10.2f Bahts\n",loan);
		System.out.printf("Year = %10d\n",year);
		interest = 5; 
		
		mInterest = interest / 1200;
		mPay = (loan * (interest / 1200)) / (1 - (1 / Math.pow(1 + mInterest, year * 12)));
		tPay = mPay * (year * 12);
		System.out.printf("Interest Rate\t\tMonthly Payment\t\tTotal Payment\n");
		System.out.printf("%10.2f\t\t%10.2f\t\t%10.2f\n", interest, mPay, tPay );
		
	}

}
