package epam.loggertask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Database {
	static int standardMaterial=1200,aboveStandardMaterial=1500;
	static int highStandardMaterial=1800,highStandardAutomation=2500;
	private static final Logger LOGGER=LogManager.getLogger(App.class);

	static float getCost(int choice)
	{
		switch(choice)
		{
		case 1:
			return standardMaterial;
		case 2:
			return aboveStandardMaterial;
		case 3:
			return highStandardMaterial;
		case 4:
			return highStandardAutomation;
		default:
			LOGGER.info("You have entered a wrong choice");
			System.exit(0);
			return choice;
			
		}
		
	}
}
