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
import com.aspose.asposecloudpdfandroid.model.LineEnding;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Point;
import com.aspose.asposecloudpdfandroid.model.PolyIntent;
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
 * Provides PolyAnnotation.
 */
@ApiModel(description = "Provides PolyAnnotation.")

public class PolyAnnotation extends MarkupAnnotation {
  @SerializedName("InteriorColor")
  private Color interiorColor = null;

  @SerializedName("StartingStyle")
  private LineEnding startingStyle = null;

  @SerializedName("EndingStyle")
  private LineEnding endingStyle = null;

  @SerializedName("Intent")
  private PolyIntent intent = null;

  @SerializedName("Vertices")
  private List<Point> vertices = null;

  public PolyAnnotation interiorColor(Color interiorColor) {
    this.interiorColor = interiorColor;
    return this;
  }

   /**
   * Gets or sets the interior color with which to fill the annotation?s line endings.
   * @return interiorColor
  **/
  @ApiModelProperty(value = "Gets or sets the interior color with which to fill the annotation?s line endings.")
  public Color getInteriorColor() {
    return interiorColor;
  }

  public void setInteriorColor(Color interiorColor) {
    this.interiorColor = interiorColor;
  }

  public PolyAnnotation startingStyle(LineEnding startingStyle) {
    this.startingStyle = startingStyle;
    return this;
  }

   /**
   * Gets or sets the style of first line ending.
   * @return startingStyle
  **/
  @ApiModelProperty(value = "Gets or sets the style of first line ending.")
  public LineEnding getStartingStyle() {
    return startingStyle;
  }

  public void setStartingStyle(LineEnding startingStyle) {
    this.startingStyle = startingStyle;
  }

  public PolyAnnotation endingStyle(LineEnding endingStyle) {
    this.endingStyle = endingStyle;
    return this;
  }

   /**
   * Gets or sets the style of second line ending.
   * @return endingStyle
  **/
  @ApiModelProperty(value = "Gets or sets the style of second line ending.")
  public LineEnding getEndingStyle() {
    return endingStyle;
  }

  public void setEndingStyle(LineEnding endingStyle) {
    this.endingStyle = endingStyle;
  }

  public PolyAnnotation intent(PolyIntent intent) {
    this.intent = intent;
    return this;
  }

   /**
   * Gets or sets the intent of the polygon or polyline annotation.
   * @return intent
  **/
  @ApiModelProperty(value = "Gets or sets the intent of the polygon or polyline annotation.")
  public PolyIntent getIntent() {
    return intent;
  }

  public void setIntent(PolyIntent intent) {
    this.intent = intent;
  }

  public PolyAnnotation vertices(List<Point> vertices) {
    this.vertices = vertices;
    return this;
  }

  public PolyAnnotation addVerticesItem(Point verticesItem) {
    if (this.vertices == null) {
      this.vertices = new ArrayList<Point>();
    }
    this.vertices.add(verticesItem);
    return this;
  }

   /**
   * Gets or sets an array of points representing the horizontal and vertical coordinates of each vertex.
   * @return vertices
  **/
  @ApiModelProperty(value = "Gets or sets an array of points representing the horizontal and vertical coordinates of each vertex.")
  public List<Point> getVertices() {
    return vertices;
  }

  public void setVertices(List<Point> vertices) {
    this.vertices = vertices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolyAnnotation polyAnnotation = (PolyAnnotation) o;
    return Objects.equals(this.interiorColor, polyAnnotation.interiorColor) &&
        Objects.equals(this.startingStyle, polyAnnotation.startingStyle) &&
        Objects.equals(this.endingStyle, polyAnnotation.endingStyle) &&
        Objects.equals(this.intent, polyAnnotation.intent) &&
        Objects.equals(this.vertices, polyAnnotation.vertices) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interiorColor, startingStyle, endingStyle, intent, vertices, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolyAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interiorColor: ").append(toIndentedString(interiorColor)).append("\n");
    sb.append("    startingStyle: ").append(toIndentedString(startingStyle)).append("\n");
    sb.append("    endingStyle: ").append(toIndentedString(endingStyle)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
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

