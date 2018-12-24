package br.com.grupomult.models;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CarroModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-23T17:46:04.391-02:00")

public class CarroModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("codigo")
  private Long codigo = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("dataCriacao")
  private String dataCriacao = null;

  @JsonProperty("dataAtualizacao")
  private String dataAtualizacao = null;

  @JsonProperty("tipo")
  private Long tipo = null;

  public CarroModel id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CarroModel codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(value = "")


  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
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
  @ApiModelProperty(value = "")


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
  @ApiModelProperty(value = "")


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
  @ApiModelProperty(value = "")


  public String getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  public CarroModel tipo(Long tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")


  public Long getTipo() {
    return tipo;
  }

  public void setTipo(Long tipo) {
    this.tipo = tipo;
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
    return Objects.equals(this.id, carroModel.id) &&
        Objects.equals(this.codigo, carroModel.codigo) &&
        Objects.equals(this.descricao, carroModel.descricao) &&
        Objects.equals(this.dataCriacao, carroModel.dataCriacao) &&
        Objects.equals(this.dataAtualizacao, carroModel.dataAtualizacao) &&
        Objects.equals(this.tipo, carroModel.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, descricao, dataCriacao, dataAtualizacao, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarroModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    dataAtualizacao: ").append(toIndentedString(dataAtualizacao)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

