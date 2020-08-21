/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisadominguez
 */
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("MyText.txt");
            int character;
            while ((character = reader.read()) != -1){
                System.out.print((char) character);
            }
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
