package epam.loggertask;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Business {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
void input()
{
	LOGGER.info("Which material do you want to use?");
	LOGGER.info("Enter your choice:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
	Scanner input=new Scanner(System.in);
	int materialChoice=input.nextInt();
	int automationChoice=0;
	if(materialChoice==3)
	{
		LOGGER.info("Do you want a fully Automated house?Yes=1,No=0.");
		automationChoice=input.nextInt();
	}
	LOGGER.info("Enter the total area of house in square feet:");
	float totalHouseArea=input.nextFloat();
	LOGGER.info("Total Cost of House Construction is Rs: "+totalHouseArea*Database.getCost(materialChoice+automationChoice));
	input.close();
}
}
