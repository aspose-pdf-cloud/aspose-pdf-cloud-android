/**
 *
 * Copyright (c) 2025 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdfandroid.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents rectangle DTO.
 */
@ApiModel(description = "Represents rectangle DTO.")

public class Rectangle {
  @SerializedName("LLX")
  private Double LLX = null;

  @SerializedName("LLY")
  private Double LLY = null;

  @SerializedName("URX")
  private Double URX = null;

  @SerializedName("URY")
  private Double URY = null;

  public Rectangle LLX(Double LLX) {
    this.LLX = LLX;
    return this;
  }

   /**
   * X-coordinate of lower - left corner.
   * @return LLX
  **/
  @ApiModelProperty(required = true, value = "X-coordinate of lower - left corner.")
  public Double getLLX() {
    return LLX;
  }

  public void setLLX(Double LLX) {
    this.LLX = LLX;
  }

  public Rectangle LLY(Double LLY) {
    this.LLY = LLY;
    return this;
  }

   /**
   * Y - coordinate of lower-left corner.
   * @return LLY
  **/
  @ApiModelProperty(required = true, value = "Y - coordinate of lower-left corner.")
  public Double getLLY() {
    return LLY;
  }

  public void setLLY(Double LLY) {
    this.LLY = LLY;
  }

  public Rectangle URX(Double URX) {
    this.URX = URX;
    return this;
  }

   /**
   * X - coordinate of upper-right corner.
   * @return URX
  **/
  @ApiModelProperty(required = true, value = "X - coordinate of upper-right corner.")
  public Double getURX() {
    return URX;
  }

  public void setURX(Double URX) {
    this.URX = URX;
  }

  public Rectangle URY(Double URY) {
    this.URY = URY;
    return this;
  }

   /**
   * Y - coordinate of upper-right corner.
   * @return URY
  **/
  @ApiModelProperty(required = true, value = "Y - coordinate of upper-right corner.")
  public Double getURY() {
    return URY;
  }

  public void setURY(Double URY) {
    this.URY = URY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Objects.equals(this.LLX, rectangle.LLX) &&
        Objects.equals(this.LLY, rectangle.LLY) &&
        Objects.equals(this.URX, rectangle.URX) &&
        Objects.equals(this.URY, rectangle.URY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LLX, LLY, URX, URY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    
    sb.append("    LLX: ").append(toIndentedString(LLX)).append("\n");
    sb.append("    LLY: ").append(toIndentedString(LLY)).append("\n");
    sb.append("    URX: ").append(toIndentedString(URX)).append("\n");
    sb.append("    URY: ").append(toIndentedString(URY)).append("\n");
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

