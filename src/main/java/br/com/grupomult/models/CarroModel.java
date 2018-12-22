package br.com.grupomult.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CarroModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T15:37:49.925-02:00")

public class CarroModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("dataCriacao")
  private String dataCriacao = null;

  @JsonProperty("dataAtualizacao")
  private String dataAtualizacao = null;

  @JsonProperty("tipoCarro")
  private String tipoCarro = null;

  public CarroModel codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public CarroModel descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Get descricao
   * @return descricao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public CarroModel dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

  /**
   * Get dataCriacao
   * @return dataCriacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public CarroModel dataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
    return this;
  }

  /**
   * Get dataAtualizacao
   * @return dataAtualizacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  public CarroModel tipoCarro(String tipoCarro) {
    this.tipoCarro = tipoCarro;
    return this;
  }

  /**
   * Get tipoCarro
   * @return tipoCarro
  **/
  @ApiModelProperty(value = "")


  public String getTipoCarro() {
    return tipoCarro;
  }

  public void setTipoCarro(String tipoCarro) {
    this.tipoCarro = tipoCarro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarroModel carroModel = (CarroModel) o;
    return Objects.equals(this.codigo, carroModel.codigo) &&
        Objects.equals(this.descricao, carroModel.descricao) &&
        Objects.equals(this.dataCriacao, carroModel.dataCriacao) &&
        Objects.equals(this.dataAtualizacao, carroModel.dataAtualizacao) &&
        Objects.equals(this.tipoCarro, carroModel.tipoCarro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descricao, dataCriacao, dataAtualizacao, tipoCarro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarroModel {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    dataAtualizacao: ").append(toIndentedString(dataAtualizacao)).append("\n");
    sb.append("    tipoCarro: ").append(toIndentedString(tipoCarro)).append("\n");
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

