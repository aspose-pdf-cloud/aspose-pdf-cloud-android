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
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.StampType;
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
 * Provides stamp info.
 */
@ApiModel(description = "Provides stamp info.")

public class StampInfo extends LinkElement {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("IndexOnPage")
  private Integer indexOnPage = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("Rect")
  private Rectangle rect = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Visible")
  private Boolean visible = null;

  @SerializedName("StampType")
  private StampType stampType = null;

  public StampInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Gets ID of the stamp.
   * @return id
  **/
  @ApiModelProperty(value = "Gets ID of the stamp.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StampInfo indexOnPage(Integer indexOnPage) {
    this.indexOnPage = indexOnPage;
    return this;
  }

   /**
   * Gets index on page of the stamp.
   * @return indexOnPage
  **/
  @ApiModelProperty(value = "Gets index on page of the stamp.")
  public Integer getIndexOnPage() {
    return indexOnPage;
  }

  public void setIndexOnPage(Integer indexOnPage) {
    this.indexOnPage = indexOnPage;
  }

  public StampInfo pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Gets PageIndex of the annotation.
   * @return pageIndex
  **/
  @ApiModelProperty(value = "Gets PageIndex of the annotation.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public StampInfo rect(Rectangle rect) {
    this.rect = rect;
    return this;
  }

   /**
   * Gets Rect of the annotation.
   * @return rect
  **/
  @ApiModelProperty(value = "Gets Rect of the annotation.")
  public Rectangle getRect() {
    return rect;
  }

  public void setRect(Rectangle rect) {
    this.rect = rect;
  }

  public StampInfo text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get the text content.
   * @return text
  **/
  @ApiModelProperty(value = "Get the text content.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public StampInfo visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Gets the stamp is visible.
   * @return visible
  **/
  @ApiModelProperty(value = "Gets the stamp is visible.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public StampInfo stampType(StampType stampType) {
    this.stampType = stampType;
    return this;
  }

   /**
   * Gets stamp type.
   * @return stampType
  **/
  @ApiModelProperty(required = true, value = "Gets stamp type.")
  public StampType getStampType() {
    return stampType;
  }

  public void setStampType(StampType stampType) {
    this.stampType = stampType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampInfo stampInfo = (StampInfo) o;
    return Objects.equals(this.id, stampInfo.id) &&
        Objects.equals(this.indexOnPage, stampInfo.indexOnPage) &&
        Objects.equals(this.pageIndex, stampInfo.pageIndex) &&
        Objects.equals(this.rect, stampInfo.rect) &&
        Objects.equals(this.text, stampInfo.text) &&
        Objects.equals(this.visible, stampInfo.visible) &&
        Objects.equals(this.stampType, stampInfo.stampType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, indexOnPage, pageIndex, rect, text, visible, stampType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexOnPage: ").append(toIndentedString(indexOnPage)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    stampType: ").append(toIndentedString(stampType)).append("\n");
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

