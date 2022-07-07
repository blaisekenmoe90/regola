import java.util.Scanner;




public class Persona {
    public String name;
    public String cognome;
    public Number eta;

    public void saluta(){
        System.out.println("Cioa ragazzi Mi chiamo " + name 
        
        
        + "cognome " + cognome  + " e ho" +eta);
    }

public static void main(String [] args){

 Scanner Tastiera = new Scanner(System.in);

Persona p1 = new Persona();


p1.saluta();
p1.name="kenmoe";




}}