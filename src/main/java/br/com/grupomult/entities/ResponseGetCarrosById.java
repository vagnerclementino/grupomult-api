package br.com.grupomult.entities;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseGetCarrosById
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T15:15:07.668Z")

public class ResponseGetCarrosById   {
  @JsonProperty("carro")
  private Carro carro = null;

  public ResponseGetCarrosById carro(Carro carro) {
    this.carro = carro;
    return this;
  }

  /**
   * Get carro
   * @return carro
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGetCarrosById responseGetCarrosById = (ResponseGetCarrosById) o;
    return Objects.equals(this.carro, responseGetCarrosById.carro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetCarrosById {\n");
    
    sb.append("    carro: ").append(toIndentedString(carro)).append("\n");
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

