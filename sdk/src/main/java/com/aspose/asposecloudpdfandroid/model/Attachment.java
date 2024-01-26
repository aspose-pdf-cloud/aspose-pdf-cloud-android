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
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
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
 * Provides link to attachment.
 */
@ApiModel(description = "Provides link to attachment.")

public class Attachment extends LinkElement {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("CreationDate")
  private String creationDate = null;

  @SerializedName("ModificationDate")
  private String modificationDate = null;

  @SerializedName("Size")
  private Integer size = null;

  @SerializedName("CheckSum")
  private String checkSum = null;

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Gets text associated with the attachment. 
   * @return description
  **/
  @ApiModelProperty(value = "Gets text associated with the attachment. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Gets subtype of the attachment file.
   * @return mimeType
  **/
  @ApiModelProperty(value = "Gets subtype of the attachment file.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Attachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets the name of the attachment. 
   * @return name
  **/
  @ApiModelProperty(value = "Gets the name of the attachment. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachment creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time when the embedded file was created.
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date and time when the embedded file was created.")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Attachment modificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * The date and time when the embedded file was last modified.
   * @return modificationDate
  **/
  @ApiModelProperty(value = "The date and time when the embedded file was last modified.")
  public String getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
  }

  public Attachment size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the uncompressed embedded file, in bytes.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "The size of the uncompressed embedded file, in bytes.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Attachment checkSum(String checkSum) {
    this.checkSum = checkSum;
    return this;
  }

   /**
   * A 16-byte string that is the checksum of the bytes of the uncompressed embedded file.  The checksum is calculated by applying the standard MD5 message-digest algorithm  to the bytes of the embedded file stream.
   * @return checkSum
  **/
  @ApiModelProperty(value = "A 16-byte string that is the checksum of the bytes of the uncompressed embedded file.  The checksum is calculated by applying the standard MD5 message-digest algorithm  to the bytes of the embedded file stream.")
  public String getCheckSum() {
    return checkSum;
  }

  public void setCheckSum(String checkSum) {
    this.checkSum = checkSum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.creationDate, attachment.creationDate) &&
        Objects.equals(this.modificationDate, attachment.modificationDate) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.checkSum, attachment.checkSum) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, mimeType, name, creationDate, modificationDate, size, checkSum, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    checkSum: ").append(toIndentedString(checkSum)).append("\n");
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

