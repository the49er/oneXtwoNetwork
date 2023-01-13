package com.onetwonet.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bet response DTO
 */
@ApiModel(description = "Bet response DTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class BetResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("numbets")
  private Integer numbets;

  @JsonProperty("game")
  private String game;

  @JsonProperty("stake")
  private Double stake;

  @JsonProperty("returns")
  private Double returns;

  @JsonProperty("clientid")
  private Long clientid;

  @JsonProperty("date")
  private String date;

  public BetResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BetResponse numbets(Integer numbets) {
    this.numbets = numbets;
    return this;
  }

  /**
   * Get numbets
   * @return numbets
  */
  @ApiModelProperty(value = "")


  public Integer getNumbets() {
    return numbets;
  }

  public void setNumbets(Integer numbets) {
    this.numbets = numbets;
  }

  public BetResponse game(String game) {
    this.game = game;
    return this;
  }

  /**
   * Get game
   * @return game
  */
  @ApiModelProperty(value = "")


  public String getGame() {
    return game;
  }

  public void setGame(String game) {
    this.game = game;
  }

  public BetResponse stake(Double stake) {
    this.stake = stake;
    return this;
  }

  /**
   * Get stake
   * @return stake
  */
  @ApiModelProperty(value = "")


  public Double getStake() {
    return stake;
  }

  public void setStake(Double stake) {
    this.stake = stake;
  }

  public BetResponse returns(Double returns) {
    this.returns = returns;
    return this;
  }

  /**
   * Get returns
   * @return returns
  */
  @ApiModelProperty(value = "")


  public Double getReturns() {
    return returns;
  }

  public void setReturns(Double returns) {
    this.returns = returns;
  }

  public BetResponse clientid(Long clientid) {
    this.clientid = clientid;
    return this;
  }

  /**
   * Get clientid
   * @return clientid
  */
  @ApiModelProperty(value = "")


  public Long getClientid() {
    return clientid;
  }

  public void setClientid(Long clientid) {
    this.clientid = clientid;
  }

  public BetResponse date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetResponse betResponse = (BetResponse) o;
    return Objects.equals(this.id, betResponse.id) &&
        Objects.equals(this.numbets, betResponse.numbets) &&
        Objects.equals(this.game, betResponse.game) &&
        Objects.equals(this.stake, betResponse.stake) &&
        Objects.equals(this.returns, betResponse.returns) &&
        Objects.equals(this.clientid, betResponse.clientid) &&
        Objects.equals(this.date, betResponse.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numbets, game, stake, returns, clientid, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numbets: ").append(toIndentedString(numbets)).append("\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
    sb.append("    stake: ").append(toIndentedString(stake)).append("\n");
    sb.append("    returns: ").append(toIndentedString(returns)).append("\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

