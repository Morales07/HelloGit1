import java.util.LinkedList;
import java.util.Scanner;
public class HolaGit {
    public HolaGit()
    {
        //Esta es una linea editada por Fco Navarro
        int Git = 0;
    }
public void dividir() {
    Scanner reader = new Scanner(System.in);
    Scanner m = new Scanner(System.in);
    int numero1 = 2;
    int numero2 = 2;
    int resultado;
    System.out.println("*/*/*/*La division de dos numero*/*/*/*");
    System.out.println("Dame un numero");
    numero1 = m.nextInt();
    System.out.println("Dame un numero");
    numero2 = m.nextInt();
    System.out.println("La divicion de: " + numero1 + "," + numero2 + "es:" + numero1 / numero2);
}
    public void potencia(int base, int exponente) {
        int resultado = (int) Math.pow(base, exponente);
        System.out.println("La potenia de " + base + " ^ " + exponente + " es: " + resultado);
    }

    //Metodo resta
    public Double resta(double num1, double num2){
        double res;
        res = num1 - num2;
        return res;
    }



    public LinkedList<String> tabla12(){

        LinkedList<String> lista = new LinkedList<>();

        int valor  = 0;

        for (int i = 1; i <= 10 ; i++) {

            valor = 12 * i;

            lista.add("12 * " + i + "= " + valor);

        }

        return lista;
    }


    public double suma (double num1, double num2)
    {
        double suma;
        suma = num1 + num2;
        return suma;
    }
}
