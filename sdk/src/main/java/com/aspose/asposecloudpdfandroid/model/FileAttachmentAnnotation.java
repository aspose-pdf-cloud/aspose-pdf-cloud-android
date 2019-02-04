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
import com.aspose.asposecloudpdfandroid.model.FileIcon;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
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
 * Provides FileAttachmentAnnotation.
 */
@ApiModel(description = "Provides FileAttachmentAnnotation.")

public class FileAttachmentAnnotation extends MarkupAnnotation {
  @SerializedName("Icon")
  private FileIcon icon = null;

  @SerializedName("Opacity")
  private Double opacity = null;

  @SerializedName("FileDescription")
  private String fileDescription = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("FilePath")
  private String filePath = null;

  public FileAttachmentAnnotation icon(FileIcon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Gets or sets icon that shall be used in displaying annotation.
   * @return icon
  **/
  @ApiModelProperty(value = "Gets or sets icon that shall be used in displaying annotation.")
  public FileIcon getIcon() {
    return icon;
  }

  public void setIcon(FileIcon icon) {
    this.icon = icon;
  }

  public FileAttachmentAnnotation opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets icon&#39;s opacity from 0 to 1: 0 - completely transparant, 1 - completely opaque.
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets icon's opacity from 0 to 1: 0 - completely transparant, 1 - completely opaque.")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public FileAttachmentAnnotation fileDescription(String fileDescription) {
    this.fileDescription = fileDescription;
    return this;
  }

   /**
   * Gets or sets text associated with the file specification. 
   * @return fileDescription
  **/
  @ApiModelProperty(value = "Gets or sets text associated with the file specification. ")
  public String getFileDescription() {
    return fileDescription;
  }

  public void setFileDescription(String fileDescription) {
    this.fileDescription = fileDescription;
  }

  public FileAttachmentAnnotation fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Gets or sets file specification name. 
   * @return fileName
  **/
  @ApiModelProperty(value = "Gets or sets file specification name. ")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileAttachmentAnnotation filePath(String filePath) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAttachmentAnnotation fileAttachmentAnnotation = (FileAttachmentAnnotation) o;
    return Objects.equals(this.icon, fileAttachmentAnnotation.icon) &&
        Objects.equals(this.opacity, fileAttachmentAnnotation.opacity) &&
        Objects.equals(this.fileDescription, fileAttachmentAnnotation.fileDescription) &&
        Objects.equals(this.fileName, fileAttachmentAnnotation.fileName) &&
        Objects.equals(this.filePath, fileAttachmentAnnotation.filePath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, opacity, fileDescription, fileName, filePath, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAttachmentAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    fileDescription: ").append(toIndentedString(fileDescription)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

