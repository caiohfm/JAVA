public class Ex2
{
   public static void main(String[] args){
       double montanteConversao = 1050.00;
       double cotacaoDolar = 4.5;
       double valorFinal = montanteConversao / cotacaoDolar;
       
       if(valorFinal<1000 && valorFinal>100){
           System.out.println("O valor final é: "+valorFinal * 0.95);
        }
       else if(valorFinal>1000){
           System.out.println("O valor final é: "+valorFinal * 0.9);
        }
        else{
           System.out.println("O valor final é: "+valorFinal);
        }
    }
}