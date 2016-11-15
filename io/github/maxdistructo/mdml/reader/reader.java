package io.github.maxdistructo.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class reader{
  public static void reader(String file, int line, String var){
        FileInputStream fs = null;
        BufferedReader br;
        int cntr = 0;
        try {
            fs = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(new InputStreamReader(fs)); //Initialize BufferedReader
        while(cntr < line){ //Changes the line that the program is reading to the one I want to read
            try{
                br.readLine();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            cntr++;
        }
        try {
            var = br.readLine(); //Stores the line I want to read to the String var specified by the user.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void intReader(String file, int line, String var){
        FileInputStream fs = null;
        BufferedReader br;
        int cntr = 0;
        try {
            fs = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(new InputStreamReader(fs)); //Initialize BufferedReader
        while(cntr < line){ //Changes the line that the program is reading to the one I want to read
            try {
                br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            cntr++;
        }
        try {
            var = br.readLine(); //Stores the line I want to read to the String var specified by the user.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }