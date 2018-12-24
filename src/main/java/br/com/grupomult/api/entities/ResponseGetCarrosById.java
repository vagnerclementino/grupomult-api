package br.com.grupomult.api.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.grupomult.entities.Carro;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseGetCarrosById
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-24T09:45:25.842-02:00")

public class ResponseGetCarrosById  implements Serializable {
  private static final long serialVersionUID = 1L;

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

