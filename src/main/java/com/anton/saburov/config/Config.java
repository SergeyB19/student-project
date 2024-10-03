package com.anton.saburov.config;

import java.io.*;
import java.util.Properties;

public class Config {
    public static final String DB_URL = "db.url";
    public static final String DB_LOGIN = "db.login";
    public static final String DB_PASSWORD = "db.password";
    public static final String DB_LIMIT = "db.limit";

    private static Properties properties = new Properties();

    public synchronized static String getProperty(String name) {
        if (properties.isEmpty()) {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/dao.properties"))) {
                properties.load(bis);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
          /*  try (InputStream is = Config.class.getClassLoader().getResourceAsStream("dao.properties")) {
                properties.load(is);
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }*/
       /*     try(InputStream is = Config.class.getClassLoader()
                    .getResourceAsStream("dao.properties")) {

                properties.load(is);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }*/

        }
        return properties.getProperty(name);
    }
}
