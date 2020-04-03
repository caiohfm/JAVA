public class Pessoa {
    
    String nome;
    String endereco;
    String cpf;
    String rg;
    double altura;
    double peso;
    int idade;

    public int diasQueViveu() {
        int totalDias = this.idade * 365;
        return totalDias;
    }

    public String ondeMora() {
        return endereco;
    }

    public double valorImc() {
        return peso / (altura * altura);
    }

    public String riscoDoenca() {
        if (peso / (altura * altura) < 18.5) {
            return "Baixo";
        } else if (24.9 > peso / (altura * altura) && peso / (altura * altura) > 18.5) {
            return "Normal";
        } else if (29.9 > peso / (altura * altura) && peso / (altura * altura) > 25.0) {
            return "Elevado";
        } else if (34.9 > peso / (altura * altura) && peso / (altura * altura) > 30.0) {
            return "Alto";
        } else if (39.9 > peso / (altura * altura) && peso / (altura * altura) > 35.0) {
            return "Muito Alto";
        } else {
            return "Obesidade mórbida";
        }
    }
}

