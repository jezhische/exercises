package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by Ежище on 03.03.2017.
 */
public class PropProbe2 {

    private String message;
    private int[] count;

    private PropProbe2(String message, int[] count) {
        this.message = message;
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public static PropProbe2 getProbe(String propPath) {
        File file = new File(propPath);
        String message = null;
        int[] count = null;
        try (FileInputStream fis = new FileInputStream(file)) {
            Properties prop = new Properties();
            prop.load(fis);
            String CORE = prop.getProperty("core");
            String MOVE = prop.getProperty("move");
            String COUNT = prop.getProperty("count");
            String ARRCOUNT[] = COUNT.split(", ");
            count = new int[ARRCOUNT.length];
            for (int i = 0; i < ARRCOUNT.length; i++)
                count[i] = Integer.valueOf(ARRCOUNT[i]);
            message = Arrays.toString(count) + " " + CORE + " " + MOVE;

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            return new PropProbe2(message, count);
        }
    }

    public static void main(String[] args) {
        System.out.println(PropProbe2.getProbe("src\\main\\resources\\propProbe2.properties").getMessage());

    }
}
