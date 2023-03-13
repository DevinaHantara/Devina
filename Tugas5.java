/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tugas5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double Keyboard = 49.99;
        double Mouse = 19.99;
        double Monitor = 99.99;


        System.out.println("Es Companies Portal - Cashier App 2");
        System.out.println("===================================");
        System.out.println("1. Keyboard - $49.99.");
        System.out.println("2. Mouse - $19.99.");
        System.out.println("3. Monitor - $99.99.");
        System.out.println("4. Exit");

        System.out.println("Choose : ");
        int Choose = scn.nextInt();
        System.out.println("Input quantity [1...20]: ");
        int quantity = scn.nextInt();
        if (quantity > 20){
            System.out.println("Out Of Stock!");
            System.out.println("\n Thanks for using this application :D");
            System.exit(0);
        }
        double money = 0;
        double total = 0;
        System.out.println("Es Companies Portal - Cashier App 2");
        System.out.println("===================================");
         switch (Choose) {
            case 1:
            System.out.println("Item's name: Keyboard");
            System.out.println("Price      : 49.99");
            System.out.println("Quantity   : "+ quantity);
            System.out.println("");
            total = Keyboard*quantity;
            System.out.println("Total : "+ total);
            System.out.print("Input your money [min" + total +"] : ");
            money = scn.nextDouble();
            if (money < total){
                System.out.println("Not Enough Money!");
            } else{
                System.out.println("Thanks for purchasing!");
                System.out.println("Your change : "+ (money - total));
            }
            System.out.println("\n Thanks for using this application :D");
                break;
            case 2:
            System.out.println("Item's name: Mouse");
            System.out.println("Price      : 19.99");
            System.out.println("Quantity   : "+ quantity);
            System.out.println("");
            total = Mouse*quantity;
            System.out.println("Total : "+ total);
            System.out.print("Input your money [min" + total +"] : ");
            money = scn.nextDouble();
            if (money < total){
                System.out.println("Not Enough Money!");
            } else{
                System.out.println("Thanks for purchasing!");
                System.out.println("Your change : "+ (money - total));
            }
            System.out.println("\n Thanks for using this application :D");
                break;
            case 3:
            System.out.println("Item's name: Monitor");
            System.out.println("Price      : 99.99");
            System.out.println("Quantity   : "+ quantity);
            System.out.println("");
            total = Monitor*quantity;
            System.out.println("Total : "+ total);
            System.out.print("Input your money [min" + total +"] : ");
            money = scn.nextDouble();
            if (money < total){
                System.out.println("Not Enough Money!");
            } else{
                System.out.println("Thanks for purchasing!");
                System.out.println("Your change : "+ (money - total));
            }
            System.out.println("\n Thanks for using this application :D");
                break;
            case 4:
            System.out.println("4. Exit");
                break;
            default:
                break;
                    
                    }       
                }
            }
