/**
 *
 * @author adrian
 */
public class PracticaExamen1 {
    
    public static int mult(int a, int b){
        if(b>1){
            a = a*2;
            b = b/2;
            return mult(a,b)+ ((b%2==2)?0:a);
        }
        return 0;
    }
    
    public static int min(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int ad = (min%2==0)?0:max;
        return ad+mult(max,min);
    }
    
    public static void main(String [] args){
        System.out.println(min(3,3));
    }
    
}
