import java.util.Scanner;
class AtmProject 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int pass=2580;
		double balance=58000.50;
		System.out.println("Welcome to SBI");
		System.out.println("Please Insert Your Card");
		System.out.println();
		System.out.println("Hi,Please do not Remove your Chip Card.");
		System.out.println("Leave your Card Inserted during");
		System.out.println("the Entire Transaction.");
		System.out.println();
		System.out.println("Please Select Language");
		System.out.println("                          1.English");
		System.out.println("                          2.Hindi");
		System.out.print("Enter number(1/2)    ");
		int choice=scan.nextInt();
		System.out.println();
		switch (choice)
		{
		case 1: System.out.println("Enter Any Number Between 10 and 99");
				System.out.println("for eg. 25");
				System.out.print("Enter Number ");
				int n=scan.nextInt();
				System.out.println("                      YES");
				System.out.println("                      NO");
				if (n>=10 && n<=99)
				{
				System.out.println("To Enter the PIN Press 1");
				System.out.println("To Generate the PIN Press 2");
				choice=scan.nextInt();
				switch (choice)
				{
				case 1: System.out.println("Please Enter Your PIN");
						int pin=scan.nextInt();
						if (pass==pin)
						{
							System.out.println("                Please Choose 'BANKING' for ");
							System.out.println("                     Cash Withdrawal");
							System.out.println();
							System.out.println("1.REGISTRATION                                     2.BANKING");
							System.out.println();
							System.out.println("3.MINI STATEMENT                                   4.BALANCE INQUIRY");
							System.out.println();
							System.out.println("5.SERVICES                                         6.TRANSFER");
							System.out.println();
							System.out.println("7.QUICK CASH");
							System.out.println();
							System.out.println("Enter number(1-7)   ");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1:System.out.println("              Please Select Menu");
									System.out.println();
									System.out.println();
									System.out.println();
									System.out.println("1.MOBILE NUMBER");
									System.out.println("  REGISTRATION");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1:System.out.println("              Please Select Menu.");
											System.out.println();
											System.out.println("                                    1.NEW");
											System.out.println("                                      REGISTRATION");
											System.out.println();
											System.out.println("                                    2.CHANGE MOBILE");
											System.out.println("                                      NUMBER");
											choice=scan.nextInt();
											switch (choice)
											{
											case 1:
											case 2:System.out.println("Please Enter Your Old 10 Digit Mobile Number");
													n=scan.nextInt();
													System.out.println("                                   1.Press If Correct");
													System.out.println();
													System.out.println("                                   2.Press If Not");
													System.out.println("                                     Correct");
													System.out.println();
													choice=scan.nextInt();
													switch (choice)
													{
													case 1:System.out.println("Please Re-Enter Your Old 10 Digit Mobile Number");
															n=scan.nextInt();
															System.out.println("                                   1.Press If Correct");
															System.out.println();
															System.out.println("                                   2.Press If Not");
															System.out.println("                                     Correct");
															System.out.println();
															choice=scan.nextInt();
															switch (choice)
															{
															case 1:System.out.println("Your Transaction is being Processed.");
																	System.out.println("           Please Wait");
																	System.out.println("Please Enter Your 10 Digit Mobile Number");
																	n=scan.nextInt();
																	System.out.println("                                   1.Press If Correct");
																	System.out.println();
																	System.out.println("                                   2.Press If Not");
																	System.out.println("                                     Correct");
																	System.out.println();
																	choice=scan.nextInt();
																	switch (choice)
																	{
																	case 1:System.out.println("Please Re-Enter Your 10 Digit Mobile Number");
																			n=scan.nextInt();
																			System.out.println("                                   1.Press If Correct");
																			System.out.println();
																			System.out.println("                                   2.Press If Not");
																			System.out.println("                                     Correct");
																			System.out.println();
																			choice=scan.nextInt();
																			switch (choice)
																			{
																			case 1:System.out.println("Please send OTP and reference number received in");
																					System.out.println("SMS from new as well as existing mobile number");
																					System.out.println("           in the following format.");
																					System.out.println("ACTIVATE<OTPVALUE><REFERENCE NUMBER>to");
																					System.out.println("          567676 within 4 hours");
																			case 2:System.out.println("Please Re-Enter Your 10 Digit Mobile Number");
																					break;
																			default:System.out.println("Invalid Choice");
																			}
																			break;
																	case 2:System.out.println("Please Enter Your 10 Digit Mobile Number");
																			break;
																	default:System.out.println("Invalid Choice");
																	}
																	break;
															case 2:System.out.println("Please Re-Enter Your 10 Digit Mobile Number");
																	break;
															default:System.out.println("Invalid Choice");
															}
															break;
													case 2:System.out.println("Please Enter Your Old 10 Digit Mobile Number");
															break;
													default:System.out.println("Invalid Choice");
													}
													break;
											default:System.out.println("Invalid Choice");
											}
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 2: System.out.println("             Please Select Transaction");
									System.out.println();
									System.out.println("1.DEPOSIT                                    2.FAST CASH");
									System.out.println();
									System.out.println("                                             3.WITHDRAWAL");
									System.out.println();
									System.out.println("4.PIN CHANGE                                 5.BALANCE INQUIRY");
									System.out.println();
									System.out.println("6.OTHERS                                     7.MINI STATEMENT");
									System.out.println();
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("         Please Select Deposit Transaction");
											System.out.println();
											System.out.println("1.OTHERS ACCOUNTS                    2.CASH DEPOSIT");
											System.out.println();
											System.out.println("3.OTHER BANK DEPOSIT                 4.MAIN MENU");
											System.out.println();
											choice=scan.nextInt();
											switch (choice)
											{
											case 1:
											case 2: System.out.println("Your Transaction is being Processed.");
													System.out.println("            Please Wait");
													System.out.println("DEPOSIT PER TRANSACTION LIMIT :");
													System.out.println("200000");
													System.out.println();
													System.out.println("SERVICE CHARGE :");
													System.out.println("0");
													System.out.println("                           CONTINUE");
													System.out.println("                           CANCEL");
													System.out.println("Press CONTINUE");
													System.out.println("Please Select Account Type");
													System.out.println();
													System.out.println("                           1.CURRENT");
													System.out.println();
													System.out.println("                           2.SAVINGS");
													System.out.println();
													choice=scan.nextInt();
													switch (choice)
													{
													case 1:
													case 2: System.out.println("Your Transaction is being Processed.");
															System.out.println("            Please Wait");
															System.out.println();
															System.out.println("                                    Acceptable Denomination");
															System.out.println("                               Rs.100,Rs.200,Rs.500,Rs.2000");
															System.out.println();
															System.out.println("													ENTER");
															System.out.println("please Insert Your Cash");
															System.out.println("Please ENTER to Proceed,or");
															System.out.println("Press CANCEL to Finish Transaction");
															System.out.println("													CANCEL");
															System.out.println();
															System.out.println("            Please Wait...Validating Cash");
															break;
													}
											case 3:
											case 4:
											}
									case 2:
									case 3: System.out.println("Please Select Account Type");
											System.out.println();
											System.out.println("                        1.KCC");
											System.out.println();
											System.out.println("                        2.CURRENT");
											System.out.println();
											System.out.println("                        3.SAVINGS");
											System.out.println();
											choice=scan.nextInt();
											switch (choice)
											{
											case 1:
											case 2:
											case 3: System.out.println("           Please Enter Amount.");
													System.out.println("Cash Available :Rs 100,Rs 200,Rs 500,Rs 2000");
													System.out.println();
													System.out.println("                      YES");
													System.out.println("                      NO");
													int amount=scan.nextInt();
													System.out.println("Press YES");
													System.out.println("Your Transaction is being Processed.");
													System.out.println("            Please Wait");
													if (amount<=balance  && amount<=10000)
													{
														System.out.println("Please Collect Cash.");
														System.out.println("Transaction Complete");
														balance=balance-amount;
														System.out.println("Available Balance :");
														System.out.println(balance);
														System.out.println("Please Take Your Card");
													}
													else if (amount>10000)
													{
														System.out.println("Your Exceeding The Withdrawal Limit");

													}
													else
													{
														System.out.println("Insufficient Balance");
													}
													break;
											}
											break;
									case 4: System.out.println("PLEASE ENTER YOUR NEW PIN");
											int pin1=scan.nextInt();
											System.out.println("PLEASE RE-ENTER YOUR NEW PIN");
											int pin2=scan.nextInt();
											System.out.println("Transaction is being Processed");
											System.out.println("        Please Wait");
											if (pin1==pin2)
											{
												System.out.println("Pin Changed Successfully");
												System.out.println("Please Take Your Card");
											}
											else
											{
												System.out.println("Incorrect Pin");
												System.out.println("Please Take Your Card");
											}
											break;
									case 5: System.out.println("Please Select Account Type");
											System.out.println();
											System.out.println("                        1.KCC");
											System.out.println();
											System.out.println("                        2.CURRENT");
											System.out.println();
											System.out.println("                        3.SAVINGS");
											System.out.println();
											choice=scan.nextInt();
											switch (choice)
											{
											case 1:
											case 2:
											case 3: System.out.println("Your Transaction is being Processed.");
													System.out.println("            Please Wait");
													System.out.println("Transaction Complete");
													System.out.println("Available Balance :");
													System.out.println(balance);
													System.out.println("Please Take Your Card");
													break;
											}
											break;
									case 6:
									case 7:
									}
									break;
							case 3:
							case 4: System.out.println("Please Select Account Type");
									System.out.println();
									System.out.println("                        1.KCC");
									System.out.println();
									System.out.println("                        2.CURRENT");
									System.out.println();
									System.out.println("                        3.SAVINGS");
									System.out.println();
									choice=scan.nextInt();
									switch (choice)
									{
									case 1:
									case 2:
									case 3: System.out.println("Your Transaction is being Processed.");
											System.out.println("            Please Wait");
											System.out.println("Transaction Complete");
											System.out.println("Available Balance :");
											System.out.println(balance);
											System.out.println("Please Take Your Card");
								
									}
									break;
							case 5:
							case 6:
							case 7:
							}
						}
						else
						{
							System.out.println("Incorrect Pin");
							System.out.println("Please Take Your Card");
						}
						break;
				case 2: System.out.println("Please enter Your Account Number");
						int accountNumber=scan.nextInt();
						System.out.println("                           Press If Correct");
						System.out.println();
						System.out.println("                           Press If not");
						System.out.println("                           Correct");
						System.out.println("Please Enter Your 10 Digit Mobile Number");
						int mobileNumber=scan.nextInt();
						System.out.println("                           Press If Correct");
						System.out.println();
						System.out.println("                           Press If not");
						System.out.println("                           Correct");
						System.out.println("Dear Customer ,State Bank appreciates you for the green");
						System.out.println("initiative.Pin shall be shortly delivered to your registered");
						System.out.println("number on success of your transaction");
						System.out.println("                                   CONFIRM");
						System.out.println();
						System.out.println("                                   CANCEL");
						System.out.println("Click on CONFIRM");
						System.out.println("Your Transaction is being Processed.");
						System.out.println("             Please Wait");
						System.out.println("Transaction Complete");
				}
				}
				System.out.println("Please Take Your Card");
		}
	}
}
