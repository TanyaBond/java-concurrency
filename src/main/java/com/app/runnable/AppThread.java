package com.app.runnable;

import java.io.*;

public class AppThread extends Thread {

    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/text.txt")))){

            String line= null;

            while ((line =reader.readLine()) !=null){
                System.out.println(Thread.currentThread().getName() + " reading the line: " + line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
