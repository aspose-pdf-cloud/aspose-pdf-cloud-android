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
import com.aspose.asposecloudpdfandroid.model.Annotation;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.Point;
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
import java.util.ArrayList;
import java.util.List;

/**
 * Provides RedactionAnnotation.
 */
@ApiModel(description = "Provides RedactionAnnotation.")

public class RedactionAnnotation extends Annotation {
  @SerializedName("QuadPoint")
  private List<Point> quadPoint = null;

  @SerializedName("FillColor")
  private Color fillColor = null;

  @SerializedName("BorderColor")
  private Color borderColor = null;

  @SerializedName("OverlayText")
  private String overlayText = null;

  @SerializedName("Repeat")
  private Boolean repeat = null;

  @SerializedName("TextAlignment")
  private HorizontalAlignment textAlignment = null;

  public RedactionAnnotation quadPoint(List<Point> quadPoint) {
    this.quadPoint = quadPoint;
    return this;
  }

  public RedactionAnnotation addQuadPointItem(Point quadPointItem) {
    if (this.quadPoint == null) {
      this.quadPoint = new ArrayList<Point>();
    }
    this.quadPoint.add(quadPointItem);
    return this;
  }

   /**
   * An array of 8xN numbers specifying the coordinates of content region that is intended to be removed. 
   * @return quadPoint
  **/
  @ApiModelProperty(value = "An array of 8xN numbers specifying the coordinates of content region that is intended to be removed. ")
  public List<Point> getQuadPoint() {
    return quadPoint;
  }

  public void setQuadPoint(List<Point> quadPoint) {
    this.quadPoint = quadPoint;
  }

  public RedactionAnnotation fillColor(Color fillColor) {
    this.fillColor = fillColor;
    return this;
  }

   /**
   * Gets or sets color to fill annotation.
   * @return fillColor
  **/
  @ApiModelProperty(value = "Gets or sets color to fill annotation.")
  public Color getFillColor() {
    return fillColor;
  }

  public void setFillColor(Color fillColor) {
    this.fillColor = fillColor;
  }

  public RedactionAnnotation borderColor(Color borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Gets or sets color of border which is drawn when redaction is not active.
   * @return borderColor
  **/
  @ApiModelProperty(value = "Gets or sets color of border which is drawn when redaction is not active.")
  public Color getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(Color borderColor) {
    this.borderColor = borderColor;
  }

  public RedactionAnnotation overlayText(String overlayText) {
    this.overlayText = overlayText;
    return this;
  }

   /**
   * Text to print on redact annotation.
   * @return overlayText
  **/
  @ApiModelProperty(value = "Text to print on redact annotation.")
  public String getOverlayText() {
    return overlayText;
  }

  public void setOverlayText(String overlayText) {
    this.overlayText = overlayText;
  }

  public RedactionAnnotation repeat(Boolean repeat) {
    this.repeat = repeat;
    return this;
  }

   /**
   * If true overlay text will be repeated on the annotation. 
   * @return repeat
  **/
  @ApiModelProperty(value = "If true overlay text will be repeated on the annotation. ")
  public Boolean isRepeat() {
    return repeat;
  }

  public void setRepeat(Boolean repeat) {
    this.repeat = repeat;
  }

  public RedactionAnnotation textAlignment(HorizontalAlignment textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

   /**
   * Gets or sets. Alignment of Overlay Text.
   * @return textAlignment
  **/
  @ApiModelProperty(value = "Gets or sets. Alignment of Overlay Text.")
  public HorizontalAlignment getTextAlignment() {
    return textAlignment;
  }

  public void setTextAlignment(HorizontalAlignment textAlignment) {
    this.textAlignment = textAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedactionAnnotation redactionAnnotation = (RedactionAnnotation) o;
    return Objects.equals(this.quadPoint, redactionAnnotation.quadPoint) &&
        Objects.equals(this.fillColor, redactionAnnotation.fillColor) &&
        Objects.equals(this.borderColor, redactionAnnotation.borderColor) &&
        Objects.equals(this.overlayText, redactionAnnotation.overlayText) &&
        Objects.equals(this.repeat, redactionAnnotation.repeat) &&
        Objects.equals(this.textAlignment, redactionAnnotation.textAlignment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quadPoint, fillColor, borderColor, overlayText, repeat, textAlignment, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedactionAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    quadPoint: ").append(toIndentedString(quadPoint)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    overlayText: ").append(toIndentedString(overlayText)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
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

