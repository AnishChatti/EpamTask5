package epam.logger_task2;


public class Business {
	double principle,rate;
	double time;
	
double simpleInterest()
{
double simpleInterest=principle*rate*time;
return simpleInterest/100;
	
}
double compoundInterest()
{
	double compoundInterest=principle*(float)Math.pow(1+rate/100,time);
	return compoundInterest-principle;
}
Business(Database data)
{principle=data.principleAmount;
rate=data.rateOfInterest;
time=data.timePeriod;	
}
}