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
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.RowRecognized;
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
 * TableRecognized
 */

public class TableRecognized extends LinkElement {
  @SerializedName("RowList")
  private List<RowRecognized> rowList = null;

  @SerializedName("Rectangle")
  private Rectangle rectangle = null;

  @SerializedName("PageNum")
  private Integer pageNum = null;

  @SerializedName("Id")
  private String id = null;

  public TableRecognized rowList(List<RowRecognized> rowList) {
    this.rowList = rowList;
    return this;
  }

  public TableRecognized addRowListItem(RowRecognized rowListItem) {
    if (this.rowList == null) {
      this.rowList = new ArrayList<RowRecognized>();
    }
    this.rowList.add(rowListItem);
    return this;
  }

   /**
   * Gets readonly IList containing rows of the table
   * @return rowList
  **/
  @ApiModelProperty(value = "Gets readonly IList containing rows of the table")
  public List<RowRecognized> getRowList() {
    return rowList;
  }

  public void setRowList(List<RowRecognized> rowList) {
    this.rowList = rowList;
  }

  public TableRecognized rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Gets rectangle that describes position of the table on page
   * @return rectangle
  **/
  @ApiModelProperty(value = "Gets rectangle that describes position of the table on page")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public TableRecognized pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Gets number of the page containing this table
   * @return pageNum
  **/
  @ApiModelProperty(value = "Gets number of the page containing this table")
  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public TableRecognized id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Gets ID of the table.
   * @return id
  **/
  @ApiModelProperty(value = "Gets ID of the table.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRecognized tableRecognized = (TableRecognized) o;
    return Objects.equals(this.rowList, tableRecognized.rowList) &&
        Objects.equals(this.rectangle, tableRecognized.rectangle) &&
        Objects.equals(this.pageNum, tableRecognized.pageNum) &&
        Objects.equals(this.id, tableRecognized.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowList, rectangle, pageNum, id, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRecognized {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rowList: ").append(toIndentedString(rowList)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

