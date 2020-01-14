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
import com.aspose.asposecloudpdfandroid.model.DefaultPageConfig;
import com.aspose.asposecloudpdfandroid.model.DisplayProperties;
import com.aspose.asposecloudpdfandroid.model.DocumentProperties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides link to DocumentConfig.
 */
@ApiModel(description = "Provides link to DocumentConfig.")

public class DocumentConfig {
  @SerializedName("DisplayProperties")
  private DisplayProperties displayProperties = null;

  @SerializedName("DocumentProperties")
  private DocumentProperties documentProperties = null;

  @SerializedName("PagesCount")
  private Integer pagesCount = null;

  @SerializedName("DefaultPageConfig")
  private DefaultPageConfig defaultPageConfig = null;

  public DocumentConfig displayProperties(DisplayProperties displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

   /**
   * Sets DisplayProperties of document
   * @return displayProperties
  **/
  @ApiModelProperty(value = "Sets DisplayProperties of document")
  public DisplayProperties getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(DisplayProperties displayProperties) {
    this.displayProperties = displayProperties;
  }

  public DocumentConfig documentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
    return this;
  }

   /**
   * Sets DocumentProperties of document
   * @return documentProperties
  **/
  @ApiModelProperty(value = "Sets DocumentProperties of document")
  public DocumentProperties getDocumentProperties() {
    return documentProperties;
  }

  public void setDocumentProperties(DocumentProperties documentProperties) {
    this.documentProperties = documentProperties;
  }

  public DocumentConfig pagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
    return this;
  }

   /**
   * Sets count of pages for new document. From 1 to 100
   * @return pagesCount
  **/
  @ApiModelProperty(required = true, value = "Sets count of pages for new document. From 1 to 100")
  public Integer getPagesCount() {
    return pagesCount;
  }

  public void setPagesCount(Integer pagesCount) {
    this.pagesCount = pagesCount;
  }

  public DocumentConfig defaultPageConfig(DefaultPageConfig defaultPageConfig) {
    this.defaultPageConfig = defaultPageConfig;
    return this;
  }

   /**
   * Sets default page config for new document
   * @return defaultPageConfig
  **/
  @ApiModelProperty(value = "Sets default page config for new document")
  public DefaultPageConfig getDefaultPageConfig() {
    return defaultPageConfig;
  }

  public void setDefaultPageConfig(DefaultPageConfig defaultPageConfig) {
    this.defaultPageConfig = defaultPageConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentConfig documentConfig = (DocumentConfig) o;
    return Objects.equals(this.displayProperties, documentConfig.displayProperties) &&
        Objects.equals(this.documentProperties, documentConfig.documentProperties) &&
        Objects.equals(this.pagesCount, documentConfig.pagesCount) &&
        Objects.equals(this.defaultPageConfig, documentConfig.defaultPageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayProperties, documentProperties, pagesCount, defaultPageConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentConfig {\n");
    
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    documentProperties: ").append(toIndentedString(documentProperties)).append("\n");
    sb.append("    pagesCount: ").append(toIndentedString(pagesCount)).append("\n");
    sb.append("    defaultPageConfig: ").append(toIndentedString(defaultPageConfig)).append("\n");
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

