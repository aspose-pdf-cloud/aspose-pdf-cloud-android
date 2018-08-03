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
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
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
 * Represents text format DTO.
 */
@ApiModel(description = "Represents text format DTO.")

public class TextFormat extends LinkElement {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("FontSize")
  private Double fontSize = null;

  @SerializedName("FontName")
  private String fontName = null;

  public TextFormat color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public TextFormat fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Get fontSize
   * @return fontSize
  **/
  @ApiModelProperty(value = "")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public TextFormat fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Get fontName
   * @return fontName
  **/
  @ApiModelProperty(value = "")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFormat textFormat = (TextFormat) o;
    return Objects.equals(this.color, textFormat.color) &&
        Objects.equals(this.fontSize, textFormat.fontSize) &&
        Objects.equals(this.fontName, textFormat.fontName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, fontSize, fontName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFormat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
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

