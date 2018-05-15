package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class studentApp {

    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println(s1.toString());
        Student s2 = new Student("Safe",90,"Female", 190);
        System.out.println(s2.toString());

        //input data from user
        Student s3 = new Student();
        //s3 = inputData(s3); //s
        s3 = inputDataBuffer(s3);
        System.out.println(s3.toString());

    }//main
    private static Student inputDataBuffer(Student s3) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your information: ");
        System.out.print("Name: ");
        s3.setName(reader.readLine());
        System.out.print("Age: ");
        s3.setAge(Integer.parseInt(reader.readLine()));
        System.out.print("Gender: ");
        s3.setGender(reader.readLine());
        System.out.print("Height: ");
        s3.setHeight(Double.parseDouble(reader.readLine()));

        return s3;



    }

    private static Student inputData(Student s3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your information");
        System.out.print("Name: ");
        s3.setName (sc.nextLine());
        System.out.print("Age: ");
        s3.setAge (sc.nextInt());
        System.out.print("Gender: ");
        s3.setGender(sc.nextLine());
        System.out.print("Height: ");
        s3.setHeight(sc.nextDouble());

        return s3;
    }

}
