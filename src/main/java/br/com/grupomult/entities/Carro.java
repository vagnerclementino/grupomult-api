package br.com.grupomult.entities;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Carro
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T15:15:07.668Z")

public class Carro   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("codigo")
  private Long codigo = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("dataCriacao")
  private LocalDate dataCriacao = null;

  @JsonProperty("dataAtualizacao")
  private OffsetDateTime dataAtualizacao = null;

  @JsonProperty("tipoCarro")
  private TipoCarro tipoCarro = null;

  public Carro id(Long id) {
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

  public Carro codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Get codigo
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public Carro descricao(String descricao) {
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

  public Carro dataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

  /**
   * Get dataCriacao
   * @return dataCriacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Carro dataAtualizacao(OffsetDateTime dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
    return this;
  }

  /**
   * Get dataAtualizacao
   * @return dataAtualizacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDataAtualizacao(OffsetDateTime dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  public Carro tipoCarro(TipoCarro tipoCarro) {
    this.tipoCarro = tipoCarro;
    return this;
  }

  /**
   * Get tipoCarro
   * @return tipoCarro
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TipoCarro getTipoCarro() {
    return tipoCarro;
  }

  public void setTipoCarro(TipoCarro tipoCarro) {
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
    Carro carro = (Carro) o;
    return Objects.equals(this.id, carro.id) &&
        Objects.equals(this.codigo, carro.codigo) &&
        Objects.equals(this.descricao, carro.descricao) &&
        Objects.equals(this.dataCriacao, carro.dataCriacao) &&
        Objects.equals(this.dataAtualizacao, carro.dataAtualizacao) &&
        Objects.equals(this.tipoCarro, carro.tipoCarro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, descricao, dataCriacao, dataAtualizacao, tipoCarro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carro {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

