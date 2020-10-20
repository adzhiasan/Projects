package com.company;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("text.txt");
            int m = fr.read();
            char prev = ' ';
            int n = 0;
            while(m != -1) {
                System.out.print((char)m);
                if(m == '\n')
                    m = ' ';
                if(prev == ' ' && m != ' ')
                    n++;
                prev = (char)m;
                m = fr.read();
            }
            fr.close();
            System.out.println("\n" + n);
        }
        catch(IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
