package br.com.grupomult.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Carro
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-23T17:46:04.391-02:00")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="CARRO")

public class Carro  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id = null;

  @JsonProperty("codigo")
  private Long codigo = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("dataCriacao")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dataCriacao = null;

  @JsonProperty("dataAtualizacao")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dataAtualizacao = null;

  @JsonProperty("tipo")
  @ManyToOne
  @JoinColumn(name="TIPO_CARRO_ID", nullable=false)
  private TipoCarro tipo = null;

  public Carro id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
//  @ApiModelProperty(required = true, value = "")
//  @NotNull


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

  public Carro dataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

  /**
   * Get dataCriacao
   * @return dataCriacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Carro dataAtualizacao(Date dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
    return this;
  }

  /**
   * Get dataAtualizacao
   * @return dataAtualizacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Date getDataAtualizacao() {
    return dataAtualizacao;
  }

  public void setDataAtualizacao(Date dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  public Carro tipo(TipoCarro tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TipoCarro getTipo() {
    return tipo;
  }

  public void setTipo(TipoCarro tipo) {
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
    Carro carro = (Carro) o;
    return Objects.equals(this.id, carro.id) &&
        Objects.equals(this.codigo, carro.codigo) &&
        Objects.equals(this.descricao, carro.descricao) &&
        Objects.equals(this.dataCriacao, carro.dataCriacao) &&
        Objects.equals(this.dataAtualizacao, carro.dataAtualizacao) &&
        Objects.equals(this.tipo, carro.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, descricao, dataCriacao, dataAtualizacao, tipo);
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

