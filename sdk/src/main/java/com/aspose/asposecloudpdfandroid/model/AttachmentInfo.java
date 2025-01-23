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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Attachment Info.
 */
@ApiModel(description = "Attachment Info.")

public class AttachmentInfo {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  public AttachmentInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Attachment file path.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Attachment file path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AttachmentInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Attachment file description.
   * @return description
  **/
  @ApiModelProperty(value = "Attachment file description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AttachmentInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Attachment file name.
   * @return name
  **/
  @ApiModelProperty(value = "Attachment file name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentInfo mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Attachment file MIME type.
   * @return mimeType
  **/
  @ApiModelProperty(value = "Attachment file MIME type.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentInfo attachmentInfo = (AttachmentInfo) o;
    return Objects.equals(this.path, attachmentInfo.path) &&
        Objects.equals(this.description, attachmentInfo.description) &&
        Objects.equals(this.name, attachmentInfo.name) &&
        Objects.equals(this.mimeType, attachmentInfo.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, description, name, mimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentInfo {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

