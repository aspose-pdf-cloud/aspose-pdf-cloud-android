/**
 *
 *   Copyright (c) 2020 Aspose.PDF Cloud
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
 * Represents a position object
 */
@ApiModel(description = "Represents a position object")

public class Position {
  @SerializedName("XIndent")
  private Double xindent = null;

  @SerializedName("YIndent")
  private Double yindent = null;

  public Position xindent(Double xindent) {
    this.xindent = xindent;
    return this;
  }

   /**
   * Gets the X coordinate of the object
   * @return xindent
  **/
  @ApiModelProperty(required = true, value = "Gets the X coordinate of the object")
  public Double getXindent() {
    return xindent;
  }

  public void setXindent(Double xindent) {
    this.xindent = xindent;
  }

  public Position yindent(Double yindent) {
    this.yindent = yindent;
    return this;
  }

   /**
   * Gets the Y coordinate of the object
   * @return yindent
  **/
  @ApiModelProperty(required = true, value = "Gets the Y coordinate of the object")
  public Double getYindent() {
    return yindent;
  }

  public void setYindent(Double yindent) {
    this.yindent = yindent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(this.xindent, position.xindent) &&
        Objects.equals(this.yindent, position.yindent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xindent, yindent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    xindent: ").append(toIndentedString(xindent)).append("\n");
    sb.append("    yindent: ").append(toIndentedString(yindent)).append("\n");
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

