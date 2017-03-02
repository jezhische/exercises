package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by WORK_x64 on 02.03.2017.
 * http://devcolibri.com/3408
 * еще:  https://habrahabr.ru/post/194658/
 */
public class Main {
    public static void main(String[] args) {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);

            String host = property.getProperty("db.host");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");

            System.out.println("HOST: " + host
                    + ", LOGIN: " + login
                    + ", PASSWORD: " + password);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }

    }
}
