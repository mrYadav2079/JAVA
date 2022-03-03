package Assignment_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ping_Demo {
     static void runSystemCommand( ArrayList<String> commandList) {

        try {
            ProcessBuilder build = new ProcessBuilder(commandList);
            Process process= build.start();
            BufferedReader inputStream = new BufferedReader( new InputStreamReader(process.getInputStream()));

            String s = "";

            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                //p.destroy();
            }
        }
        catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ping");
        list.add("www.google.com");
        runSystemCommand(list);
    }
}
