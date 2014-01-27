package org.tfa.ess.test.app;

import java.io.InputStream;
import java.net.URL;
import org.apache.commons.io.IOUtils;

//import org.tfa.ess.lib.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println( "Changed World!" );
        System.out.println( "Hello World!" );
//        JenkinsUtils jenkinsUtils = new JenkinsUtils();
//        jenkinsUtils.printWelcome();
        InputStream in = null;
        
        App app = new App();
        
        in = app.getAppInputStream("http://jakarta.apache.org");
/*        try {
        	
          in = new URL( "http://jakarta.apache.org" ).openStream();
          System.out.println( IOUtils.toString( in ) );
        } catch (Exception e) {
        	
        } finally {
        	if (in != null)
        		IOUtils.closeQuietly(in);
        }*/        
    }
    
    final InputStream getAppInputStream(String url) {
        InputStream in = null;
        //int i = 5/0;
        try {        	
          in = new URL( url ).openStream();
      		
        } catch (Exception e) {
        	//Todo: print error stack
        } finally {
        	if (in != null)
        		IOUtils.closeQuietly(in);
        }  
        
        return in;
    }
}
