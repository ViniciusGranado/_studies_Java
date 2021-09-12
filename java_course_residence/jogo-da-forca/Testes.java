// Alunos
// Marilia Franco de Andrade
// Vinicius Rafael Granado

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
    System.out.println(palavra);

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
    System.out.println(tracinhos);

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

    // Testes classe ControladorDeLetrasJaDigitadas
    System.out.println("\n----------------------------------------");
    System.out.println("   CLASSE ControladorDeLetrasJaDigitadas  ");
    System.out.println("----------------------------------------\n");

    ControladorDeLetrasJaDigitadas controladorLetras = new ControladorDeLetrasJaDigitadas();

    // registre
    try {
      controladorLetras.registre('a');
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      controladorLetras.registre('a');
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    // isJaDigitada
    try {
      controladorLetras.isJaDigitada('a');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
    
    try {
      controladorLetras.isJaDigitada('e');
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    // toString
    System.out.println(controladorLetras);

    // equals
    ControladorDeLetrasJaDigitadas testeControlador01 = new ControladorDeLetrasJaDigitadas();
    ControladorDeLetrasJaDigitadas testeControlador02 = new ControladorDeLetrasJaDigitadas();

    try {
      testeControlador01.registre('a');
    } catch(Exception e) {};

    try {
      testeControlador02.registre('e');
    } catch(Exception e) {};

    System.out.println(controladorLetras.equals(testeControlador01));
    System.out.println(controladorLetras.equals(testeControlador02));

    // hashCode
    System.out.println(controladorLetras.hashCode());

    // clone
    ControladorDeLetrasJaDigitadas clone = null;

    try {
      clone = (ControladorDeLetrasJaDigitadas) controladorLetras.clone();
    } catch (Exception e) {}

    System.out.println(controladorLetras == clone);
    System.out.println(controladorLetras.equals(clone));

    // Testes classe ControladorDeErros
    System.out.println("\n------------------------------");
    System.out.println("   CLASSE ControladorDeErros  ");
    System.out.println("------------------------------\n");

    ControladorDeErros controladorErros = null;

    try {
      controladorErros = new ControladorDeErros(-1);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      controladorErros = new ControladorDeErros(2);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    // isAtingidoMaximoDeErros / registreUmErro
    System.out.println(controladorErros.isAtingidoMaximoDeErros());

    try {
      controladorErros.registreUmErro();
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(controladorErros.isAtingidoMaximoDeErros());

    try {
      controladorErros.registreUmErro();
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(controladorErros.isAtingidoMaximoDeErros());

    try {
      controladorErros.registreUmErro();
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    // toString
    System.out.println(controladorErros);

    // equals
    ControladorDeErros testeControladorErros01 = null;
    ControladorDeErros testeControladorErros02 = null;

    try {
      testeControladorErros01 = new ControladorDeErros(2);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      testeControladorErros02 = new ControladorDeErros(2);
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      testeControladorErros01.registreUmErro();
      testeControladorErros01.registreUmErro();
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(controladorErros.equals(testeControladorErros01));
    System.out.println(controladorErros.equals(testeControladorErros02));

    // hashCode
    System.out.println(controladorErros.hashCode());

    // clone
    ControladorDeErros cloneControladorErros = null;
    try {
      cloneControladorErros = (ControladorDeErros) controladorErros.clone();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println(controladorErros == cloneControladorErros);
    System.out.println(controladorErros.equals(cloneControladorErros));
  }
}