/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expensetrackerv3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Xezt
 */
public class DataLoader {
    
    public double foodExpense = 0, transportExpense = 0, billsExpense = 0, otherExpense = 0;
    
    public String dataLoad(String name) throws FileNotFoundException, IOException{
    
        File f = new File("budget.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        String st, el;
        st = br.readLine();
        String[] splitted = st.split(" ");
        double one, two, three, four, five;
        
        one = Double.parseDouble(splitted[0]);
        one = Math.round(one * 100.0) / 100.0;
        
        two = Double.parseDouble(splitted[1]);
        two = Math.round(two * 100.0) / 100.0;
        
        three = Double.parseDouble(splitted[2]);
        three = Math.round(three * 100.0) / 100.0;
        
        four = Double.parseDouble(splitted[3]);
        four = Math.round(four * 100.0) / 100.0;
        
        five = Double.parseDouble(splitted[4]);
        five = Math.round(five * 100.0) / 100.0;
        

        String ret = null;
        
        if(name.equalsIgnoreCase("food"))
            ret = String.valueOf(one);
        else if(name.equalsIgnoreCase("transport"))
            ret = String.valueOf(two);
        else if(name.equalsIgnoreCase("bills"))
            ret = String.valueOf(three);
        else if(name.equalsIgnoreCase("other"))
            ret = String.valueOf(four);
        else if(name.equalsIgnoreCase("savings"))
            ret = String.valueOf(five);
        
        return ret;
    }
    
    public String expenseLoad(){
        
        String allExpense = "";
        String sf = "";
        
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

                if(category.equals("Food")){
                    foodExpense += price;
                }else if(category.equals("Transport")){
                    transportExpense += price;
                }else if(category.equals("Bills")){
                    billsExpense += price;
                }else if(category.equals("Other")){
                    otherExpense += price;
                }
                sf = String.format("%10s %15s %15s %10.2f\n", name, category, date, price);              
                allExpense = allExpense + sf;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return allExpense;
    }
    
}
