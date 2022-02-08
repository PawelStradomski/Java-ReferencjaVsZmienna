
package referencjavszmienna;
/**
 * 
 * @author pawelstradomski
 */

public class ReferencjaVsZmienna {

    
    public static void main(String[] args) {
        
        int a = 5; // tutaj przyporzadkowuje do etykiety wartosc liczbowa
        int b = a;
        
        b = 30;
        
        System.out.println(a);
        
        Test x = new Test();     // W "x" znaduje sie TYLKO ADRES (zmienna referencyjna),
        Test y = x;              // a wartosc zwyklej zmiennej prymitywnej np int a = 1 pozostaje taka sama.
//        y.a = 40;
        System.out.println(x.a); // W class jest tak, ze zmienia sie tylko ADRES (zmienna referencyjna),
                                 // a wartosc zmiennej prymitywnej pozostaje taka sama.
        
    }                          
    
}
class Test
{
    int a = 20;
}