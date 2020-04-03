  
public class Main {
    public static void main(String[] args) {
        Pessoa caio = new Pessoa();
        caio.nome = "Caio";
        caio.cpf = "12345679";
        caio.rg = "3782783";
        caio.endereco = "Santa City";
        caio.peso = 69.3;
        caio.altura = 1.82;
        caio.idade = 19;


        System.out.println("Risco de doenca: " + caio.riscoDoenca());
    }
}
