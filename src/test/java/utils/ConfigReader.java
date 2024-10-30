package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config/config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties file not found");
            }
            properties.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Error loading config.properties file", ex);
        }
    }  

    
    public static String getBrowser() {
    	return properties.getProperty("browser");
    }
    
    public static String getBaseUrl() {
    	return properties.getProperty("base.url");
    }
    
    public static String getPageLoadTimeout() {
    	return properties.getProperty("page.load.timeout");
    }
    
    public static long getWebDriverWaitTimeout() {
    	return Long.parseLong(properties.getProperty("webdriver.wait.timeout"));
    }
    
    // Login Page URLs
    public static String getLoginUrl() {
    	return properties.getProperty("login.url");
    }
    
    // Login Page URLs
    public static String getHomeUrl() {
    	return properties.getProperty("home.url");
    }
    
    // Tree Page URLs
    public static String getTreeUrl() {
    	return properties.getProperty("tree.url");
    }
    
    public static String getOverviewOfTreesUrl() {
    	return properties.getProperty("tree.overview.of.trees.url");
    }
    
    public static String getTreeTerminologiesUrl() {
    	return properties.getProperty("tree.terminologies.url");
    }
    
    public static String getTypesOfTreesUrl() {
    	return properties.getProperty("tree.types.of.trees");
    }
    
    public static String getTreeTraversalsUrl() {
    	return properties.getProperty("tree.tree.traversals");
    }
    
    public static String getTreeTraversalsIllustrationsUrl() {
    	return properties.getProperty("tree.traversals.illustrations");
    }
    
    public static String getBinaryTreesUrl() {
    	return properties.getProperty("tree.binary.trees");
    }
    
    public static String getTypesOfBinaryTreesUrl() {
    	return properties.getProperty("tree.types.of.binary.trees");
    }
    
    public static String getTreeImplementationInPythonUrl() {
    	return properties.getProperty("tree.implementation.in.python");
    }
    
    public static String getBinaryTreeTraversalsUrl() {
    	return properties.getProperty("tree.binary.tree.traversals");
    }
    
    public static String getImplementationOfBinaryTreesUrl() {
    	return properties.getProperty("tree.implementation.of.binary.trees");
    }
    
    public static String getApplicationsOfBinaryTreesUrl() {
    	return properties.getProperty("tree.applications.of.binary.trees");
    }
    
    public static String getBinarySearchTreesUrl() {
    	return properties.getProperty("tree.binary.search.trees");
    }
    
    public static String getImplementationOfBstUrl() {
    	return properties.getProperty("tree.implementation.of.bst");
    }
    
    public static String getTreePracticeUrl() {
    	return properties.getProperty("tree.practice");
    }
    
    // Graph Page URLs
    public static String getGraphHomeUrl() {
    	return properties.getProperty("graph.home.url");
    }
    
    public static String getGraphUrl() {
    	return properties.getProperty("graph.url");
    }
    
    public static String getGraphRepresentationsUrl() {
    	return properties.getProperty("graph.representations.url");
    } 
    
    public static String getGraphPracticeUrl() {
    	return properties.getProperty("graph.practice.url");
    }
    
    // Try Editor URL
    public static String getTryEditorUrl() {
    	return properties.getProperty("try.editor.url");
    }    
    
}