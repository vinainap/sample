package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OnBoardResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-28T14:45:39.794811878Z[GMT]")


public class OnBoardResponse   {
  @JsonProperty("merchantRef")
  private String merchantRef = null;

  @JsonProperty("bankRef")
  private String bankRef = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  public OnBoardResponse merchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
    return this;
  }

  /**
   * Get merchantRef
   * @return merchantRef
   **/
  @Schema(example = "ZYXGHJ74590TYU", required = true, description = "")
      @NotNull

    public String getMerchantRef() {
    return merchantRef;
  }

  public void setMerchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
  }

  public OnBoardResponse bankRef(String bankRef) {
    this.bankRef = bankRef;
    return this;
  }

  /**
   * Get bankRef
   * @return bankRef
   **/
  @Schema(example = "PODFZABC45XERTY", required = true, description = "")
      @NotNull

    public String getBankRef() {
    return bankRef;
  }

  public void setBankRef(String bankRef) {
    this.bankRef = bankRef;
  }

  public OnBoardResponse customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * Customer Loan Reference
   * @return customerRef
   **/
  @Schema(example = "5035127562398", required = true, description = "Customer Loan Reference")
      @NotNull

    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnBoardResponse onBoardResponse = (OnBoardResponse) o;
    return Objects.equals(this.merchantRef, onBoardResponse.merchantRef) &&
        Objects.equals(this.bankRef, onBoardResponse.bankRef) &&
        Objects.equals(this.customerRef, onBoardResponse.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantRef, bankRef, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnBoardResponse {\n");
    
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    bankRef: ").append(toIndentedString(bankRef)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
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
