package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.LoanOffers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoanOffersResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-28T13:35:21.080469257Z[GMT]")


public class LoanOffersResponse   {
  @JsonProperty("merchantRef")
  private String merchantRef = null;

  @JsonProperty("bankRef")
  private String bankRef = null;

  /**
   * Gets or Sets customerEligibility
   */
  public enum CustomerEligibilityEnum {
    ELIGIBLE("eligible"),
    
    NOTELIGIBLE("notEligible");

    private String value;

    CustomerEligibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerEligibilityEnum fromValue(String text) {
      for (CustomerEligibilityEnum b : CustomerEligibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("customerEligibility")
  private CustomerEligibilityEnum customerEligibility = null;

  @JsonProperty("loanOffers")
  @Valid
  private List<LoanOffers> loanOffers = null;

  public LoanOffersResponse merchantRef(String merchantRef) {
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

  public LoanOffersResponse bankRef(String bankRef) {
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

  public LoanOffersResponse customerEligibility(CustomerEligibilityEnum customerEligibility) {
    this.customerEligibility = customerEligibility;
    return this;
  }

  /**
   * Get customerEligibility
   * @return customerEligibility
   **/
  @Schema(required = true, description = "")
      @NotNull

    public CustomerEligibilityEnum getCustomerEligibility() {
    return customerEligibility;
  }

  public void setCustomerEligibility(CustomerEligibilityEnum customerEligibility) {
    this.customerEligibility = customerEligibility;
  }

  public LoanOffersResponse loanOffers(List<LoanOffers> loanOffers) {
    this.loanOffers = loanOffers;
    return this;
  }

  public LoanOffersResponse addLoanOffersItem(LoanOffers loanOffersItem) {
    if (this.loanOffers == null) {
      this.loanOffers = new ArrayList<LoanOffers>();
    }
    this.loanOffers.add(loanOffersItem);
    return this;
  }

  /**
   * Get loanOffers
   * @return loanOffers
   **/
  @Schema(description = "")
      @Valid
    public List<LoanOffers> getLoanOffers() {
    return loanOffers;
  }

  public void setLoanOffers(List<LoanOffers> loanOffers) {
    this.loanOffers = loanOffers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanOffersResponse loanOffersResponse = (LoanOffersResponse) o;
    return Objects.equals(this.merchantRef, loanOffersResponse.merchantRef) &&
        Objects.equals(this.bankRef, loanOffersResponse.bankRef) &&
        Objects.equals(this.customerEligibility, loanOffersResponse.customerEligibility) &&
        Objects.equals(this.loanOffers, loanOffersResponse.loanOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantRef, bankRef, customerEligibility, loanOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOffersResponse {\n");
    
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    bankRef: ").append(toIndentedString(bankRef)).append("\n");
    sb.append("    customerEligibility: ").append(toIndentedString(customerEligibility)).append("\n");
    sb.append("    loanOffers: ").append(toIndentedString(loanOffers)).append("\n");
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
