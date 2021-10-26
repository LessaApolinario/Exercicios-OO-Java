public class Operacao {

  double numero1;
  double numero2;
  int opcao;

  public double soma() {
    return numero1 + numero2;
  }

  public double subtracao() {
    return numero1 - numero2;
  }

  public double multiplicacao() {
    return numero1 * numero2;
  }

  public double divisao() {
    return numero1 / numero2;
  }

  public void menu() {
    switch (opcao) {
      case 1:
        System.out.println("A soma vale " + soma());
        break;
      case 2:
        System.out.println("A subtração vale " + subtracao());
        break;
      case 3:
        System.out.println("A multiplicação vale " + multiplicacao());
        break;
      case 4:
        System.out.println("A divisão vale " + divisao());
        break;
    }
  }
}
