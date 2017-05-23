import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	private static final Log log = LogFactory.getLog(DemoApp.class); 
	
	public static void main(String[] args) {
		  try {  
	            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");  
	            context.start();  
	        } catch (Exception e) {  
	            log.error("== DubboProvider context start error:", e);  
	        }  
	        synchronized (DemoApp.class) {  
	            while (true) {  
	                try {  
	                	DemoApp.class.wait();  
	                } catch (InterruptedException e) {  
	                    log.error("== synchronized error:", e);  
	                    log.info(e);  
	                }  
	            }  
	        }  
	}
}
