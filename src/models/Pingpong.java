package models;


import java.util.ArrayList;

public class Pingpong {
    public static void main(String[] args){
        System.out.println("Hello, Welcome to PingPong!");
    }
    public ArrayList<Object> playPingPong(int countUpTo){
        ArrayList<Object> result = new ArrayList<Object>();
        for (int i = 1; i <= countUpTo; i++){
            if (i % 3 == 0 && i % 5 ==0){
                result.add("Ping Pong");
            }else if(i % 3 == 0){
                result.add("Ping!");
            }else if(i % 5 == 0){
                result.add("Pong!");
            }else{
                result.add(i);
            }
        }
        return result;
        }

    }
