import java.util.ArrayList;

public class IMC {

  private double peso;
  private double altura;
  private String nome;

  public IMC(double peso, double altura, String nome) {
    if (peso > 0) {
      this.peso = peso;
    }

    if (altura > 0) {
      this.altura = altura;
    }

    this.nome = nome;
  }

  public void setPeso(double peso) {
    if (peso > 0) {
      this.peso = peso;
    }
  }

  public double getPeso() {
    return peso;
  }

  public void setAltura(double altura) {
    if (altura > 0) {
      this.altura = altura;
    }
  }

  public double getAltura() {
    return altura;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void menu() {
    System.out.println("1. Cadastrar uma pessoa");
    System.out.println(
      "2. Mostrar as pessoas que estão abaixo do peso (IMC < 18,5)"
    );
    System.out.println(
      "3. Mostrar as pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25)"
    );
    System.out.println(
      "4. Mostrar as pessoas que estão acima do peso (IMC >= 25)"
    );
    System.out.println("0. Sair");
  }

  public double calcIMC() {
    return getPeso() / (getAltura() * getAltura());
  }

  public void abaixoDoPeso(ArrayList<IMC> array) {
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).calcIMC() < 18.5) {
        System.out.println(
          "A pessoa " + array.get(i).getNome() + " está abaixo do peso"
        );
      }
    }
  }

  public void dentroDoPesoIdeal(ArrayList<IMC> array) {
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).calcIMC() > 18.5 && array.get(i).calcIMC() < 25) {
        System.out.println(
          "A pessoa " + array.get(i).getNome() + " está dentro do peso ideal"
        );
      }
    }
  }

  public void acimaDoPeso(ArrayList<IMC> array) {
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).calcIMC() >= 25) {
        System.out.println(
          "A pessoa " + array.get(i).getNome() + " está acima do peso"
        );
      }
    }
  }
}
