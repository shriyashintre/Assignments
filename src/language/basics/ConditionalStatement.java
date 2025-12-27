package language.basics;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName = "John Doe";
		int creaditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		float debtToIncomeRatio = 40.0F;

		// print customer name
		System.out.println("Print customer name : " + customerName);

		// 1.checking for creadit score
		if (creaditScore > 750) {
			System.out.println("loan is approved");
		}
		// 2.if creadit score is between 650 and 750,
		else if (creaditScore > 650 && creaditScore < 750) {
			// checking for the income
			if (income >= 55000.0) {
				// checking for customer is employed
				if (isEmployed) {

					// 3.checking for the debt to income ratio
					if (debtToIncomeRatio < 40.0) {
						System.out.println("loan is approved");
					} else {

						// if the debt to income ratio is greater than 40.0%
						System.out.println("loan is denied");
					}
				} else {
					// if customer is unemployed loan should be denied
					System.out.println("when Customer is unemploed : loan should be denied");
				}
			} else {
				// if creadit score is below 650 loan should be denied
				System.out.println("creadit score is below 650 : loan should be denied");
			}
		}

	}
}
