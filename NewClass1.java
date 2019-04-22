/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSH.YUSUF
 */
import java.util.Scanner;
public class NewClass1 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Input a b c : ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double D;
    
    if(a==0){
        System.out.println(" ");
        System.out.println("Output : ");
        System.out.println("Nilai a tidak boleh nol");
    }else if(a!=0 && b>=0 && c>=0){
        System.out.println(" ");
        System.out.println("Output : ");
        System.out.println("Polinomial "+ a +"x^2 + "+ b +"x + "+c+ " memiliki ");
        D = b*b - 4*a*c;
        System.out.println("1. Diskriminan          : " + D);    
    double X1 = (-b + Math.sqrt(D))/(2*a);
    double X2 = (-b - Math.sqrt(D))/(2*a);       
    double x1 = (-b + Math.sqrt(-D))/(2*a);  
    double x2 = (-b - Math.sqrt(-D))/(2*a);  
    if(D>=0){  
        System.out.println("2. Akar-akar polinomial : " + X1 + " dan " + X2); 
    }else if(D<0){
        System.out.println("2. Akar-akar polinomial : " + x1 + "i dan " + x2 +"i");
    }
    double S1 = -b/(2*a);
    double S2 = -D/(4*a);
        System.out.println("3. Titik Stasioner      : (" + S1 + "," + S2 + ")");
    if(a>0){
        System.out.println("4. Kecekungan Kurva     : Atas " );
    }else if(a<0){
        System.out.println("4. Kecekungan Kurva     : Bawah ");
    }
    if(a>0){
        System.out.println("5. Nilai minimum lokal  : " + S2);
    }else if(a<0){
        System.out.println("5. Nilai maksimun lokal : " + S2);
    }
    
        
    }else if(a!=0 && b<0 && c>=0){
        System.out.println(" ");
        System.out.println("Output : "); 
        System.out.println("Polinomial "+ a +"x^2 "+ b +"x + "+c+" memiliki ");
        D = b*b - 4*a*c;
        System.out.println("1. Diskriminan          : " + D);    
    double X1 = (-b + Math.sqrt(D))/(2*a);
    double X2 = (-b - Math.sqrt(D))/(2*a);       
    double x1 = (-b + Math.sqrt(-D))/(2*a);  
    double x2 = (-b - Math.sqrt(-D))/(2*a);  
    if(D>=0){  
        System.out.println("2. Akar-akar polinomial : " + X1 + " dan " + X2); 
    }else if(D<0){
        System.out.println("2. Akar-akar polinomial : " + x1 + "i dan " + x2 +"i");
    }
    double S1 = -b/(2*a);
    double S2 = -D/(4*a);
        System.out.println("3. Titik Stasioner      : (" + S1 + "," + S2 + ")");
    if(a>0){
        System.out.println("4. Kecekungan Kurva     : Atas " );
    }else if(a<0){
        System.out.println("4. Kecekungan Kurva     : Bawah ");
    }
    if(a>0){
        System.out.println("5. Nilai minimum lokal  : " + S2);
    }else if(a<0){
        System.out.println("5. Nilai maksimun lokal : " + S2);
    }
    
    }else if(a!=0 && b>=0 && c<0){
         System.out.println("Polinomial "+ a +"x^2 + "+ b +"x "+c+ " memiliki ");
        D = b*b - 4*a*c;
        System.out.println("1. Diskriminan          : " + D);    
    double X1 = (-b + Math.sqrt(D))/(2*a);
    double X2 = (-b - Math.sqrt(D))/(2*a);       
    double x1 = (-b + Math.sqrt(-D))/(2*a);  
    double x2 = (-b - Math.sqrt(-D))/(2*a);  
    if(D>=0){  
        System.out.println("2. Akar-akar polinomial : " + X1 + " dan " + X2); 
    }else if(D<0){
        System.out.println("2. Akar-akar polinomial : " + x1 + "i dan " + x2 +"i");
    }
    double S1 = -b/(2*a);
    double S2 = -D/(4*a);
        System.out.println("3. Titik Stasioner      : (" + S1 + "," + S2 + ")");
    if(a>0){
        System.out.println("4. Kecekungan Kurva     : Atas " );
    }else if(a<0){
        System.out.println("4. Kecekungan Kurva     : Bawah ");
    }
    if(a>0){
        System.out.println("5. Nilai minimum lokal  : " + S2);
    }else if(a<0){
        System.out.println("5. Nilai maksimun lokal : " + S2);
    }
    
    }else if(a!=0 && b<0 && c<0){
        System.out.println(" ");
        System.out.println("Output : "); 
        System.out.println("Polinomial "+ a +"x^2 "+ b +"x "+c+ " memiliki ");
        D = b*b - 4*a*c;
        System.out.println("1. Diskriminan          : " + D);    
    double X1 = (-b + Math.sqrt(D))/(2*a);
    double X2 = (-b - Math.sqrt(D))/(2*a);       
    double x1 = (-b + Math.sqrt(-D))/(2*a);  
    double x2 = (-b - Math.sqrt(-D))/(2*a);  
    if(D>=0){  
        System.out.println("2. Akar-akar polinomial : " + X1 + " dan " + X2); 
    }else if(D<0){
        System.out.println("2. Akar-akar polinomial : " + x1 + "i dan " + x2 +"i");
    }
    double S1 = -b/(2*a);
    double S2 = -D/(4*a);
        System.out.println("3. Titik Stasioner      : (" + S1 + "," + S2 + ")");
    if(a>0){
        System.out.println("4. Kecekungan Kurva     : Atas " );
    }else if(a<0){
        System.out.println("4. Kecekungan Kurva     : Bawah ");
    }
    if(a>0){
        System.out.println("5. Nilai minimum lokal  : " + S2);
    }else if(a<0){
        System.out.println("5. Nilai maksimun lokal : " + S2);
    }
    }
        
 }

}
       
    

