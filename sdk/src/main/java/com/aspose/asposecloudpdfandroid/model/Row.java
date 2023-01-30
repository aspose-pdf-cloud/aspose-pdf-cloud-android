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
import com.aspose.asposecloudpdfandroid.model.BorderInfo;
import com.aspose.asposecloudpdfandroid.model.Cell;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
import com.aspose.asposecloudpdfandroid.model.TextState;
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
 * Represents a row of the table.
 */
@ApiModel(description = "Represents a row of the table.")

public class Row {
  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("Border")
  private BorderInfo border = null;

  @SerializedName("Cells")
  private List<Cell> cells = new ArrayList<Cell>();

  @SerializedName("DefaultCellBorder")
  private BorderInfo defaultCellBorder = null;

  @SerializedName("MinRowHeight")
  private Double minRowHeight = null;

  @SerializedName("FixedRowHeight")
  private Double fixedRowHeight = null;

  @SerializedName("IsInNewPage")
  private Boolean isInNewPage = null;

  @SerializedName("IsRowBroken")
  private Boolean isRowBroken = null;

  @SerializedName("DefaultCellTextState")
  private TextState defaultCellTextState = null;

  @SerializedName("DefaultCellPadding")
  private MarginInfo defaultCellPadding = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  public Row backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets the background color.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets the background color.")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Row border(BorderInfo border) {
    this.border = border;
    return this;
  }

   /**
   * Gets or sets the border.
   * @return border
  **/
  @ApiModelProperty(value = "Gets or sets the border.")
  public BorderInfo getBorder() {
    return border;
  }

  public void setBorder(BorderInfo border) {
    this.border = border;
  }

  public Row cells(List<Cell> cells) {
    this.cells = cells;
    return this;
  }

  public Row addCellsItem(Cell cellsItem) {
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Sets the cells of the row.
   * @return cells
  **/
  @ApiModelProperty(required = true, value = "Sets the cells of the row.")
  public List<Cell> getCells() {
    return cells;
  }

  public void setCells(List<Cell> cells) {
    this.cells = cells;
  }

  public Row defaultCellBorder(BorderInfo defaultCellBorder) {
    this.defaultCellBorder = defaultCellBorder;
    return this;
  }

   /**
   * Gets default cell border;
   * @return defaultCellBorder
  **/
  @ApiModelProperty(value = "Gets default cell border;")
  public BorderInfo getDefaultCellBorder() {
    return defaultCellBorder;
  }

  public void setDefaultCellBorder(BorderInfo defaultCellBorder) {
    this.defaultCellBorder = defaultCellBorder;
  }

  public Row minRowHeight(Double minRowHeight) {
    this.minRowHeight = minRowHeight;
    return this;
  }

   /**
   * Gets height for row;
   * @return minRowHeight
  **/
  @ApiModelProperty(value = "Gets height for row;")
  public Double getMinRowHeight() {
    return minRowHeight;
  }

  public void setMinRowHeight(Double minRowHeight) {
    this.minRowHeight = minRowHeight;
  }

  public Row fixedRowHeight(Double fixedRowHeight) {
    this.fixedRowHeight = fixedRowHeight;
    return this;
  }

   /**
   * Gets fixed row height - row may have fixed height;
   * @return fixedRowHeight
  **/
  @ApiModelProperty(value = "Gets fixed row height - row may have fixed height;")
  public Double getFixedRowHeight() {
    return fixedRowHeight;
  }

  public void setFixedRowHeight(Double fixedRowHeight) {
    this.fixedRowHeight = fixedRowHeight;
  }

  public Row isInNewPage(Boolean isInNewPage) {
    this.isInNewPage = isInNewPage;
    return this;
  }

   /**
   * Gets fixed row is in new page - page with this property should be printed to next page Default false;
   * @return isInNewPage
  **/
  @ApiModelProperty(value = "Gets fixed row is in new page - page with this property should be printed to next page Default false;")
  public Boolean isIsInNewPage() {
    return isInNewPage;
  }

  public void setIsInNewPage(Boolean isInNewPage) {
    this.isInNewPage = isInNewPage;
  }

  public Row isRowBroken(Boolean isRowBroken) {
    this.isRowBroken = isRowBroken;
    return this;
  }

   /**
   * Gets is row can be broken between two pages
   * @return isRowBroken
  **/
  @ApiModelProperty(value = "Gets is row can be broken between two pages")
  public Boolean isIsRowBroken() {
    return isRowBroken;
  }

  public void setIsRowBroken(Boolean isRowBroken) {
    this.isRowBroken = isRowBroken;
  }

  public Row defaultCellTextState(TextState defaultCellTextState) {
    this.defaultCellTextState = defaultCellTextState;
    return this;
  }

   /**
   * Gets or sets default text state for row cells
   * @return defaultCellTextState
  **/
  @ApiModelProperty(value = "Gets or sets default text state for row cells")
  public TextState getDefaultCellTextState() {
    return defaultCellTextState;
  }

  public void setDefaultCellTextState(TextState defaultCellTextState) {
    this.defaultCellTextState = defaultCellTextState;
  }

  public Row defaultCellPadding(MarginInfo defaultCellPadding) {
    this.defaultCellPadding = defaultCellPadding;
    return this;
  }

   /**
   * Gets or sets default margin for row cells
   * @return defaultCellPadding
  **/
  @ApiModelProperty(value = "Gets or sets default margin for row cells")
  public MarginInfo getDefaultCellPadding() {
    return defaultCellPadding;
  }

  public void setDefaultCellPadding(MarginInfo defaultCellPadding) {
    this.defaultCellPadding = defaultCellPadding;
  }

  public Row verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets or sets the vertical alignment.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets the vertical alignment.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return Objects.equals(this.backgroundColor, row.backgroundColor) &&
        Objects.equals(this.border, row.border) &&
        Objects.equals(this.cells, row.cells) &&
        Objects.equals(this.defaultCellBorder, row.defaultCellBorder) &&
        Objects.equals(this.minRowHeight, row.minRowHeight) &&
        Objects.equals(this.fixedRowHeight, row.fixedRowHeight) &&
        Objects.equals(this.isInNewPage, row.isInNewPage) &&
        Objects.equals(this.isRowBroken, row.isRowBroken) &&
        Objects.equals(this.defaultCellTextState, row.defaultCellTextState) &&
        Objects.equals(this.defaultCellPadding, row.defaultCellPadding) &&
        Objects.equals(this.verticalAlignment, row.verticalAlignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, border, cells, defaultCellBorder, minRowHeight, fixedRowHeight, isInNewPage, isRowBroken, defaultCellTextState, defaultCellPadding, verticalAlignment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    defaultCellBorder: ").append(toIndentedString(defaultCellBorder)).append("\n");
    sb.append("    minRowHeight: ").append(toIndentedString(minRowHeight)).append("\n");
    sb.append("    fixedRowHeight: ").append(toIndentedString(fixedRowHeight)).append("\n");
    sb.append("    isInNewPage: ").append(toIndentedString(isInNewPage)).append("\n");
    sb.append("    isRowBroken: ").append(toIndentedString(isRowBroken)).append("\n");
    sb.append("    defaultCellTextState: ").append(toIndentedString(defaultCellTextState)).append("\n");
    sb.append("    defaultCellPadding: ").append(toIndentedString(defaultCellPadding)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
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

