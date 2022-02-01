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
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
import com.aspose.asposecloudpdfandroid.model.Rotation;
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
 * Represents Pdf stamps.
 */
@ApiModel(description = "Represents Pdf stamps.")

public class StampBase extends LinkElement {
  @SerializedName("Background")
  private Boolean background = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("Opacity")
  private Double opacity = null;

  @SerializedName("Rotate")
  private Rotation rotate = null;

  @SerializedName("RotateAngle")
  private Double rotateAngle = null;

  @SerializedName("XIndent")
  private Double xindent = null;

  @SerializedName("YIndent")
  private Double yindent = null;

  @SerializedName("Zoom")
  private Double zoom = null;

  public StampBase background(Boolean background) {
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

  public StampBase horizontalAlignment(HorizontalAlignment horizontalAlignment) {
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

  public StampBase opacity(Double opacity) {
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

  public StampBase rotate(Rotation rotate) {
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

  public StampBase rotateAngle(Double rotateAngle) {
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

  public StampBase xindent(Double xindent) {
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

  public StampBase yindent(Double yindent) {
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

  public StampBase zoom(Double zoom) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampBase stampBase = (StampBase) o;
    return Objects.equals(this.background, stampBase.background) &&
        Objects.equals(this.horizontalAlignment, stampBase.horizontalAlignment) &&
        Objects.equals(this.opacity, stampBase.opacity) &&
        Objects.equals(this.rotate, stampBase.rotate) &&
        Objects.equals(this.rotateAngle, stampBase.rotateAngle) &&
        Objects.equals(this.xindent, stampBase.xindent) &&
        Objects.equals(this.yindent, stampBase.yindent) &&
        Objects.equals(this.zoom, stampBase.zoom) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background, horizontalAlignment, opacity, rotate, rotateAngle, xindent, yindent, zoom, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
    sb.append("    rotateAngle: ").append(toIndentedString(rotateAngle)).append("\n");
    sb.append("    xindent: ").append(toIndentedString(xindent)).append("\n");
    sb.append("    yindent: ").append(toIndentedString(yindent)).append("\n");
    sb.append("    zoom: ").append(toIndentedString(zoom)).append("\n");
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

