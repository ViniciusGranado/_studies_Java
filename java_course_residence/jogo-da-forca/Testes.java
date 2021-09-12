public class Testes {
  public static void main(String[] args) {
    // Testes classe Palavra
    System.out.println("-------------------");
    System.out.println("  CLASSE PALAVRA   ");
    System.out.println("-------------------\n");

    Palavra palavra = null;
    //Palavra null
    try {
      palavra = new Palavra(null);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    // Palavra string vazia
    try {
      palavra = new Palavra("");
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    // Palavra valida
    try {
      palavra = new Palavra("teste");
    } catch (Exception e) {}

    // Quantidade caracteres
    System.out.println(palavra.getQuantidade('t'));
    System.out.println(palavra.getQuantidade('e'));
    System.out.println(palavra.getQuantidade('s'));

    // Posição Iezima Ocorrencia
    try {
      System.out.println(palavra.getPosicaoDaIezimaOcorrencia(0, 't'));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(palavra.getPosicaoDaIezimaOcorrencia(1, 't'));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(palavra.getPosicaoDaIezimaOcorrencia(2, 't'));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Tamanho
    System.out.println(palavra.getTamanho());

    // toString
    System.out.println(palavra.toString());

    // equals
    Palavra testePalavra01 = null;
    Palavra testePalavra02 = null;
    Palavra testePalavra03 = null;

    try {
      testePalavra01 = new Palavra("teste");
    } catch (Exception e) {}

    try {
      testePalavra02 = new Palavra("erro");
    } catch (Exception e) {}

    try {
      testePalavra03 = new Palavra("testeDePalavra");
    } catch (Exception e) {}

    System.out.println(palavra.equals(testePalavra01));
    System.out.println(palavra.equals(testePalavra02));
    System.out.println(palavra.equals(testePalavra03));

    // hashCode
    System.out.println(palavra.hashCode());

    // compareTo
    System.out.println(palavra.compareTo(testePalavra01));
    System.out.println(palavra.compareTo(testePalavra02));
    System.out.println(palavra.compareTo(testePalavra03));

    // Testes classe Tracinhos
    System.out.println("\n-------------------");
    System.out.println("  CLASSE TRACINHOS ");
    System.out.println("-------------------\n");
    Tracinhos tracinhos = null;

    // Tracinhos invalidos
    try {
      tracinhos = new Tracinhos(-1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // Tracinhos validos
    try {
      tracinhos = new Tracinhos(5);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // releve
    try {
      tracinhos.revele(-1, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      tracinhos.revele(5, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      tracinhos.revele(2, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    // isAindaComTracinhos
    System.out.println(tracinhos.isAindaComTracinhos());

    // Preencher com letras
    try {
      tracinhos.revele(0, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      tracinhos.revele(1, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      tracinhos.revele(3, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      tracinhos.revele(4, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(tracinhos.isAindaComTracinhos());

    // toString
    System.out.println(tracinhos.toString());

    // equals
    Tracinhos testeTracinhos01 = null;
    try {
      testeTracinhos01 = new Tracinhos(5);
    } catch (Exception e) {}

    System.out.println(tracinhos.equals(testeTracinhos01));

    // Preencher com letras
    try {
      testeTracinhos01.revele(0, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      testeTracinhos01.revele(1, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      testeTracinhos01.revele(2, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      testeTracinhos01.revele(3, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      testeTracinhos01.revele(4, 'a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    
    System.out.println(tracinhos.equals(testeTracinhos01));

    // hashCode
    System.out.println(tracinhos.hashCode());

    // clone
    Tracinhos copia = (Tracinhos) tracinhos.clone();
    System.out.println(copia);
    System.out.println(copia == tracinhos);
    System.out.println(copia.equals(tracinhos));
  }
}