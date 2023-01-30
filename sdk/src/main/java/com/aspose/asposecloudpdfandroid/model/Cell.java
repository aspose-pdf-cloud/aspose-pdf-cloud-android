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
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.ImageFragment;
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
import com.aspose.asposecloudpdfandroid.model.TextRect;
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
 * Represents a cell of the table&#39;s row.
 */
@ApiModel(description = "Represents a cell of the table's row.")

public class Cell {
  @SerializedName("IsNoBorder")
  private Boolean isNoBorder = null;

  @SerializedName("Margin")
  private MarginInfo margin = null;

  @SerializedName("Border")
  private BorderInfo border = null;

  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("BackgroundImageFile")
  private String backgroundImageFile = null;

  @SerializedName("BackgroundImageStorageFile")
  private String backgroundImageStorageFile = null;

  @SerializedName("Alignment")
  private HorizontalAlignment alignment = null;

  @SerializedName("DefaultCellTextState")
  private TextState defaultCellTextState = null;

  @SerializedName("Paragraphs")
  private List<TextRect> paragraphs = null;

  @SerializedName("IsWordWrapped")
  private Boolean isWordWrapped = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("ColSpan")
  private Integer colSpan = null;

  @SerializedName("RowSpan")
  private Integer rowSpan = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("HtmlFragment")
  private String htmlFragment = null;

  @SerializedName("Images")
  private List<ImageFragment> images = null;

  public Cell isNoBorder(Boolean isNoBorder) {
    this.isNoBorder = isNoBorder;
    return this;
  }

   /**
   * Gets or sets the cell have border.
   * @return isNoBorder
  **/
  @ApiModelProperty(value = "Gets or sets the cell have border.")
  public Boolean isIsNoBorder() {
    return isNoBorder;
  }

  public void setIsNoBorder(Boolean isNoBorder) {
    this.isNoBorder = isNoBorder;
  }

  public Cell margin(MarginInfo margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Gets or sets the padding.
   * @return margin
  **/
  @ApiModelProperty(value = "Gets or sets the padding.")
  public MarginInfo getMargin() {
    return margin;
  }

  public void setMargin(MarginInfo margin) {
    this.margin = margin;
  }

  public Cell border(BorderInfo border) {
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

  public Cell backgroundColor(Color backgroundColor) {
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

  public Cell backgroundImageFile(String backgroundImageFile) {
    this.backgroundImageFile = backgroundImageFile;
    return this;
  }

   /**
   * Gets or sets the background image file.
   * @return backgroundImageFile
  **/
  @ApiModelProperty(value = "Gets or sets the background image file.")
  public String getBackgroundImageFile() {
    return backgroundImageFile;
  }

  public void setBackgroundImageFile(String backgroundImageFile) {
    this.backgroundImageFile = backgroundImageFile;
  }

  public Cell backgroundImageStorageFile(String backgroundImageStorageFile) {
    this.backgroundImageStorageFile = backgroundImageStorageFile;
    return this;
  }

   /**
   * Gets or sets path of the background image file from storage.
   * @return backgroundImageStorageFile
  **/
  @ApiModelProperty(value = "Gets or sets path of the background image file from storage.")
  public String getBackgroundImageStorageFile() {
    return backgroundImageStorageFile;
  }

  public void setBackgroundImageStorageFile(String backgroundImageStorageFile) {
    this.backgroundImageStorageFile = backgroundImageStorageFile;
  }

  public Cell alignment(HorizontalAlignment alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Gets or sets the alignment.
   * @return alignment
  **/
  @ApiModelProperty(value = "Gets or sets the alignment.")
  public HorizontalAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(HorizontalAlignment alignment) {
    this.alignment = alignment;
  }

  public Cell defaultCellTextState(TextState defaultCellTextState) {
    this.defaultCellTextState = defaultCellTextState;
    return this;
  }

   /**
   * Gets or sets the default cell text state.
   * @return defaultCellTextState
  **/
  @ApiModelProperty(value = "Gets or sets the default cell text state.")
  public TextState getDefaultCellTextState() {
    return defaultCellTextState;
  }

  public void setDefaultCellTextState(TextState defaultCellTextState) {
    this.defaultCellTextState = defaultCellTextState;
  }

  public Cell paragraphs(List<TextRect> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public Cell addParagraphsItem(TextRect paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<TextRect>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * Gets or sets the cell&#39;s formatted text.
   * @return paragraphs
  **/
  @ApiModelProperty(value = "Gets or sets the cell's formatted text.")
  public List<TextRect> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(List<TextRect> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public Cell isWordWrapped(Boolean isWordWrapped) {
    this.isWordWrapped = isWordWrapped;
    return this;
  }

   /**
   * Gets or sets the cell&#39;s text word wrapped.
   * @return isWordWrapped
  **/
  @ApiModelProperty(value = "Gets or sets the cell's text word wrapped.")
  public Boolean isIsWordWrapped() {
    return isWordWrapped;
  }

  public void setIsWordWrapped(Boolean isWordWrapped) {
    this.isWordWrapped = isWordWrapped;
  }

  public Cell verticalAlignment(VerticalAlignment verticalAlignment) {
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

  public Cell colSpan(Integer colSpan) {
    this.colSpan = colSpan;
    return this;
  }

   /**
   * Gets or sets the column span.
   * @return colSpan
  **/
  @ApiModelProperty(value = "Gets or sets the column span.")
  public Integer getColSpan() {
    return colSpan;
  }

  public void setColSpan(Integer colSpan) {
    this.colSpan = colSpan;
  }

  public Cell rowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

   /**
   * Gets or sets the row span.
   * @return rowSpan
  **/
  @ApiModelProperty(value = "Gets or sets the row span.")
  public Integer getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
  }

  public Cell width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the column width.
   * @return width
  **/
  @ApiModelProperty(value = "Gets or sets the column width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Cell htmlFragment(String htmlFragment) {
    this.htmlFragment = htmlFragment;
    return this;
  }

   /**
   * Gets or sets Html fragment.
   * @return htmlFragment
  **/
  @ApiModelProperty(value = "Gets or sets Html fragment.")
  public String getHtmlFragment() {
    return htmlFragment;
  }

  public void setHtmlFragment(String htmlFragment) {
    this.htmlFragment = htmlFragment;
  }

  public Cell images(List<ImageFragment> images) {
    this.images = images;
    return this;
  }

  public Cell addImagesItem(ImageFragment imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageFragment>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Gets or sets ImageFragment list.
   * @return images
  **/
  @ApiModelProperty(value = "Gets or sets ImageFragment list.")
  public List<ImageFragment> getImages() {
    return images;
  }

  public void setImages(List<ImageFragment> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cell cell = (Cell) o;
    return Objects.equals(this.isNoBorder, cell.isNoBorder) &&
        Objects.equals(this.margin, cell.margin) &&
        Objects.equals(this.border, cell.border) &&
        Objects.equals(this.backgroundColor, cell.backgroundColor) &&
        Objects.equals(this.backgroundImageFile, cell.backgroundImageFile) &&
        Objects.equals(this.backgroundImageStorageFile, cell.backgroundImageStorageFile) &&
        Objects.equals(this.alignment, cell.alignment) &&
        Objects.equals(this.defaultCellTextState, cell.defaultCellTextState) &&
        Objects.equals(this.paragraphs, cell.paragraphs) &&
        Objects.equals(this.isWordWrapped, cell.isWordWrapped) &&
        Objects.equals(this.verticalAlignment, cell.verticalAlignment) &&
        Objects.equals(this.colSpan, cell.colSpan) &&
        Objects.equals(this.rowSpan, cell.rowSpan) &&
        Objects.equals(this.width, cell.width) &&
        Objects.equals(this.htmlFragment, cell.htmlFragment) &&
        Objects.equals(this.images, cell.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isNoBorder, margin, border, backgroundColor, backgroundImageFile, backgroundImageStorageFile, alignment, defaultCellTextState, paragraphs, isWordWrapped, verticalAlignment, colSpan, rowSpan, width, htmlFragment, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cell {\n");
    
    sb.append("    isNoBorder: ").append(toIndentedString(isNoBorder)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    backgroundImageFile: ").append(toIndentedString(backgroundImageFile)).append("\n");
    sb.append("    backgroundImageStorageFile: ").append(toIndentedString(backgroundImageStorageFile)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    defaultCellTextState: ").append(toIndentedString(defaultCellTextState)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    isWordWrapped: ").append(toIndentedString(isWordWrapped)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
    sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    htmlFragment: ").append(toIndentedString(htmlFragment)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

