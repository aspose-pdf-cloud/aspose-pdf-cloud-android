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
import com.aspose.asposecloudpdfandroid.model.Annotation;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
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
 * Provides MarkupAnnotation.
 */
@ApiModel(description = "Provides MarkupAnnotation.")

public class MarkupAnnotation extends Annotation {
  @SerializedName("CreationDate")
  private String creationDate = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("RichText")
  private String richText = null;

  public MarkupAnnotation creationDate(String creationDate) {
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

  public MarkupAnnotation subject(String subject) {
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

  public MarkupAnnotation title(String title) {
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

  public MarkupAnnotation richText(String richText) {
    this.richText = richText;
    return this;
  }

   /**
   * Get the annotation RichText.
   * @return richText
  **/
  @ApiModelProperty(value = "Get the annotation RichText.")
  public String getRichText() {
    return richText;
  }

  public void setRichText(String richText) {
    this.richText = richText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarkupAnnotation markupAnnotation = (MarkupAnnotation) o;
    return Objects.equals(this.creationDate, markupAnnotation.creationDate) &&
        Objects.equals(this.subject, markupAnnotation.subject) &&
        Objects.equals(this.title, markupAnnotation.title) &&
        Objects.equals(this.richText, markupAnnotation.richText) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, subject, title, richText, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarkupAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    richText: ").append(toIndentedString(richText)).append("\n");
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

