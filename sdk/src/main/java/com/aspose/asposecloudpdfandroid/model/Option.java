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
 * Provides form option.
 */
@ApiModel(description = "Provides form option.")

public class Option {
  @SerializedName("Value")
  private String value = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Selected")
  private Boolean selected = null;

  @SerializedName("Index")
  private Integer index = null;

  public Option value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Gets or sets option export value.
   * @return value
  **/
  @ApiModelProperty(value = "Gets or sets option export value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Option name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets name of option.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets name of option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Option selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Gets or sets selected status of option. Returns true if option is selected.
   * @return selected
  **/
  @ApiModelProperty(value = "Gets or sets selected status of option. Returns true if option is selected.")
  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public Option index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Gets index of the option. 
   * @return index
  **/
  @ApiModelProperty(value = "Gets index of the option. ")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.value, option.value) &&
        Objects.equals(this.name, option.name) &&
        Objects.equals(this.selected, option.selected) &&
        Objects.equals(this.index, option.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, name, selected, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

