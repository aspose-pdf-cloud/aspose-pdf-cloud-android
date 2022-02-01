/**
 *
 * Copyright (c) 2022 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.GraphInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This class represents border for graphics elements.
 */
@ApiModel(description = "This class represents border for graphics elements.")

public class BorderInfo {
  @SerializedName("Left")
  private GraphInfo left = null;

  @SerializedName("Right")
  private GraphInfo right = null;

  @SerializedName("Top")
  private GraphInfo top = null;

  @SerializedName("Bottom")
  private GraphInfo bottom = null;

  @SerializedName("RoundedBorderRadius")
  private Double roundedBorderRadius = null;

  public BorderInfo left(GraphInfo left) {
    this.left = left;
    return this;
  }

   /**
   * Gets or sets a object that indicates left of the border.
   * @return left
  **/
  @ApiModelProperty(value = "Gets or sets a object that indicates left of the border.")
  public GraphInfo getLeft() {
    return left;
  }

  public void setLeft(GraphInfo left) {
    this.left = left;
  }

  public BorderInfo right(GraphInfo right) {
    this.right = right;
    return this;
  }

   /**
   * Gets or sets a object that indicates right of the border.
   * @return right
  **/
  @ApiModelProperty(value = "Gets or sets a object that indicates right of the border.")
  public GraphInfo getRight() {
    return right;
  }

  public void setRight(GraphInfo right) {
    this.right = right;
  }

  public BorderInfo top(GraphInfo top) {
    this.top = top;
    return this;
  }

   /**
   * Gets or sets a object that indicates the top border.
   * @return top
  **/
  @ApiModelProperty(value = "Gets or sets a object that indicates the top border.")
  public GraphInfo getTop() {
    return top;
  }

  public void setTop(GraphInfo top) {
    this.top = top;
  }

  public BorderInfo bottom(GraphInfo bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Gets or sets a object that indicates bottom of the border.
   * @return bottom
  **/
  @ApiModelProperty(value = "Gets or sets a object that indicates bottom of the border.")
  public GraphInfo getBottom() {
    return bottom;
  }

  public void setBottom(GraphInfo bottom) {
    this.bottom = bottom;
  }

  public BorderInfo roundedBorderRadius(Double roundedBorderRadius) {
    this.roundedBorderRadius = roundedBorderRadius;
    return this;
  }

   /**
   * Gets or sets a rouded border radius
   * @return roundedBorderRadius
  **/
  @ApiModelProperty(value = "Gets or sets a rouded border radius")
  public Double getRoundedBorderRadius() {
    return roundedBorderRadius;
  }

  public void setRoundedBorderRadius(Double roundedBorderRadius) {
    this.roundedBorderRadius = roundedBorderRadius;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BorderInfo borderInfo = (BorderInfo) o;
    return Objects.equals(this.left, borderInfo.left) &&
        Objects.equals(this.right, borderInfo.right) &&
        Objects.equals(this.top, borderInfo.top) &&
        Objects.equals(this.bottom, borderInfo.bottom) &&
        Objects.equals(this.roundedBorderRadius, borderInfo.roundedBorderRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, top, bottom, roundedBorderRadius);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BorderInfo {\n");
    
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    roundedBorderRadius: ").append(toIndentedString(roundedBorderRadius)).append("\n");
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

