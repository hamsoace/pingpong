import models.Pingpong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Ping Pong game!");
        System.out.println("Enter any number: ");
        try{
            String usersNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(usersNumber);
            Pingpong pingpong = new Pingpong();
            ArrayList<Object>pingpongResult = pingpong.playPingPong(intUserNumber);
            System.out.println(pingpongResult);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
