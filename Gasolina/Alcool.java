
/**
 * Write a description of class Alcool here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alcool
{
   public static void main(String[] args){
    double alcool = 3.00,gasolina = 4.60;
    gasolina = gasolina *0.7;
    if(gasolina < alcool){
        System.out.println("Gasolina e melhor valor"+gasolina);
    }else {
        System.out.println("Alcool e melhor");
    }
    }
}
