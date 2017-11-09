import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j {
	
	@Test
	public void testA(){
		
		//Configure the log4j
		BasicConfigurator.configure();
		
		//Craete log4j object
		Logger log = Logger.getLogger("Log4j");
		
		//print the message
		log.info("Ganesh");
		
		
	}

}
