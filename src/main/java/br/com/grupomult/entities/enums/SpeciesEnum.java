package br.com.grupomult.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SpeciesEnum {
FELINE("FELINE"),
    
    CANINE("CANINE");

    private String value;

    SpeciesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpeciesEnum fromValue(String text) {
      for (SpeciesEnum b : SpeciesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

}
