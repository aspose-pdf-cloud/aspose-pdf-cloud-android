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
 * Provides CommonFigureAnnotation.
 */
@ApiModel(description = "Provides CommonFigureAnnotation.")

public class CommonFigureAnnotation extends MarkupAnnotation {
  @SerializedName("InteriorColor")
  private Color interiorColor = null;

  @SerializedName("Frame")
  private Rectangle frame = null;

  public CommonFigureAnnotation interiorColor(Color interiorColor) {
    this.interiorColor = interiorColor;
    return this;
  }

   /**
   * Get the annotation InteriorColor.
   * @return interiorColor
  **/
  @ApiModelProperty(value = "Get the annotation InteriorColor.")
  public Color getInteriorColor() {
    return interiorColor;
  }

  public void setInteriorColor(Color interiorColor) {
    this.interiorColor = interiorColor;
  }

  public CommonFigureAnnotation frame(Rectangle frame) {
    this.frame = frame;
    return this;
  }

   /**
   * Get or set the annotation Rectangle of frame.
   * @return frame
  **/
  @ApiModelProperty(value = "Get or set the annotation Rectangle of frame.")
  public Rectangle getFrame() {
    return frame;
  }

  public void setFrame(Rectangle frame) {
    this.frame = frame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonFigureAnnotation commonFigureAnnotation = (CommonFigureAnnotation) o;
    return Objects.equals(this.interiorColor, commonFigureAnnotation.interiorColor) &&
        Objects.equals(this.frame, commonFigureAnnotation.frame) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interiorColor, frame, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonFigureAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interiorColor: ").append(toIndentedString(interiorColor)).append("\n");
    sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
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

