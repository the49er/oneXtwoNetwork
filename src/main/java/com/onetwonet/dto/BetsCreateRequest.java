package com.onetwonet.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.onetwonet.dto.BetResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * to create an Entity with provided ID
 */
@ApiModel(description = "to create an Entity with provided ID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class BetsCreateRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bets")
  @Valid
  private List<BetResponse> bets = null;

  public BetsCreateRequest bets(List<BetResponse> bets) {
    this.bets = bets;
    return this;
  }

  public BetsCreateRequest addBetsItem(BetResponse betsItem) {
    if (this.bets == null) {
      this.bets = new ArrayList<>();
    }
    this.bets.add(betsItem);
    return this;
  }

  /**
   * Get bets
   * @return bets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<BetResponse> getBets() {
    return bets;
  }

  public void setBets(List<BetResponse> bets) {
    this.bets = bets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetsCreateRequest betsCreateRequest = (BetsCreateRequest) o;
    return Objects.equals(this.bets, betsCreateRequest.bets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetsCreateRequest {\n");
    
    sb.append("    bets: ").append(toIndentedString(bets)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

