/**
 *
 * Copyright (c) 2024 Aspose.PDF Cloud
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
 * LayerInfo
 */

public class LayerInfo {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Locked")
  private Boolean locked = null;

  public LayerInfo pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Layer Page Number.
   * @return pageNumber
  **/
  @ApiModelProperty(required = true, value = "Layer Page Number.")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public LayerInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Layer Id.
   * @return id
  **/
  @ApiModelProperty(value = "Layer Id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LayerInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Layer Name.
   * @return name
  **/
  @ApiModelProperty(value = "Layer Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LayerInfo locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Gets a value indicating whether the layer is locked.
   * @return locked
  **/
  @ApiModelProperty(required = true, value = "Gets a value indicating whether the layer is locked.")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerInfo layerInfo = (LayerInfo) o;
    return Objects.equals(this.pageNumber, layerInfo.pageNumber) &&
        Objects.equals(this.id, layerInfo.id) &&
        Objects.equals(this.name, layerInfo.name) &&
        Objects.equals(this.locked, layerInfo.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, id, name, locked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerInfo {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

