package config;

import java.io.*;
import java.util.Properties;

/**
 * properties file loader class
 * @author ericp
 * @version 1.0
 * @since 6/28/19 2:26 PM
 */
public class PropertiesLoader {
    private Properties properties;
    private InputStream inputStream;

    public PropertiesLoader(String filePath) throws IOException {
        this.inputStream = new BufferedInputStream (new FileInputStream(filePath));
        this.properties = new Properties();
        properties.load(inputStream);
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) throws IOException {
        this.properties = properties;
    }
}