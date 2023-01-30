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
import com.aspose.asposecloudpdfandroid.model.BorderEffect;
import com.aspose.asposecloudpdfandroid.model.BorderStyle;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.Dash;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class representing characteristics of annotation border.
 */
@ApiModel(description = "Class representing characteristics of annotation border.")

public class Border {
  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("EffectIntensity")
  private Integer effectIntensity = null;

  @SerializedName("Style")
  private BorderStyle style = null;

  @SerializedName("Effect")
  private BorderEffect effect = null;

  @SerializedName("Dash")
  private Dash dash = null;

  @SerializedName("Color")
  private Color color = null;

  public Border width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets border width.
   * @return width
  **/
  @ApiModelProperty(value = "Gets or sets border width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Border effectIntensity(Integer effectIntensity) {
    this.effectIntensity = effectIntensity;
    return this;
  }

   /**
   * Gets or sets effect intencity. Valid range of value is [0..2].
   * @return effectIntensity
  **/
  @ApiModelProperty(value = "Gets or sets effect intencity. Valid range of value is [0..2].")
  public Integer getEffectIntensity() {
    return effectIntensity;
  }

  public void setEffectIntensity(Integer effectIntensity) {
    this.effectIntensity = effectIntensity;
  }

  public Border style(BorderStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Gets or sets border style.
   * @return style
  **/
  @ApiModelProperty(value = "Gets or sets border style.")
  public BorderStyle getStyle() {
    return style;
  }

  public void setStyle(BorderStyle style) {
    this.style = style;
  }

  public Border effect(BorderEffect effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Gets or sets border effect.
   * @return effect
  **/
  @ApiModelProperty(value = "Gets or sets border effect.")
  public BorderEffect getEffect() {
    return effect;
  }

  public void setEffect(BorderEffect effect) {
    this.effect = effect;
  }

  public Border dash(Dash dash) {
    this.dash = dash;
    return this;
  }

   /**
   * Gets or sets dash pattern.
   * @return dash
  **/
  @ApiModelProperty(value = "Gets or sets dash pattern.")
  public Dash getDash() {
    return dash;
  }

  public void setDash(Dash dash) {
    this.dash = dash;
  }

  public Border color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets border color.
   * @return color
  **/
  @ApiModelProperty(value = "Gets or sets border color.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Border border = (Border) o;
    return Objects.equals(this.width, border.width) &&
        Objects.equals(this.effectIntensity, border.effectIntensity) &&
        Objects.equals(this.style, border.style) &&
        Objects.equals(this.effect, border.effect) &&
        Objects.equals(this.dash, border.dash) &&
        Objects.equals(this.color, border.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, effectIntensity, style, effect, dash, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Border {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    effectIntensity: ").append(toIndentedString(effectIntensity)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    dash: ").append(toIndentedString(dash)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

