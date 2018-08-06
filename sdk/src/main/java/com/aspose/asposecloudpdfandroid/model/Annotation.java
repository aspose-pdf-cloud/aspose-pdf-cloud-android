/**
 *
 *   Copyright (c) 2018 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.Color;
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
 * Provides annotation.
 */
@ApiModel(description = "Provides annotation.")

public class Annotation extends LinkElement {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Contents")
  private String contents = null;

  @SerializedName("CreationDate")
  private String creationDate = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Modified")
  private String modified = null;

  public Annotation color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get the annotation color.
   * @return color
  **/
  @ApiModelProperty(value = "Get the annotation color.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Annotation contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get the annotation content.
   * @return contents
  **/
  @ApiModelProperty(value = "Get the annotation content.")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public Annotation creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time when the annotation was created.
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date and time when the annotation was created.")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public Annotation subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get the annotation subject.
   * @return subject
  **/
  @ApiModelProperty(value = "Get the annotation subject.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Annotation title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get the annotation title.
   * @return title
  **/
  @ApiModelProperty(value = "Get the annotation title.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Annotation modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time when the annotation was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time when the annotation was last modified.")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.color, annotation.color) &&
        Objects.equals(this.contents, annotation.contents) &&
        Objects.equals(this.creationDate, annotation.creationDate) &&
        Objects.equals(this.subject, annotation.subject) &&
        Objects.equals(this.title, annotation.title) &&
        Objects.equals(this.modified, annotation.modified) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, contents, creationDate, subject, title, modified, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

