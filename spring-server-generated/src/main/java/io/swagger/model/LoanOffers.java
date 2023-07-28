package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoanOffers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-28T12:14:55.430793391Z[GMT]")


public class LoanOffers   {
  @JsonProperty("offerId")
  private String offerId = null;

  @JsonProperty("loanTensure")
  private Integer loanTensure = null;

  @JsonProperty("instalmentAmount")
  private Double instalmentAmount = null;

  /**
   * Gets or Sets currency
   */
  public enum CurrencyEnum {
    GBP("GBP"),
    
    EUR("EUR"),
    
    USD("USD");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("currency")
  private CurrencyEnum currency = null;

  public LoanOffers offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public LoanOffers loanTensure(Integer loanTensure) {
    this.loanTensure = loanTensure;
    return this;
  }

  /**
   * Get loanTensure
   * @return loanTensure
   **/
  @Schema(description = "")
  
    public Integer getLoanTensure() {
    return loanTensure;
  }

  public void setLoanTensure(Integer loanTensure) {
    this.loanTensure = loanTensure;
  }

  public LoanOffers instalmentAmount(Double instalmentAmount) {
    this.instalmentAmount = instalmentAmount;
    return this;
  }

  /**
   * Get instalmentAmount
   * @return instalmentAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Double getInstalmentAmount() {
    return instalmentAmount;
  }

  public void setInstalmentAmount(Double instalmentAmount) {
    this.instalmentAmount = instalmentAmount;
  }

  public LoanOffers currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(required = true, description = "")
      @NotNull

    public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanOffers loanOffers = (LoanOffers) o;
    return Objects.equals(this.offerId, loanOffers.offerId) &&
        Objects.equals(this.loanTensure, loanOffers.loanTensure) &&
        Objects.equals(this.instalmentAmount, loanOffers.instalmentAmount) &&
        Objects.equals(this.currency, loanOffers.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, loanTensure, instalmentAmount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOffers {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    loanTensure: ").append(toIndentedString(loanTensure)).append("\n");
    sb.append("    instalmentAmount: ").append(toIndentedString(instalmentAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
