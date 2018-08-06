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
import com.aspose.asposecloudpdfandroid.model.ColorDepth;
import com.aspose.asposecloudpdfandroid.model.CompressionType;
import com.aspose.asposecloudpdfandroid.model.ShapeType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Used for tiff export options setting.
 */
@ApiModel(description = "Used for tiff export options setting.")

public class TiffExportOptions {
  @SerializedName("Brightness")
  private Double brightness = null;

  @SerializedName("Compression")
  private CompressionType compression = null;

  @SerializedName("ColorDepth")
  private ColorDepth colorDepth = null;

  @SerializedName("LeftMargin")
  private Integer leftMargin = null;

  @SerializedName("RightMargin")
  private Integer rightMargin = null;

  @SerializedName("TopMargin")
  private Integer topMargin = null;

  @SerializedName("BottomMargin")
  private Integer bottomMargin = null;

  @SerializedName("Orientation")
  private ShapeType orientation = null;

  @SerializedName("SkipBlankPages")
  private Boolean skipBlankPages = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("XResolution")
  private Integer xresolution = null;

  @SerializedName("YResolution")
  private Integer yresolution = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("ResultFile")
  private String resultFile = null;

  public TiffExportOptions brightness(Double brightness) {
    this.brightness = brightness;
    return this;
  }

   /**
   * Image brightness.
   * @return brightness
  **/
  @ApiModelProperty(value = "Image brightness.")
  public Double getBrightness() {
    return brightness;
  }

  public void setBrightness(Double brightness) {
    this.brightness = brightness;
  }

  public TiffExportOptions compression(CompressionType compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None.
   * @return compression
  **/
  @ApiModelProperty(value = "Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None.")
  public CompressionType getCompression() {
    return compression;
  }

  public void setCompression(CompressionType compression) {
    this.compression = compression;
  }

  public TiffExportOptions colorDepth(ColorDepth colorDepth) {
    this.colorDepth = colorDepth;
    return this;
  }

   /**
   * Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp.
   * @return colorDepth
  **/
  @ApiModelProperty(value = "Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp.")
  public ColorDepth getColorDepth() {
    return colorDepth;
  }

  public void setColorDepth(ColorDepth colorDepth) {
    this.colorDepth = colorDepth;
  }

  public TiffExportOptions leftMargin(Integer leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Left image margin.
   * @return leftMargin
  **/
  @ApiModelProperty(value = "Left image margin.")
  public Integer getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Integer leftMargin) {
    this.leftMargin = leftMargin;
  }

  public TiffExportOptions rightMargin(Integer rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Right image margin.
   * @return rightMargin
  **/
  @ApiModelProperty(value = "Right image margin.")
  public Integer getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Integer rightMargin) {
    this.rightMargin = rightMargin;
  }

  public TiffExportOptions topMargin(Integer topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Top image margin.
   * @return topMargin
  **/
  @ApiModelProperty(value = "Top image margin.")
  public Integer getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Integer topMargin) {
    this.topMargin = topMargin;
  }

  public TiffExportOptions bottomMargin(Integer bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Bottom image margin.
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "Bottom image margin.")
  public Integer getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Integer bottomMargin) {
    this.bottomMargin = bottomMargin;
  }

  public TiffExportOptions orientation(ShapeType orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Image orientation. Possible values are: None, Landscape, Portait.
   * @return orientation
  **/
  @ApiModelProperty(value = "Image orientation. Possible values are: None, Landscape, Portait.")
  public ShapeType getOrientation() {
    return orientation;
  }

  public void setOrientation(ShapeType orientation) {
    this.orientation = orientation;
  }

  public TiffExportOptions skipBlankPages(Boolean skipBlankPages) {
    this.skipBlankPages = skipBlankPages;
    return this;
  }

   /**
   * Skip blank pages flag.
   * @return skipBlankPages
  **/
  @ApiModelProperty(value = "Skip blank pages flag.")
  public Boolean isSkipBlankPages() {
    return skipBlankPages;
  }

  public void setSkipBlankPages(Boolean skipBlankPages) {
    this.skipBlankPages = skipBlankPages;
  }

  public TiffExportOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Image width.
   * @return width
  **/
  @ApiModelProperty(value = "Image width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TiffExportOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Image height.
   * @return height
  **/
  @ApiModelProperty(value = "Image height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TiffExportOptions xresolution(Integer xresolution) {
    this.xresolution = xresolution;
    return this;
  }

   /**
   * Horizontal resolution.
   * @return xresolution
  **/
  @ApiModelProperty(value = "Horizontal resolution.")
  public Integer getXresolution() {
    return xresolution;
  }

  public void setXresolution(Integer xresolution) {
    this.xresolution = xresolution;
  }

  public TiffExportOptions yresolution(Integer yresolution) {
    this.yresolution = yresolution;
    return this;
  }

   /**
   * Vertical resolution.
   * @return yresolution
  **/
  @ApiModelProperty(value = "Vertical resolution.")
  public Integer getYresolution() {
    return yresolution;
  }

  public void setYresolution(Integer yresolution) {
    this.yresolution = yresolution;
  }

  public TiffExportOptions pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Start page to export.
   * @return pageIndex
  **/
  @ApiModelProperty(value = "Start page to export.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public TiffExportOptions pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Number of pages to export.
   * @return pageCount
  **/
  @ApiModelProperty(value = "Number of pages to export.")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public TiffExportOptions resultFile(String resultFile) {
    this.resultFile = resultFile;
    return this;
  }

   /**
   * Resulting image file.
   * @return resultFile
  **/
  @ApiModelProperty(value = "Resulting image file.")
  public String getResultFile() {
    return resultFile;
  }

  public void setResultFile(String resultFile) {
    this.resultFile = resultFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiffExportOptions tiffExportOptions = (TiffExportOptions) o;
    return Objects.equals(this.brightness, tiffExportOptions.brightness) &&
        Objects.equals(this.compression, tiffExportOptions.compression) &&
        Objects.equals(this.colorDepth, tiffExportOptions.colorDepth) &&
        Objects.equals(this.leftMargin, tiffExportOptions.leftMargin) &&
        Objects.equals(this.rightMargin, tiffExportOptions.rightMargin) &&
        Objects.equals(this.topMargin, tiffExportOptions.topMargin) &&
        Objects.equals(this.bottomMargin, tiffExportOptions.bottomMargin) &&
        Objects.equals(this.orientation, tiffExportOptions.orientation) &&
        Objects.equals(this.skipBlankPages, tiffExportOptions.skipBlankPages) &&
        Objects.equals(this.width, tiffExportOptions.width) &&
        Objects.equals(this.height, tiffExportOptions.height) &&
        Objects.equals(this.xresolution, tiffExportOptions.xresolution) &&
        Objects.equals(this.yresolution, tiffExportOptions.yresolution) &&
        Objects.equals(this.pageIndex, tiffExportOptions.pageIndex) &&
        Objects.equals(this.pageCount, tiffExportOptions.pageCount) &&
        Objects.equals(this.resultFile, tiffExportOptions.resultFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xresolution, yresolution, pageIndex, pageCount, resultFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffExportOptions {\n");
    
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    colorDepth: ").append(toIndentedString(colorDepth)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    skipBlankPages: ").append(toIndentedString(skipBlankPages)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    xresolution: ").append(toIndentedString(xresolution)).append("\n");
    sb.append("    yresolution: ").append(toIndentedString(yresolution)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    resultFile: ").append(toIndentedString(resultFile)).append("\n");
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

