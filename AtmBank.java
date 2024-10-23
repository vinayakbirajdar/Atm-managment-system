import java.util.Scanner;
class AtmBank
{
	static long accNo = 12345;
	static int pin = 1234;
	static double balance = 88000;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("****WELCOME TO ATM*****");
		System.out.println();
		System.out.println();
		
		Login();
		int lop = 3;
		while(lop>1)
		{

			System.out.println("Do you want to continue the transaction?\n type 1 for yes type 2 for no");
			int ch = sc.nextInt();

			switch(ch)
			{
			case 1:
				{
					Options();
					--lop;
					break;
				}
			case 2 :
				{
					System.out.println("Thank you.....!");
					break;
				}
			default:
				{
					System.out.println("Please enter a valid input");
				}

			}



		}

	
		
		//PinCh();
	}
	public static void Login()
	{
		
		System.out.println("Enter your Account Number: ");
		long AccountNo = sc.nextLong();
		
		if(count(AccountNo))
		{
			System.out.println("Enter your pin: ");
			int pin1 = sc.nextInt();

			if (accNo==AccountNo && pin==pin1)
			{
				System.out.println("Login Successfully!");
				System.out.println();
				System.out.println("***************");
				System.out.println();
				Options();
			}
			else
			{
				System.out.println("Incorrect Account number or password! ");
			}



		}
		else
		{
			System.out.println("Please enter a valid account number .....!(Invalid length of account number Should be equal to 5 digit...!)");


		}
			
		
	}

	public static void PinCh()
	{
	
		System.out.println("Enter your previous pin:");
		int ppin = sc.nextInt();

		if (ppin==pin)
		{
			System.out.println("Enter your new pin ");
			int npin = sc.nextInt();
			System.out.println("Pin changed Successfully! ");
			System.out.println();
			System.out.println("Updated pin is: "+npin);
			System.out.println("***************");
		}
		else
		{
			System.out.println("Incorrect previous pin");
		}
		pin=ppin;
		
	}


	public static void Options()
	{
		
		System.out.println("1. Check Balance ");
		System.out.println("2. Withdraw ");
		System.out.println("3. Deposit ");
		System.out.println("4. Change pin ");
		System.out.println("5. Loan ");
		System.out.println("6. Transfer amount ");
		System.out.println();
		System.out.println("Enter your input: ");


		int ip = sc.nextInt();

		switch(ip)
		{
			case 1:
			{
				System.out.println();
				System.out.println("Your balance is: "+balance);
				break;
			}
			case 2:
			{
				System.out.println();
				withdraw();
				break;
			}
			case 3:
			{
				System.out.println();
				deposit();
				
				break;
			}
			case 4:
			{
				System.out.println();
				PinCh();
				break;
			}
			case 5:
			{
				System.out.println();
				loan();
				break;
			}
			case 6:
			{
				System.out.println();
				transfer();
				break;
			}
			default:
			{
				System.out.println("Wrong Input! ");
			}
				
		}
		
	}

//withdraw method
	public static void withdraw()
		{
			System.out.println("Enter the withdraw amount");
			int amt = sc.nextInt();
			if(amt>0)
			{
				if(balance-amt>=0)
					{
						balance = balance - amt;
						System.out.println("Amount Deducted!!");
						System.out.println("amount deducated is : "+amt+" Rs");
						System.out.println("Available balance : "+balance+" Rs");

					}
				else
					{
						System.out.println("Insufficient Balance!");
						System.out.println("Your avaiable Balance is: "+balance+" Rs");
					}


			}
			else
			{
				System.out.println("Please enter the valid amount....!\nPLease check the amount you have entered");
			}
			
				
		}


		public static void deposit()
		{
			System.out.println("Enter the amount to be deposited");
			int amt = sc.nextInt();
			if(amt > 0)
			{
				balance = balance + amt;
				System.out.println("Amount Credited");
				System.out.println("Your avaiable balance is: "+ balance+" Rs");
			}
			else
			{
				System.out.println("Please enter the valid amount....!\nPLease check the amount you have entered");
			}

			
		}


		public static void loan()
		{

			System.out.println("Welcome to the Loan Section ........!.\n\nWe Provide the following loan facilities");
			System.out.println("1)HOME LOAN \n\n2)Car LAON \n\n3)Personal LOAN");
			System.out.println("please select by typing 1 , 2 and 3\n");

			System.out.println("Enter tha choice");
			int a = sc.nextInt();
			

			switch(a)
			{
				case(1):
					{
						System.out.println("Welcome to Home Laon");
						System.out.println("On Home loan we charge 9% of total interest");
						System.out.println("Please enter the amount more than 2 lakhs");
						System.out.println("\nPlease enter the  amount you want..........!");
						int amt = sc.nextInt();
						if(amt > 200000)
						{
							System.out.println("\nPlease enter the period for the loan in years");
							int t = sc.nextInt();
						

							double total = (amt *(0.09*t+1)); 

							System.out.println("The total amount with interest is : "+total+" Rs"); 


							double interest = total - amt;
							System.out.println("\nAnd your total interest will be : "+interest+" Rs");

							double month = total/(t * 12);
							System.out.println("\nThe EMI for every month will be: "+month+" Rs till "+t+" years");

							double year = total / t;

							System.out.println("\nThe EMI for every year will be: "+year+" Rs till "+t+" years");


							System.out.println("\n Thank you ..........!");

						}
						else
						{
							System.out.println("Please enter a valid amount");
						}

						break;

					}

				case(2):
					{
						
						System.out.println("Welcome to car Laon");
						System.out.println("On car loan we charge 8% of total interest");
						System.out.println("Please enter the amount more than 2 lakhs");
						System.out.println("\nPlease enter the  amount you want..........!");
						int amt = sc.nextInt();

						if(amt > 200000)
						{
							System.out.println("\nPlease enter the tenure for the loan in years");
							int t = sc.nextInt();

						
							double total = (amt *(0.08*t+1)); 

							System.out.println("The total amount with interest is : "+total+" Rs"); 


							double interest = total - amt;
							System.out.println("\nAnd your total interest will be : "+interest+" Rs");

							double month = total/(t * 12);
							System.out.println("\nThe EMI for every month will be: "+month+" Rs till "+t+" years");

							double year = total / t;

							System.out.println("\nThe EMI for every year will be: "+year+" Rs till "+t+" years");

							System.out.println("\n Thank you ..........!");

						}

						else
						{
							System.out.println("Please enter a valid amount");
						}
						
						break;
						
					}

				case(3):
					{
						System.out.println("Welcome to Personal Laon");
						System.out.println("On Personal loan we charge 7% of total interest");
						System.out.println("Please enter the amount more than 5 thousand");
						System.out.println("\nPlease enter the  amount you want..........!");
						int amt = sc.nextInt();
						if(amt > 5000)
						{
							System.out.println("\nPlease enter the tenure for the loan in years");
							int t = sc.nextInt();

						
							double total = (amt *(0.07*t+1)); 

							System.out.println("The total amount with interest is : "+total+" Rs"); 

							double interest = total - amt;
							System.out.println("\nAnd your total interest will be : "+interest+" Rs");

							double month = total/(t * 12);
							System.out.println("\nThe EMI for every month will be: "+month+" Rs till "+t+" years");

							double year = total / t;

							System.out.println("\nThe EMI for every year will be: "+year+" Rs till "+t+" years");

							System.out.println("\n Thank you ..........!");

						}

						else
						{
							System.out.println("Please enter a valid amount");
						}

						break;
						
					}
				default:
					{
						System.out.println("PLease enter the valid option.....!");
					}
			}

		}

		public static void transfer()
		{
		System.out.println("Please enter your Pin code again ......!");
		Scanner sc = new Scanner(System.in);
		int pin2 = sc.nextInt();
		if(pin2 == pin)
		{
			System.out.println("You are good to transfer the money");

			System.out.println("Please enter the account number to which you want to transfer the money.");
			int accno2 = sc.nextInt();
			if(count(accno2))
			{
				if(accno2 > 0 &&  accno2 != 12345)
				{
					System.out.println("Enter the amount you want to transfer!");
					int tranAmt = sc.nextInt();
					if(tranAmt > 0)
					balance = balance - tranAmt;
					System.out.println("Amount transfered sucessefully");
					System.out.println("Avaiable amount is: "+balance);


				}
				else
				{
					System.out.println("Please check the account number(Same account number");
				}


			}
			else
			{
					System.out.println("Please enter a valid account number .....!(Invalid length of account number Should be equal to 5 digit...!)");

			}
			


		}
		else
		{
			System.out.println("Incorrect password Please check it");
		}
		}

		public static boolean count(long count)
		{
			int ct = 0;
			while(count > 0)
			{
				count /= 10;
				ct++; 
			}
			return ct == 5;

		}
}