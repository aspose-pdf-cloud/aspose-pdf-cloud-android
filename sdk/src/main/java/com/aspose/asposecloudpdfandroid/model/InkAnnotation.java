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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.CapStyle;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
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
 * Provides InkAnnotation.
 */
@ApiModel(description = "Provides InkAnnotation.")

public class InkAnnotation extends MarkupAnnotation {
  @SerializedName("InkList")
  private List<List<Point>> inkList = null;

  @SerializedName("CapStyle")
  private CapStyle capStyle = null;

  public InkAnnotation inkList(List<List<Point>> inkList) {
    this.inkList = inkList;
    return this;
  }

  public InkAnnotation addInkListItem(List<Point> inkListItem) {
    if (this.inkList == null) {
      this.inkList = new ArrayList<List<Point>>();
    }
    this.inkList.add(inkListItem);
    return this;
  }

   /**
   * Gets or sets list of gestures that are independent lines which are represented by Point[] arrays.
   * @return inkList
  **/
  @ApiModelProperty(value = "Gets or sets list of gestures that are independent lines which are represented by Point[] arrays.")
  public List<List<Point>> getInkList() {
    return inkList;
  }

  public void setInkList(List<List<Point>> inkList) {
    this.inkList = inkList;
  }

  public InkAnnotation capStyle(CapStyle capStyle) {
    this.capStyle = capStyle;
    return this;
  }

   /**
   * Style of ink annotation line endings.
   * @return capStyle
  **/
  @ApiModelProperty(value = "Style of ink annotation line endings.")
  public CapStyle getCapStyle() {
    return capStyle;
  }

  public void setCapStyle(CapStyle capStyle) {
    this.capStyle = capStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InkAnnotation inkAnnotation = (InkAnnotation) o;
    return Objects.equals(this.inkList, inkAnnotation.inkList) &&
        Objects.equals(this.capStyle, inkAnnotation.capStyle) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inkList, capStyle, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InkAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inkList: ").append(toIndentedString(inkList)).append("\n");
    sb.append("    capStyle: ").append(toIndentedString(capStyle)).append("\n");
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

