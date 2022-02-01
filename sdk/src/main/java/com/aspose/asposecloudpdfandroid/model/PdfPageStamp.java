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
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.Rotation;
import com.aspose.asposecloudpdfandroid.model.StampBase;
import com.aspose.asposecloudpdfandroid.model.VerticalAlignment;
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
 * Represents Pdf stamps.
 */
@ApiModel(description = "Represents Pdf stamps.")

public class PdfPageStamp extends StampBase {
  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("BottomMargin")
  private Double bottomMargin = null;

  @SerializedName("LeftMargin")
  private Double leftMargin = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  public PdfPageStamp fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Gets or sets the file name.
   * @return fileName
  **/
  @ApiModelProperty(value = "Gets or sets the file name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public PdfPageStamp pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Gets or sets the index of the page.
   * @return pageIndex
  **/
  @ApiModelProperty(value = "Gets or sets the index of the page.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public PdfPageStamp verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets or sets vertical alignment of stamp on page.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets vertical alignment of stamp on page.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public PdfPageStamp bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Gets or sets bottom margin of stamp.
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "Gets or sets bottom margin of stamp.")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }

  public PdfPageStamp leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Gets or sets left margin of stamp.
   * @return leftMargin
  **/
  @ApiModelProperty(value = "Gets or sets left margin of stamp.")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public PdfPageStamp topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Gets or sets top margin of stamp.
   * @return topMargin
  **/
  @ApiModelProperty(value = "Gets or sets top margin of stamp.")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public PdfPageStamp rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Gets or sets right margin of stamp.
   * @return rightMargin
  **/
  @ApiModelProperty(value = "Gets or sets right margin of stamp.")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfPageStamp pdfPageStamp = (PdfPageStamp) o;
    return Objects.equals(this.fileName, pdfPageStamp.fileName) &&
        Objects.equals(this.pageIndex, pdfPageStamp.pageIndex) &&
        Objects.equals(this.verticalAlignment, pdfPageStamp.verticalAlignment) &&
        Objects.equals(this.bottomMargin, pdfPageStamp.bottomMargin) &&
        Objects.equals(this.leftMargin, pdfPageStamp.leftMargin) &&
        Objects.equals(this.topMargin, pdfPageStamp.topMargin) &&
        Objects.equals(this.rightMargin, pdfPageStamp.rightMargin) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, pageIndex, verticalAlignment, bottomMargin, leftMargin, topMargin, rightMargin, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfPageStamp {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
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

