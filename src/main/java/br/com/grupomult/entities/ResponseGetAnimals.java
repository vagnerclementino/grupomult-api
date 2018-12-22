package br.com.grupomult.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseGetAnimals
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T15:15:07.668Z")

public class ResponseGetAnimals   {
  @JsonProperty("animais")
  @Valid
  private List<Animal> animais = null;

  public ResponseGetAnimals animais(List<Animal> animais) {
    this.animais = animais;
    return this;
  }

  public ResponseGetAnimals addAnimaisItem(Animal animaisItem) {
    if (this.animais == null) {
      this.animais = new ArrayList<Animal>();
    }
    this.animais.add(animaisItem);
    return this;
  }

  /**
   * Get animais
   * @return animais
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Animal> getAnimais() {
    return animais;
  }

  public void setAnimais(List<Animal> animais) {
    this.animais = animais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGetAnimals responseGetAnimals = (ResponseGetAnimals) o;
    return Objects.equals(this.animais, responseGetAnimals.animais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetAnimals {\n");
    
    sb.append("    animais: ").append(toIndentedString(animais)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

