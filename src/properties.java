import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**@author Marco Schubert*/
/**stores all important values into properties file in src folder*/
public class properties {
    
    private String server;
    private String port;
    private String database;
    private String user;
    private String password;
    private String dbEngine;
    private String tableSuffix;

    private String view;
    private String search;
    private String searchFrom;
    private String searchTo;
    
    
    Properties prop = new Properties();
    
    public void setProperty(String server, String port, String database, String user, String password,String dbEngine,String tableSuffix){
        
        this.server = server;
        this.port = port;
        this.database =database;
        this.user = user;
        this.password = password;
        this.dbEngine = dbEngine;
        this.tableSuffix = tableSuffix;
       
       
	OutputStream output = null;

	try {

		output = new FileOutputStream("config.properties");

		// set the properties value
		this.prop.setProperty("server", this.server);
		this.prop.setProperty("port", this.port);
		this.prop.setProperty("database", this.database);
                this.prop.setProperty("user", this.user);
                this.prop.setProperty("password", this.password);
                this.prop.setProperty("engine", this.dbEngine);
                this.prop.setProperty("tableSuffix", this.tableSuffix);

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
    }
    

    public String getProperty(String name){
        
        Properties prop = new Properties();
        
        InputStream input = null;

	try {

		input = new FileInputStream("config.properties");

		// load a properties file
		prop.load(input);
		

	} catch (IOException ex) {
		ex.printStackTrace();
	}
        
        if("server".equals(name)){
            return prop.getProperty("server");
        }
        
        if ("port".equals(name)){
            return prop.getProperty("port");
        }
        
        if("database".equals(name)){
            return prop.getProperty("database");
        }
        
        if("user".equals(name)){
            return prop.getProperty("user");
        }
        
        if("password".equals(name)){
            return prop.getProperty("password");
        }
        
        if("engine".equals(name)){
            return prop.getProperty("engine");
        }
        
        if("tableSuffix".equals(name)){
            return prop.getProperty("tableSuffix");
        }
        
        return null;
    }
    
    
    
    public void setView(String view){
        
        this.view = view;
	OutputStream output = null;

	try {
		output = new FileOutputStream("config.view");

		// set the properties value
		this.prop.setProperty("view", this.view);


		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
    }
    
    
    public void setAssignmentNotDoneCsvData(String view){
        
        this.view = view;
	OutputStream output = null;

	try {
		output = new FileOutputStream("config.view");

		// set the properties value
		this.prop.setProperty("view", this.view);


		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
    }
    
    
    
    
     public String getView(String name){
        
        Properties prop = new Properties();
        
        InputStream input = null;

	try {

		input = new FileInputStream("config.view");

		// load a properties file
		prop.load(input);
		

	} catch (IOException ex) {
		ex.printStackTrace();
	}
        
        if("view".equals(name)){
            return prop.getProperty("view");
        }
        
        return null;
    }
     
     
     
     
     
public void setSearch(String searchFrom, String searchTo){
        

        this.searchFrom = searchFrom;
        this.searchTo = searchTo;
        
        
       
	OutputStream output = null;

	try {

		output = new FileOutputStream("config.search");

		// set the properties value
		this.prop.setProperty("searchFrom", this.searchFrom);
		this.prop.setProperty("searchTo", this.searchTo);
		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
    }
     
     
    public String getSearch(String name){
        
        Properties prop = new Properties();
        
        InputStream input = null;

	try {

		input = new FileInputStream("config.search");

		// load a properties file
		prop.load(input);
		

	} catch (IOException ex) {
		ex.printStackTrace();
	}
        
        if("searchFrom".equals(name)){
            return prop.getProperty("searchFrom");
        }
        
        if ("searchTo".equals(name)){
            return prop.getProperty("searchTo");
        }
        
        return null;
    }
    
    
 
    
}
