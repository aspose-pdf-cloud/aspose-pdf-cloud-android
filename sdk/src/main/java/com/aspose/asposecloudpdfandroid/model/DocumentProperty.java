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
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Pdf document property.
 */
@ApiModel(description = "Pdf document property.")

public class DocumentProperty extends LinkElement {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("BuiltIn")
  private Boolean builtIn = null;

  public DocumentProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the property.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the property.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Property value.
   * @return value
  **/
  @ApiModelProperty(value = "Property value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DocumentProperty builtIn(Boolean builtIn) {
    this.builtIn = builtIn;
    return this;
  }

   /**
   * Value indicating whether it is a built-in property.
   * @return builtIn
  **/
  @ApiModelProperty(required = true, value = "Value indicating whether it is a built-in property.")
  public Boolean isBuiltIn() {
    return builtIn;
  }

  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentProperty documentProperty = (DocumentProperty) o;
    return Objects.equals(this.name, documentProperty.name) &&
        Objects.equals(this.value, documentProperty.value) &&
        Objects.equals(this.builtIn, documentProperty.builtIn) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, builtIn, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
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

