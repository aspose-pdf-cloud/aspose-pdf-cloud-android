/**
 *
 *   Copyright (c) 2019 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.StampIcon;
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
 * Provides StampAnnotation.
 */
@ApiModel(description = "Provides StampAnnotation.")

public class StampAnnotation extends MarkupAnnotation {
  @SerializedName("Icon")
  private StampIcon icon = null;

  @SerializedName("FilePath")
  private String filePath = null;

  @SerializedName("HasImage")
  private Boolean hasImage = null;

  public StampAnnotation icon(StampIcon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Gets or sets icon for rubber stamp.
   * @return icon
  **/
  @ApiModelProperty(value = "Gets or sets icon for rubber stamp.")
  public StampIcon getIcon() {
    return icon;
  }

  public void setIcon(StampIcon icon) {
    this.icon = icon;
  }

  public StampAnnotation filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * Sets content file path. 
   * @return filePath
  **/
  @ApiModelProperty(value = "Sets content file path. ")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public StampAnnotation hasImage(Boolean hasImage) {
    this.hasImage = hasImage;
    return this;
  }

   /**
   * Gets is image exist. 
   * @return hasImage
  **/
  @ApiModelProperty(value = "Gets is image exist. ")
  public Boolean isHasImage() {
    return hasImage;
  }

  public void setHasImage(Boolean hasImage) {
    this.hasImage = hasImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampAnnotation stampAnnotation = (StampAnnotation) o;
    return Objects.equals(this.icon, stampAnnotation.icon) &&
        Objects.equals(this.filePath, stampAnnotation.filePath) &&
        Objects.equals(this.hasImage, stampAnnotation.hasImage) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, filePath, hasImage, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    hasImage: ").append(toIndentedString(hasImage)).append("\n");
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

