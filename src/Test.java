
import expensetrackerv3.Expense;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xezt
 */
public class Test {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
    

        try(Scanner sc = new Scanner(new File("expense.txt"))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String name, category, date;
                double price;
                StringTokenizer st = new StringTokenizer(line);

                name = st.nextToken();
                price = Double.parseDouble(st.nextToken());
                category = st.nextToken();
                date = st.nextToken();


                Expense exp = new Expense(name, category, date, price);
                System.out.println(exp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
    }
    
}
