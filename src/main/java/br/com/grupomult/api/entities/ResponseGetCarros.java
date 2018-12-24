package br.com.grupomult.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.grupomult.entities.Carro;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseGetCarros
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-24T09:45:25.842-02:00")

public class ResponseGetCarros  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("carros")
  @Valid
  private List<Carro> carros = null;

  public ResponseGetCarros carros(List<Carro> carros) {
    this.carros = carros;
    return this;
  }

  public ResponseGetCarros addCarrosItem(Carro carrosItem) {
    if (this.carros == null) {
      this.carros = new ArrayList<>();
    }
    this.carros.add(carrosItem);
    return this;
  }

  /**
   * Get carros
   * @return carros
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Carro> getCarros() {
    return carros;
  }

  public void setCarros(List<Carro> carros) {
    this.carros = carros;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGetCarros responseGetCarros = (ResponseGetCarros) o;
    return Objects.equals(this.carros, responseGetCarros.carros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetCarros {\n");
    
    sb.append("    carros: ").append(toIndentedString(carros)).append("\n");
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

