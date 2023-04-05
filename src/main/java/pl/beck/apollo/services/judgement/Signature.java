package pl.beck.apollo.services.judgement;

import lombok.Getter;

@Getter
public class Signature {

  private final String number;

    private Signature(String number) {
        this.number = number;
    }

    public static Signature create(String number) {
      isValid(number);
      return new Signature(number);
  }

  private static boolean isValid(String number) {
      if (number == null) throw new SignatureException("numer jest null");
      if (number.isBlank()) throw new SignatureException("numer jest pusty");

      return true;
  }

}
