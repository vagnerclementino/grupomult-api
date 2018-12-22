package br.com.grupomult.entities;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseGetAnimalsById
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T15:15:07.668Z")

public class ResponseGetAnimalsById   {
  @JsonProperty("animal")
  private Animal animal = null;

  public ResponseGetAnimalsById animal(Animal animal) {
    this.animal = animal;
    return this;
  }

  /**
   * Get animal
   * @return animal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Animal getAnimal() {
    return animal;
  }

  public void setAnimal(Animal animal) {
    this.animal = animal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGetAnimalsById responseGetAnimalsById = (ResponseGetAnimalsById) o;
    return Objects.equals(this.animal, responseGetAnimalsById.animal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(animal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetAnimalsById {\n");
    
    sb.append("    animal: ").append(toIndentedString(animal)).append("\n");
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

