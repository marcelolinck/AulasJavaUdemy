package src;
import java.util.Locale;

public class Aula24 {
/**
 * @param args
 */
public static void main(String[] args) {
        
    //     System.out.println(Locale.getDefault());
    //     System.out.println(System.getProperty("file.encoding"));
    // //Somente o print nao quebra a linha
    //     System.out.print("Olá mundo!");
    //     //Com println quebra a linha
    //     System.out.println("Olá bom dia!");
       
    //     int y = 32;
    //     System.out.println(y);

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        //mostrando todo o numero
        System.out.println(x);
        //Dessa forma irá delimitar em duas casas decimais para não ficar muito extenso
        System.out.printf("%.2f%n", x);

        //Dessa forma irá delimitar em duas casas decimais para não ficar muito extenso
        System.out.printf("%.4f%n", x);

        //Dessa forma irá mudar o locale para o local correspondente abaixo. Isso se usa quando se quer mudar o local do app e por sua vez nesse caso irá mudar de 
        //virgula para ponto para delimitar as casas decimais.
        Locale.setDefault(Locale.US);
        
        System.out.printf("%.4f%n", x);

        System.out.println("Resultado = " + x+ " Metros.");

        System.out.printf("Resultado = %.2f Metros. %n", x);
        Locale.setDefault(Locale.getDefault());
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais. %n", nome, idade, renda);
    }    
}
