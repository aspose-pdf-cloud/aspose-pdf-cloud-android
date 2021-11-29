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
import com.aspose.asposecloudpdfandroid.model.ImageSrcType;
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Template of image.
 */
@ApiModel(description = "Template of image.")

public class ImageTemplate {
  @SerializedName("ImagePath")
  private String imagePath = null;

  @SerializedName("ImageSrcType")
  private ImageSrcType imageSrcType = null;

  @SerializedName("LeftMargin")
  private Double leftMargin = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  @SerializedName("BottomMargin")
  private Double bottomMargin = null;

  @SerializedName("PageWidth")
  private Double pageWidth = null;

  @SerializedName("PageHeight")
  private Double pageHeight = null;

  @SerializedName("MarginInfo")
  private MarginInfo marginInfo = null;

  public ImageTemplate imagePath(String imagePath) {
    this.imagePath = imagePath;
    return this;
  }

   /**
   * A path for image.
   * @return imagePath
  **/
  @ApiModelProperty(required = true, value = "A path for image.")
  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public ImageTemplate imageSrcType(ImageSrcType imageSrcType) {
    this.imageSrcType = imageSrcType;
    return this;
  }

   /**
   * Image type.
   * @return imageSrcType
  **/
  @ApiModelProperty(required = true, value = "Image type.")
  public ImageSrcType getImageSrcType() {
    return imageSrcType;
  }

  public void setImageSrcType(ImageSrcType imageSrcType) {
    this.imageSrcType = imageSrcType;
  }

  public ImageTemplate leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Get leftMargin
   * @return leftMargin
  **/
  @ApiModelProperty(value = "")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public ImageTemplate rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Get rightMargin
   * @return rightMargin
  **/
  @ApiModelProperty(value = "")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }

  public ImageTemplate topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Get topMargin
   * @return topMargin
  **/
  @ApiModelProperty(value = "")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public ImageTemplate bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Get bottomMargin
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }

  public ImageTemplate pageWidth(Double pageWidth) {
    this.pageWidth = pageWidth;
    return this;
  }

   /**
   * Get pageWidth
   * @return pageWidth
  **/
  @ApiModelProperty(value = "")
  public Double getPageWidth() {
    return pageWidth;
  }

  public void setPageWidth(Double pageWidth) {
    this.pageWidth = pageWidth;
  }

  public ImageTemplate pageHeight(Double pageHeight) {
    this.pageHeight = pageHeight;
    return this;
  }

   /**
   * Get pageHeight
   * @return pageHeight
  **/
  @ApiModelProperty(value = "")
  public Double getPageHeight() {
    return pageHeight;
  }

  public void setPageHeight(Double pageHeight) {
    this.pageHeight = pageHeight;
  }

  public ImageTemplate marginInfo(MarginInfo marginInfo) {
    this.marginInfo = marginInfo;
    return this;
  }

   /**
   * Get marginInfo
   * @return marginInfo
  **/
  @ApiModelProperty(value = "")
  public MarginInfo getMarginInfo() {
    return marginInfo;
  }

  public void setMarginInfo(MarginInfo marginInfo) {
    this.marginInfo = marginInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageTemplate imageTemplate = (ImageTemplate) o;
    return Objects.equals(this.imagePath, imageTemplate.imagePath) &&
        Objects.equals(this.imageSrcType, imageTemplate.imageSrcType) &&
        Objects.equals(this.leftMargin, imageTemplate.leftMargin) &&
        Objects.equals(this.rightMargin, imageTemplate.rightMargin) &&
        Objects.equals(this.topMargin, imageTemplate.topMargin) &&
        Objects.equals(this.bottomMargin, imageTemplate.bottomMargin) &&
        Objects.equals(this.pageWidth, imageTemplate.pageWidth) &&
        Objects.equals(this.pageHeight, imageTemplate.pageHeight) &&
        Objects.equals(this.marginInfo, imageTemplate.marginInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagePath, imageSrcType, leftMargin, rightMargin, topMargin, bottomMargin, pageWidth, pageHeight, marginInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageTemplate {\n");
    
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    imageSrcType: ").append(toIndentedString(imageSrcType)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    pageWidth: ").append(toIndentedString(pageWidth)).append("\n");
    sb.append("    pageHeight: ").append(toIndentedString(pageHeight)).append("\n");
    sb.append("    marginInfo: ").append(toIndentedString(marginInfo)).append("\n");
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

