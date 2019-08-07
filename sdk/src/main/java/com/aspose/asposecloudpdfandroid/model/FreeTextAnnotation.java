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
import com.aspose.asposecloudpdfandroid.model.FreeTextIntent;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Justification;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.Rotation;
import com.aspose.asposecloudpdfandroid.model.TextStyle;
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
 * Provides FreeTextAnnotation.
 */
@ApiModel(description = "Provides FreeTextAnnotation.")

public class FreeTextAnnotation extends MarkupAnnotation {
  @SerializedName("Justification")
  private Justification justification = null;

  @SerializedName("Intent")
  private FreeTextIntent intent = null;

  @SerializedName("Rotate")
  private Rotation rotate = null;

  @SerializedName("TextStyle")
  private TextStyle textStyle = null;

  public FreeTextAnnotation justification(Justification justification) {
    this.justification = justification;
    return this;
  }

   /**
   * Gets Justification of the annotation.
   * @return justification
  **/
  @ApiModelProperty(value = "Gets Justification of the annotation.")
  public Justification getJustification() {
    return justification;
  }

  public void setJustification(Justification justification) {
    this.justification = justification;
  }

  public FreeTextAnnotation intent(FreeTextIntent intent) {
    this.intent = intent;
    return this;
  }

   /**
   * Gets or sets the intent of the free text annotation.
   * @return intent
  **/
  @ApiModelProperty(value = "Gets or sets the intent of the free text annotation.")
  public FreeTextIntent getIntent() {
    return intent;
  }

  public void setIntent(FreeTextIntent intent) {
    this.intent = intent;
  }

  public FreeTextAnnotation rotate(Rotation rotate) {
    this.rotate = rotate;
    return this;
  }

   /**
   * Angle of annotation rotation.
   * @return rotate
  **/
  @ApiModelProperty(value = "Angle of annotation rotation.")
  public Rotation getRotate() {
    return rotate;
  }

  public void setRotate(Rotation rotate) {
    this.rotate = rotate;
  }

  public FreeTextAnnotation textStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
    return this;
  }

   /**
   * Text style of the annotation.
   * @return textStyle
  **/
  @ApiModelProperty(required = true, value = "Text style of the annotation.")
  public TextStyle getTextStyle() {
    return textStyle;
  }

  public void setTextStyle(TextStyle textStyle) {
    this.textStyle = textStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextAnnotation freeTextAnnotation = (FreeTextAnnotation) o;
    return Objects.equals(this.justification, freeTextAnnotation.justification) &&
        Objects.equals(this.intent, freeTextAnnotation.intent) &&
        Objects.equals(this.rotate, freeTextAnnotation.rotate) &&
        Objects.equals(this.textStyle, freeTextAnnotation.textStyle) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justification, intent, rotate, textStyle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    justification: ").append(toIndentedString(justification)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    textStyle: ").append(toIndentedString(textStyle)).append("\n");
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

