/**
 *
 * Copyright (c) 2023 Aspose.PDF Cloud
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
 * Class representing line dash pattern.
 */
@ApiModel(description = "Class representing line dash pattern.")

public class Dash {
  @SerializedName("On")
  private Integer on = null;

  @SerializedName("Off")
  private Integer off = null;

  public Dash on(Integer on) {
    this.on = on;
    return this;
  }

   /**
   * Gets or sets length of dash.
   * @return on
  **/
  @ApiModelProperty(required = true, value = "Gets or sets length of dash.")
  public Integer getOn() {
    return on;
  }

  public void setOn(Integer on) {
    this.on = on;
  }

  public Dash off(Integer off) {
    this.off = off;
    return this;
  }

   /**
   * Gets or sets length of gap between dashes.
   * @return off
  **/
  @ApiModelProperty(required = true, value = "Gets or sets length of gap between dashes.")
  public Integer getOff() {
    return off;
  }

  public void setOff(Integer off) {
    this.off = off;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dash dash = (Dash) o;
    return Objects.equals(this.on, dash.on) &&
        Objects.equals(this.off, dash.off);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on, off);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dash {\n");
    
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    off: ").append(toIndentedString(off)).append("\n");
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

