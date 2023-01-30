/**
 *
 * Copyright (c) 2023 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.CellRecognized;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
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
 * RowRecognized
 */

public class RowRecognized {
  @SerializedName("CellList")
  private List<CellRecognized> cellList = null;

  @SerializedName("Rectangle")
  private Rectangle rectangle = null;

  public RowRecognized cellList(List<CellRecognized> cellList) {
    this.cellList = cellList;
    return this;
  }

  public RowRecognized addCellListItem(CellRecognized cellListItem) {
    if (this.cellList == null) {
      this.cellList = new ArrayList<CellRecognized>();
    }
    this.cellList.add(cellListItem);
    return this;
  }

   /**
   * Gets readonly IList containing cells of the row
   * @return cellList
  **/
  @ApiModelProperty(value = "Gets readonly IList containing cells of the row")
  public List<CellRecognized> getCellList() {
    return cellList;
  }

  public void setCellList(List<CellRecognized> cellList) {
    this.cellList = cellList;
  }

  public RowRecognized rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Gets rectangle that describes position of the row on page
   * @return rectangle
  **/
  @ApiModelProperty(value = "Gets rectangle that describes position of the row on page")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowRecognized rowRecognized = (RowRecognized) o;
    return Objects.equals(this.cellList, rowRecognized.cellList) &&
        Objects.equals(this.rectangle, rowRecognized.rectangle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellList, rectangle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowRecognized {\n");
    
    sb.append("    cellList: ").append(toIndentedString(cellList)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
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

