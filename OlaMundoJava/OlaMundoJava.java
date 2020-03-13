
public class OlaMundoJava
{
    public static void main(String[] args){
        
        float valorSalario = 1300.45f; //valores decimais
        int numeroDependentes = 5;  //valores inteiros
        String nomeCidade = "Bauru"; //valores string
        char letra = 'B'; //valors caracter
        boolean temSaldo = true; //true e falso
        
        double valor1 = 10.20;
        double valor2 = 30.20;
        double soma = valor1 + valor2 ;
        
        if(soma > 100){
             System.out.println("A soma de " + valor1+ " mais " + valor2+ " é maior que cem");
        }
        
        else{
            System.out.println("A soma de " + valor1+ " mais " + valor2+ " é menor que cem");
        }
        
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}