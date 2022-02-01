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
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
import com.aspose.asposecloudpdfandroid.model.VerticalAlignment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents Image Fragment DTO.
 */
@ApiModel(description = "Represents Image Fragment DTO.")

public class ImageFragment {
  @SerializedName("ImageFile")
  private String imageFile = null;

  @SerializedName("FixWidth")
  private Double fixWidth = null;

  @SerializedName("FixHeight")
  private Double fixHeight = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("ImageScale")
  private Double imageScale = null;

  @SerializedName("Margin")
  private MarginInfo margin = null;

  public ImageFragment imageFile(String imageFile) {
    this.imageFile = imageFile;
    return this;
  }

   /**
   * Gets or sets full storage path of image.
   * @return imageFile
  **/
  @ApiModelProperty(required = true, value = "Gets or sets full storage path of image.")
  public String getImageFile() {
    return imageFile;
  }

  public void setImageFile(String imageFile) {
    this.imageFile = imageFile;
  }

  public ImageFragment fixWidth(Double fixWidth) {
    this.fixWidth = fixWidth;
    return this;
  }

   /**
   * Gets or sets fix width of the image.
   * @return fixWidth
  **/
  @ApiModelProperty(value = "Gets or sets fix width of the image.")
  public Double getFixWidth() {
    return fixWidth;
  }

  public void setFixWidth(Double fixWidth) {
    this.fixWidth = fixWidth;
  }

  public ImageFragment fixHeight(Double fixHeight) {
    this.fixHeight = fixHeight;
    return this;
  }

   /**
   * Gets or sets fix height of the image.
   * @return fixHeight
  **/
  @ApiModelProperty(value = "Gets or sets fix height of the image.")
  public Double getFixHeight() {
    return fixHeight;
  }

  public void setFixHeight(Double fixHeight) {
    this.fixHeight = fixHeight;
  }

  public ImageFragment horizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets or sets horizontal alignment of the image.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets horizontal alignment of the image.")
  public HorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public ImageFragment verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets or sets vertical alignment of the image.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets vertical alignment of the image.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public ImageFragment imageScale(Double imageScale) {
    this.imageScale = imageScale;
    return this;
  }

   /**
   * Gets or sets ImageScale of the image.
   * @return imageScale
  **/
  @ApiModelProperty(value = "Gets or sets ImageScale of the image.")
  public Double getImageScale() {
    return imageScale;
  }

  public void setImageScale(Double imageScale) {
    this.imageScale = imageScale;
  }

  public ImageFragment margin(MarginInfo margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Gets or sets Margin of the image.
   * @return margin
  **/
  @ApiModelProperty(value = "Gets or sets Margin of the image.")
  public MarginInfo getMargin() {
    return margin;
  }

  public void setMargin(MarginInfo margin) {
    this.margin = margin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageFragment imageFragment = (ImageFragment) o;
    return Objects.equals(this.imageFile, imageFragment.imageFile) &&
        Objects.equals(this.fixWidth, imageFragment.fixWidth) &&
        Objects.equals(this.fixHeight, imageFragment.fixHeight) &&
        Objects.equals(this.horizontalAlignment, imageFragment.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, imageFragment.verticalAlignment) &&
        Objects.equals(this.imageScale, imageFragment.imageScale) &&
        Objects.equals(this.margin, imageFragment.margin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageFile, fixWidth, fixHeight, horizontalAlignment, verticalAlignment, imageScale, margin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageFragment {\n");
    
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    fixWidth: ").append(toIndentedString(fixWidth)).append("\n");
    sb.append("    fixHeight: ").append(toIndentedString(fixHeight)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    imageScale: ").append(toIndentedString(imageScale)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
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

