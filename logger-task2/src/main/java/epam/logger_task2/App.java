package epam.logger_task2;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {	
	Scanner input=new Scanner(System.in);
        LOGGER.info("Enter the principal(in Rs)");
        double principleAmount=input.nextDouble();
        LOGGER.info("Enter the rate of interest");
        double rateOfInterest=input.nextDouble();
        LOGGER.info("Enter the time period\n(in Years)");
        double timePeriod=input.nextDouble();
        Database databaseLayerObject=new Database(principleAmount,rateOfInterest,timePeriod);
        Business businessLayerObject=new Business(databaseLayerObject);
        LOGGER.info("Simple Interest is:Rs "+(float)businessLayerObject.simpleInterest());
        LOGGER.info("Compound Interest is:Rs "+(float)businessLayerObject.compoundInterest());
   input.close();
    }
}
