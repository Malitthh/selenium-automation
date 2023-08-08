package org.test.util.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

    private Properties pro;

    public ConfigDataProvider(String configFilePath) {
        loadConfig(configFilePath);
    }

    private void loadConfig(String configFilePath) {
        pro = new Properties();
        try (FileInputStream fis = new FileInputStream(configFilePath)) {
            pro.load(fis);
        } catch (IOException e) {
            System.out.println("Not able to load config file: " + e.getMessage());
        }
    }

    public String getDataFromConfig(String keyToSearch) {
        return pro.getProperty(keyToSearch);
    }

    public String getBrowser() {
        return getDataFromConfig("Browser");
    }

    public String getQAURL() {
        return getDataFromConfig("QAURL");
    }
}
