/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landscapecompany;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esmeralda.iyescas001
 */
//size of yard
//cost of the service
//number of pets
 class LandScaping{
        int sizeOfLawn;
        int numOfPets;
        double price;

        public LandScaping(int sizeOfLawn, double price, int numOfPets) {
            this.sizeOfLawn = sizeOfLawn;
            this.numOfPets = numOfPets;
            this.price = price;
        }

        @Override
        public String toString() {
            return "LandScaping{" + "sizeOfLawn=" + sizeOfLawn + ", numOfPets=" + numOfPets + ", price=" + price + '}';
        }

    public int getSizeOfLawn() {
        return sizeOfLawn;
    }

    public int getNumOfPets() {
        return numOfPets;
    }

    public double getPrice() {
        return price;
    }
        
        //getters only because we are not taking input 
        
        
        
    }
public class LandscapeCompany {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        
        // TODO code application logic here
            //Write a program that reads in th csv data
            //sqaure footage of lawn, price of the service, number of pets
            //read in the data into an ArrayList (use a class)
            //make a menu system where you ask the user whether they want to search
            //by yard size, price or number of pets
            //depending on what the user wants to know... show the user the info about the lawns !
         
            ArrayList<LandScaping> arrayList = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
        try {
            FileReader fr = new FileReader("LandscapingData.csv");
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String [] elements = line.split(",");
                arrayList.add(new LandScaping(Integer.parseInt(elements[0]), Double.parseDouble(elements[1]), Integer.parseInt(elements[2])));
            }
     
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LandscapeCompany.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int userInput = scan.nextInt();
        do {
            System.out.println("Press 1: To search lawn by size");
            System.out.println("Press 2: To search lawn by price");
            System.out.println("Press 3: To search by number of pets");
            System.out.println("Press 4: Quit");
            userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    Collections.sort(arrayList);
                    for (LandScaping ls : arrayList) {
                        System.out.println(ls);
                    }
                    break;
                case 2: 
                    
                    for(LandScaping ls : arrayList){
                        System.out.println(ls);
                    }
                    break;
                case 3: 
                    Collections.sort(ls.getNumOfPets() );
                    for(LandScaping ls : arrayList){
                        System.out.println(ls);
                    }
                    break;
                
            }

            System.out.println("Press 1: To search lawn by size");

        } while (userInput != 0);
        //
        // i = scan.nextInt();


    
    }
}
