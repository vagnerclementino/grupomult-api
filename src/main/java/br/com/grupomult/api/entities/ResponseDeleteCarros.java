package br.com.grupomult.api.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.grupomult.entities.Carro;
import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseDeleteCarros
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-24T09:45:25.842-02:00")

public class ResponseDeleteCarros  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("carro")
  private Carro carro = null;

  public ResponseDeleteCarros uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(value = "")


  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ResponseDeleteCarros carro(Carro carro) {
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
    ResponseDeleteCarros responseDeleteCarros = (ResponseDeleteCarros) o;
    return Objects.equals(this.uri, responseDeleteCarros.uri) &&
        Objects.equals(this.carro, responseDeleteCarros.carro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, carro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDeleteCarros {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

