package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OnBoardRequestAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-28T14:45:39.794811878Z[GMT]")


public class OnBoardRequestAddress   {
  @JsonProperty("houseNum")
  private String houseNum = null;

  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("town")
  private String town = null;

  @JsonProperty("postCode")
  private String postCode = null;

  public OnBoardRequestAddress houseNum(String houseNum) {
    this.houseNum = houseNum;
    return this;
  }

  /**
   * Get houseNum
   * @return houseNum
   **/
  @Schema(example = "flat-99", required = true, description = "")
      @NotNull

    public String getHouseNum() {
    return houseNum;
  }

  public void setHouseNum(String houseNum) {
    this.houseNum = houseNum;
  }

  public OnBoardRequestAddress propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   * @return propertyName
   **/
  @Schema(example = "abcdef", description = "")
  
    public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public OnBoardRequestAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
   **/
  @Schema(example = "high street", required = true, description = "")
      @NotNull

    public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OnBoardRequestAddress town(String town) {
    this.town = town;
    return this;
  }

  /**
   * Get town
   * @return town
   **/
  @Schema(example = "sutton", required = true, description = "")
      @NotNull

    public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public OnBoardRequestAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
   **/
  @Schema(example = "SM11LZ", required = true, description = "")
      @NotNull

    public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnBoardRequestAddress onBoardRequestAddress = (OnBoardRequestAddress) o;
    return Objects.equals(this.houseNum, onBoardRequestAddress.houseNum) &&
        Objects.equals(this.propertyName, onBoardRequestAddress.propertyName) &&
        Objects.equals(this.street, onBoardRequestAddress.street) &&
        Objects.equals(this.town, onBoardRequestAddress.town) &&
        Objects.equals(this.postCode, onBoardRequestAddress.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseNum, propertyName, street, town, postCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnBoardRequestAddress {\n");
    
    sb.append("    houseNum: ").append(toIndentedString(houseNum)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
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
