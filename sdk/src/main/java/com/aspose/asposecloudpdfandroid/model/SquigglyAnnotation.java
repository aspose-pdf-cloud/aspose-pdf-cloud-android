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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Point;
import com.aspose.asposecloudpdfandroid.model.RectanglePdf;
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
 * Provides SquigglyAnnotation.
 */
@ApiModel(description = "Provides SquigglyAnnotation.")

public class SquigglyAnnotation extends MarkupAnnotation {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("QuadPoints")
  private List<Point> quadPoints = null;

  public SquigglyAnnotation color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Color of the annotation.
   * @return color
  **/
  @ApiModelProperty(value = "Color of the annotation.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public SquigglyAnnotation quadPoints(List<Point> quadPoints) {
    this.quadPoints = quadPoints;
    return this;
  }

  public SquigglyAnnotation addQuadPointsItem(Point quadPointsItem) {
    if (this.quadPoints == null) {
      this.quadPoints = new ArrayList<Point>();
    }
    this.quadPoints.add(quadPointsItem);
    return this;
  }

   /**
   * Gets or sets an array of points specifying the coordinates of n quadrilaterals. Each quadrilateral encompasses a word or group of contiguous words in the text underlying the annotation.
   * @return quadPoints
  **/
  @ApiModelProperty(value = "Gets or sets an array of points specifying the coordinates of n quadrilaterals. Each quadrilateral encompasses a word or group of contiguous words in the text underlying the annotation.")
  public List<Point> getQuadPoints() {
    return quadPoints;
  }

  public void setQuadPoints(List<Point> quadPoints) {
    this.quadPoints = quadPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SquigglyAnnotation squigglyAnnotation = (SquigglyAnnotation) o;
    return Objects.equals(this.color, squigglyAnnotation.color) &&
        Objects.equals(this.quadPoints, squigglyAnnotation.quadPoints) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, quadPoints, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SquigglyAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    quadPoints: ").append(toIndentedString(quadPoints)).append("\n");
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
