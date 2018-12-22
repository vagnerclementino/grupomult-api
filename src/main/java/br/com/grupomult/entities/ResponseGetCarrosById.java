package br.com.grupomult.entities;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.grupomult.models.CarroModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseGetCarrosById
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T15:37:49.925-02:00")

public class ResponseGetCarrosById  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("carro")
  private CarroModel carro = null;

  public ResponseGetCarrosById carro(CarroModel carro) {
    this.carro = carro;
    return this;
  }

  /**
   * Get carro
   * @return carro
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CarroModel getCarro() {
    return carro;
  }

  public void setCarro(CarroModel carro) {
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

