package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
    public static void main(String[] args) throws IOException {

        People[] p = new People[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(People people : p){
            System.out.print("이름 입력: ");
            String name = br.readLine();
            System.out.print("나이 입력: ");
            int age = Integer.parseInt(br.readLine());
            people = new People(name, age);
            people.print();
        }
        br.close();


    }
}
