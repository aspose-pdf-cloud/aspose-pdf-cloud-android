/**
 *
 * Copyright (c) 2022 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Rotation;
import com.aspose.asposecloudpdfandroid.model.StampType;
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

/**
 * Represents Pdf stamps.
 */
@ApiModel(description = "Represents Pdf stamps.")

public class Stamp {
  @SerializedName("Type")
  private StampType type = null;

  @SerializedName("Background")
  private Boolean background = null;

  @SerializedName("BottomMargin")
  private Double bottomMargin = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("LeftMargin")
  private Double leftMargin = null;

  @SerializedName("Opacity")
  private Double opacity = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  @SerializedName("Rotate")
  private Rotation rotate = null;

  @SerializedName("RotateAngle")
  private Double rotateAngle = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("XIndent")
  private Double xindent = null;

  @SerializedName("YIndent")
  private Double yindent = null;

  @SerializedName("Zoom")
  private Double zoom = null;

  @SerializedName("TextAlignment")
  private HorizontalAlignment textAlignment = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("TextState")
  private TextState textState = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("Height")
  private Double height = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("StartingNumber")
  private Integer startingNumber = null;

  public Stamp type(StampType type) {
    this.type = type;
    return this;
  }

   /**
   * Gets the stamp type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Gets the stamp type.")
  public StampType getType() {
    return type;
  }

  public void setType(StampType type) {
    this.type = type;
  }

  public Stamp background(Boolean background) {
    this.background = background;
    return this;
  }

   /**
   * Sets or gets a bool value that indicates the content is stamped as background. If the value is true, the stamp content is layed at the bottom. By defalt, the value is false, the stamp content is layed at the top.
   * @return background
  **/
  @ApiModelProperty(value = "Sets or gets a bool value that indicates the content is stamped as background. If the value is true, the stamp content is layed at the bottom. By defalt, the value is false, the stamp content is layed at the top.")
  public Boolean isBackground() {
    return background;
  }

  public void setBackground(Boolean background) {
    this.background = background;
  }

  public Stamp bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Gets or sets bottom margin of stamp.
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "Gets or sets bottom margin of stamp.")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }

  public Stamp horizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets or sets Horizontal alignment of stamp on the page. 
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets Horizontal alignment of stamp on the page. ")
  public HorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public Stamp leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Gets or sets left margin of stamp.
   * @return leftMargin
  **/
  @ApiModelProperty(value = "Gets or sets left margin of stamp.")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public Stamp opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets a value to indicate the stamp opacity. The value is from 0.0 to 1.0. By default the value is 1.0.
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets a value to indicate the stamp opacity. The value is from 0.0 to 1.0. By default the value is 1.0.")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public Stamp rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Gets or sets right margin of stamp.
   * @return rightMargin
  **/
  @ApiModelProperty(value = "Gets or sets right margin of stamp.")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }

  public Stamp rotate(Rotation rotate) {
    this.rotate = rotate;
    return this;
  }

   /**
   * Sets or gets the rotation of stamp content according Rotation values. Note. This property is for set angles which are multiples of 90 degrees (0, 90, 180, 270 degrees). To set arbitrary angle use RotateAngle property.  If angle set by ArbitraryAngle is not multiple of 90 then Rotate property returns Rotation.None.
   * @return rotate
  **/
  @ApiModelProperty(value = "Sets or gets the rotation of stamp content according Rotation values. Note. This property is for set angles which are multiples of 90 degrees (0, 90, 180, 270 degrees). To set arbitrary angle use RotateAngle property.  If angle set by ArbitraryAngle is not multiple of 90 then Rotate property returns Rotation.None.")
  public Rotation getRotate() {
    return rotate;
  }

  public void setRotate(Rotation rotate) {
    this.rotate = rotate;
  }

  public Stamp rotateAngle(Double rotateAngle) {
    this.rotateAngle = rotateAngle;
    return this;
  }

   /**
   * Gets or sets rotate angle of stamp in degrees. This property allows to set arbitrary rotate angle. 
   * @return rotateAngle
  **/
  @ApiModelProperty(value = "Gets or sets rotate angle of stamp in degrees. This property allows to set arbitrary rotate angle. ")
  public Double getRotateAngle() {
    return rotateAngle;
  }

  public void setRotateAngle(Double rotateAngle) {
    this.rotateAngle = rotateAngle;
  }

  public Stamp topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Gets or sets top margin of stamp.
   * @return topMargin
  **/
  @ApiModelProperty(value = "Gets or sets top margin of stamp.")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public Stamp verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets or sets vertical alignment of stamp on page.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets vertical alignment of stamp on page.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public Stamp xindent(Double xindent) {
    this.xindent = xindent;
    return this;
  }

   /**
   * Horizontal stamp coordinate, starting from the left.
   * @return xindent
  **/
  @ApiModelProperty(value = "Horizontal stamp coordinate, starting from the left.")
  public Double getXindent() {
    return xindent;
  }

  public void setXindent(Double xindent) {
    this.xindent = xindent;
  }

  public Stamp yindent(Double yindent) {
    this.yindent = yindent;
    return this;
  }

   /**
   * Vertical stamp coordinate, starting from the bottom.
   * @return yindent
  **/
  @ApiModelProperty(value = "Vertical stamp coordinate, starting from the bottom.")
  public Double getYindent() {
    return yindent;
  }

  public void setYindent(Double yindent) {
    this.yindent = yindent;
  }

  public Stamp zoom(Double zoom) {
    this.zoom = zoom;
    return this;
  }

   /**
   * Zooming factor of the stamp. Allows to scale stamp.
   * @return zoom
  **/
  @ApiModelProperty(value = "Zooming factor of the stamp. Allows to scale stamp.")
  public Double getZoom() {
    return zoom;
  }

  public void setZoom(Double zoom) {
    this.zoom = zoom;
  }

  public Stamp textAlignment(HorizontalAlignment textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

   /**
   * Alignment of the text inside the stamp.
   * @return textAlignment
  **/
  @ApiModelProperty(value = "Alignment of the text inside the stamp.")
  public HorizontalAlignment getTextAlignment() {
    return textAlignment;
  }

  public void setTextAlignment(HorizontalAlignment textAlignment) {
    this.textAlignment = textAlignment;
  }

  public Stamp value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Gets or sets string value which is used as stamp on the page.
   * @return value
  **/
  @ApiModelProperty(value = "Gets or sets string value which is used as stamp on the page.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Stamp textState(TextState textState) {
    this.textState = textState;
    return this;
  }

   /**
   * Gets text properties of the stamp. See TextState for details.
   * @return textState
  **/
  @ApiModelProperty(value = "Gets text properties of the stamp. See TextState for details.")
  public TextState getTextState() {
    return textState;
  }

  public void setTextState(TextState textState) {
    this.textState = textState;
  }

  public Stamp fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Gets or sets the file name.
   * @return fileName
  **/
  @ApiModelProperty(value = "Gets or sets the file name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Stamp width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets image width. Setting this property allos to scal image horizontally.
   * @return width
  **/
  @ApiModelProperty(value = "Gets or sets image width. Setting this property allos to scal image horizontally.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Stamp height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets image height. Setting this image allows to scale image vertically.
   * @return height
  **/
  @ApiModelProperty(value = "Gets or sets image height. Setting this image allows to scale image vertically.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Stamp pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Gets or sets the index of the page.
   * @return pageIndex
  **/
  @ApiModelProperty(value = "Gets or sets the index of the page.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Stamp startingNumber(Integer startingNumber) {
    this.startingNumber = startingNumber;
    return this;
  }

   /**
   * Gets or sets value of the number of starting page. Other pages will be numbered starting from this value.
   * @return startingNumber
  **/
  @ApiModelProperty(value = "Gets or sets value of the number of starting page. Other pages will be numbered starting from this value.")
  public Integer getStartingNumber() {
    return startingNumber;
  }

  public void setStartingNumber(Integer startingNumber) {
    this.startingNumber = startingNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stamp stamp = (Stamp) o;
    return Objects.equals(this.type, stamp.type) &&
        Objects.equals(this.background, stamp.background) &&
        Objects.equals(this.bottomMargin, stamp.bottomMargin) &&
        Objects.equals(this.horizontalAlignment, stamp.horizontalAlignment) &&
        Objects.equals(this.leftMargin, stamp.leftMargin) &&
        Objects.equals(this.opacity, stamp.opacity) &&
        Objects.equals(this.rightMargin, stamp.rightMargin) &&
        Objects.equals(this.rotate, stamp.rotate) &&
        Objects.equals(this.rotateAngle, stamp.rotateAngle) &&
        Objects.equals(this.topMargin, stamp.topMargin) &&
        Objects.equals(this.verticalAlignment, stamp.verticalAlignment) &&
        Objects.equals(this.xindent, stamp.xindent) &&
        Objects.equals(this.yindent, stamp.yindent) &&
        Objects.equals(this.zoom, stamp.zoom) &&
        Objects.equals(this.textAlignment, stamp.textAlignment) &&
        Objects.equals(this.value, stamp.value) &&
        Objects.equals(this.textState, stamp.textState) &&
        Objects.equals(this.fileName, stamp.fileName) &&
        Objects.equals(this.width, stamp.width) &&
        Objects.equals(this.height, stamp.height) &&
        Objects.equals(this.pageIndex, stamp.pageIndex) &&
        Objects.equals(this.startingNumber, stamp.startingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, background, bottomMargin, horizontalAlignment, leftMargin, opacity, rightMargin, rotate, rotateAngle, topMargin, verticalAlignment, xindent, yindent, zoom, textAlignment, value, textState, fileName, width, height, pageIndex, startingNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stamp {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    rotateAngle: ").append(toIndentedString(rotateAngle)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    xindent: ").append(toIndentedString(xindent)).append("\n");
    sb.append("    yindent: ").append(toIndentedString(yindent)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
    sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    textState: ").append(toIndentedString(textState)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    startingNumber: ").append(toIndentedString(startingNumber)).append("\n");
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

