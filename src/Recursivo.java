/**
 * Practica.
 * Escribir un algoritmo que diga cuantos digitos tiene  un numero por
 * recursion  de pila y recursion de cola
 * Invertir un numero de forma recursiva
 * Cantidad de cifras en un numero por recursion de Pila y Cola
 * Fibonnaci de Pila y Cola
 */
public class Recursivo {
     
    public static int invertirIntPila(int n){
        if(n<=9)return n;
        return 10 * invertirIntPila(n/10)+(n%10);
    }
    private static int invertirIntC(int n, int r){
            return (n<=0) ? r : invertirIntC(n/10, 10*r + n%10);
    }
    public static int invertirIntCola(int n){
        return invertirIntC(n,0);
    }
    
    public static int sizePila(int n){//cantidad de cifras
        return (n <= 0) ? 0 : 1 + sizePila(n / 10);
    }
    
    private static int sizeDeCola(int n, int c){
        return (n <= 0) ? c : sizeDeCola(n / 10, c + 1);
    }
    
    public static int sizeCola(int n){
        return sizeDeCola(n,0);
    }
    
    public static long fiboPila(int n){//O(2^n)
        return (n==0)?0:(n==1)?1:fiboPila(n-1)+fiboPila(n-2);
    }
    private static long fiboDeCola(int n, int a, int b){//O(n)
        return (n<0) ? a : ((n==1||n==2) ? a+b : fiboDeCola(n-1, b, a+b));
    }
    public static long fibonnacciDeCola(int n){
        return fiboDeCola(n,0,1);
    }
    
    public static void main(String []args){
        int n = 54321;
        System.out.println("Invertir por recursion de Pila: \nn="+n+"\t"+invertirIntPila(n));
        System.out.println("Invertir por recursion de Cola: \nn="+n+"\t"+invertirIntCola(n));
        System.out.println("Cantidad de cifras en un numero por Pila: \nn="+n+"\t"+sizePila(n));
        System.out.println("Cantidad de cifras en un numero por Cola: \nn="+n+"\t"+sizeCola(n));
        n = 8;
        System.out.println("Fibonnaci de Pila: \nn="+n+"\t"+fiboPila(n));
        System.out.println("Fibonnaci de Cola: \nn="+n+"\t"+fibonnacciDeCola(n));
        
    }
}