package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.LoanOffersRequestAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoanOffersRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-28T13:39:42.785073839Z[GMT]")


public class LoanOffersRequest   {
  @JsonProperty("merchantId")
  private String merchantId = null;

  @JsonProperty("merchantRef")
  private String merchantRef = null;

  @JsonProperty("transactionAmount")
  private Double transactionAmount = null;

  /**
   * Gets or Sets transactioncurrency
   */
  public enum TransactioncurrencyEnum {
    GBP("GBP"),
    
    EUR("EUR"),
    
    USD("USD");

    private String value;

    TransactioncurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactioncurrencyEnum fromValue(String text) {
      for (TransactioncurrencyEnum b : TransactioncurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("transactioncurrency")
  private TransactioncurrencyEnum transactioncurrency = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("address")
  private LoanOffersRequestAddress address = null;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @JsonProperty("emailId")
  private String emailId = null;

  @JsonProperty("mobileNumber")
  private Integer mobileNumber = null;

  /**
   * Gets or Sets idType
   */
  public enum IdTypeEnum {
    PASSPORT("passport"),
    
    DRIVINGLICENCE("drivinglicence"),
    
    BIOMETRICRESIDENCEPERMIT("biometricresidencepermit");

    private String value;

    IdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdTypeEnum fromValue(String text) {
      for (IdTypeEnum b : IdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("idType")
  private IdTypeEnum idType = null;

  @JsonProperty("idNum")
  private String idNum = null;

  public LoanOffersRequest merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Get merchantId
   * @return merchantId
   **/
  @Schema(example = "AXTYR456789", required = true, description = "")
      @NotNull

    public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public LoanOffersRequest merchantRef(String merchantRef) {
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

  public LoanOffersRequest transactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public LoanOffersRequest transactioncurrency(TransactioncurrencyEnum transactioncurrency) {
    this.transactioncurrency = transactioncurrency;
    return this;
  }

  /**
   * Get transactioncurrency
   * @return transactioncurrency
   **/
  @Schema(description = "")
  
    public TransactioncurrencyEnum getTransactioncurrency() {
    return transactioncurrency;
  }

  public void setTransactioncurrency(TransactioncurrencyEnum transactioncurrency) {
    this.transactioncurrency = transactioncurrency;
  }

  public LoanOffersRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(example = "Sathish", required = true, description = "")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public LoanOffersRequest middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
   **/
  @Schema(example = "A", description = "")
  
    public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public LoanOffersRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(example = "Prabhakaran", required = true, description = "")
      @NotNull

    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LoanOffersRequest address(LoanOffersRequestAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LoanOffersRequestAddress getAddress() {
    return address;
  }

  public void setAddress(LoanOffersRequestAddress address) {
    this.address = address;
  }

  public LoanOffersRequest dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public LoanOffersRequest emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Get emailId
   * @return emailId
   **/
  @Schema(description = "")
  
    public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public LoanOffersRequest mobileNumber(Integer mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
   **/
  @Schema(example = "7777777777", required = true, description = "")
      @NotNull

    public Integer getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(Integer mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public LoanOffersRequest idType(IdTypeEnum idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   * @return idType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public IdTypeEnum getIdType() {
    return idType;
  }

  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }

  public LoanOffersRequest idNum(String idNum) {
    this.idNum = idNum;
    return this;
  }

  /**
   * Get idNum
   * @return idNum
   **/
  @Schema(example = "A1234567", required = true, description = "")
      @NotNull

    public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanOffersRequest loanOffersRequest = (LoanOffersRequest) o;
    return Objects.equals(this.merchantId, loanOffersRequest.merchantId) &&
        Objects.equals(this.merchantRef, loanOffersRequest.merchantRef) &&
        Objects.equals(this.transactionAmount, loanOffersRequest.transactionAmount) &&
        Objects.equals(this.transactioncurrency, loanOffersRequest.transactioncurrency) &&
        Objects.equals(this.firstName, loanOffersRequest.firstName) &&
        Objects.equals(this.middleName, loanOffersRequest.middleName) &&
        Objects.equals(this.lastName, loanOffersRequest.lastName) &&
        Objects.equals(this.address, loanOffersRequest.address) &&
        Objects.equals(this.dateOfBirth, loanOffersRequest.dateOfBirth) &&
        Objects.equals(this.emailId, loanOffersRequest.emailId) &&
        Objects.equals(this.mobileNumber, loanOffersRequest.mobileNumber) &&
        Objects.equals(this.idType, loanOffersRequest.idType) &&
        Objects.equals(this.idNum, loanOffersRequest.idNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, merchantRef, transactionAmount, transactioncurrency, firstName, middleName, lastName, address, dateOfBirth, emailId, mobileNumber, idType, idNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOffersRequest {\n");
    
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactioncurrency: ").append(toIndentedString(transactioncurrency)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idNum: ").append(toIndentedString(idNum)).append("\n");
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
