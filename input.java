import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.xml.stream.util.StreamReaderDelegate;

import java.io.IOException;
import java.io.InputStreamReader;

public class input {

    public static void main(String [] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        String a = br.readline();
        isr.close();
        System.out.println(a);

        int b = isr.read();
        System.out.println(b);

        int c= isr.read();
        System.out.println(c);

        InputStreamReader newisr=new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(newisr);

        int number =Integer.parseInt(bufferedReader.readLine());
        System.out.println()
    }
    
}
