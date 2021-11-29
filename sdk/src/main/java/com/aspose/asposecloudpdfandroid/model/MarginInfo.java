/**
 *
 * Copyright (c) 2021 Aspose.PDF Cloud
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
 * This class represents a margin for different objects.
 */
@ApiModel(description = "This class represents a margin for different objects.")

public class MarginInfo {
  @SerializedName("Left")
  private Double left = null;

  @SerializedName("Right")
  private Double right = null;

  @SerializedName("Top")
  private Double top = null;

  @SerializedName("Bottom")
  private Double bottom = null;

  public MarginInfo left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the left margin.
   * @return left
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the left margin.")
  public Double getLeft() {
    return left;
  }

  public void setLeft(Double left) {
    this.left = left;
  }

  public MarginInfo right(Double right) {
    this.right = right;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the right margin.
   * @return right
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the right margin.")
  public Double getRight() {
    return right;
  }

  public void setRight(Double right) {
    this.right = right;
  }

  public MarginInfo top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the top margin.
   * @return top
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the top margin.")
  public Double getTop() {
    return top;
  }

  public void setTop(Double top) {
    this.top = top;
  }

  public MarginInfo bottom(Double bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the bottom margin.
   * @return bottom
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the bottom margin.")
  public Double getBottom() {
    return bottom;
  }

  public void setBottom(Double bottom) {
    this.bottom = bottom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginInfo marginInfo = (MarginInfo) o;
    return Objects.equals(this.left, marginInfo.left) &&
        Objects.equals(this.right, marginInfo.right) &&
        Objects.equals(this.top, marginInfo.top) &&
        Objects.equals(this.bottom, marginInfo.bottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, top, bottom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginInfo {\n");
    
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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

