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
import com.aspose.asposecloudpdfandroid.model.DisplayProperties;
import com.aspose.asposecloudpdfandroid.model.DocumentProperties;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
import com.aspose.asposecloudpdfandroid.model.Pages;
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
 * Represents document DTO.
 */
@ApiModel(description = "Represents document DTO.")

public class Document extends LinkElement {
  @SerializedName("DocumentProperties")
  private DocumentProperties documentProperties = null;

  @SerializedName("DisplayProperties")
  private DisplayProperties displayProperties = null;

  @SerializedName("Pages")
  private Pages pages = null;

  public Document documentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

   /**
   * Document properties.
   * @return documentProperties
  **/
  @ApiModelProperty(value = "Document properties.")
  public DocumentProperties getDocumentProperties() {
    return documentProperties;
  }

  public void setDocumentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
  }

  public Document displayProperties(DisplayProperties displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Document display properties.
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Document display properties.")
  public DisplayProperties getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DisplayProperties displayProperties) {
    this.displayProperties = displayProperties;
  }

  public Document pages(Pages pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Document pages.
   * @return pages
  **/
  @ApiModelProperty(value = "Document pages.")
  public Pages getPages() {
    return pages;
  }

  public void setPages(Pages pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentProperties, document.documentProperties) &&
        Objects.equals(this.displayProperties, document.displayProperties) &&
        Objects.equals(this.pages, document.pages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentProperties, displayProperties, pages, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

