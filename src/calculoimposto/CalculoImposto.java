
package br.com.satc;

import java.text.DecimalFormat;
import java.util.Scanner;
/* Este programa calcula a quantidade de impostos
a serem pagos em um produto.
*/


public class CalculoImposto {


    public static void main(String[] args) {
        
        /*DecimalFormat
        DecimalFormat df = new DecimalFormat("0.##");
        String saida = df.format(divisao);
        System.out.print(saida);
        */
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        Scanner entrada = new Scanner (System.in);
            System.out.print("Valor do produto (R$): ");
            float valor=entrada.nextFloat();
            System.out.print("Foi fabricado no Brasil? (Sim) ou (Não): ");
                String produto = entrada.next();
                if ((produto.toUpperCase().equals("SIM")) && (valor<1000)) {
                    double imposto = (0.10*valor);
                    System.out.println("Valor do produto sem imposto: "+df.format(valor-imposto));
                    System.out.println("Valor de imposto pago: "+df.format(imposto));
                    System.out.println("Vaor do produto com imposto: "+df.format((1.10*valor)));
  
    } else if ((produto.toUpperCase().equals("SIM")) && (valor>=1000)) {
                double imposto2 = (0.15*valor);
                System.out.println("Valor do produto sem imposto: "+df.format(valor-imposto2));
                System.out.println("Valor de imposto pago: "+df.format(imposto2));
                System.out.println("Vaor do produto com imposto: "+df.format(1.15*valor));
                
        
    } else if ((produto.toUpperCase().equals("NÃO"))|| (produto.toUpperCase().equals("NAO"))) {
                double imposto3 = (0.50*valor);
                System.out.println("Valor do produto sem imposto: "+df.format(valor-imposto3));
                System.out.println("Valor de imposto pago: "+df.format(imposto3));
                System.out.println("Vaor do produto com imposto: "+df.format((1.50*valor)));
        
        
        
    }
    
    }
    
}
