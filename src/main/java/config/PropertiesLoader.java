package config;

import java.io.*;
import java.util.Properties;

/**
 * @ClassName config.PropertiesLoader
 * @Description properties file loader class
 * @Author ericp
 * @Date 6/28/19 2:26 PM
 * @Version 1.0
 **/
public class PropertiesLoader {
    private Properties properties;

    public PropertiesLoader(String filePath) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(new File(filePath)));
        properties.load(is);
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}