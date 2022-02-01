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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Border;
import com.aspose.asposecloudpdfandroid.model.BoxStyle;
import com.aspose.asposecloudpdfandroid.model.ChoiceField;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.FormField;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkHighlightingMode;
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
import com.aspose.asposecloudpdfandroid.model.Option;
import com.aspose.asposecloudpdfandroid.model.RadioButtonOptionField;
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
 * Provides RadioButtonField.
 */
@ApiModel(description = "Provides RadioButtonField.")

public class RadioButtonField extends ChoiceField {
  @SerializedName("Options")
  private List<Option> options = null;

  @SerializedName("RadioButtonOptionsField")
  private List<RadioButtonOptionField> radioButtonOptionsField = null;

  @SerializedName("Style")
  private BoxStyle style = null;

  public RadioButtonField options(List<Option> options) {
    this.options = options;
    return this;
  }

  public RadioButtonField addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Option>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Gets collection of options of the radio button.
   * @return options
  **/
  @ApiModelProperty(value = "Gets collection of options of the radio button.")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public RadioButtonField radioButtonOptionsField(List<RadioButtonOptionField> radioButtonOptionsField) {
    this.radioButtonOptionsField = radioButtonOptionsField;
    return this;
  }

  public RadioButtonField addRadioButtonOptionsFieldItem(RadioButtonOptionField radioButtonOptionsFieldItem) {
    if (this.radioButtonOptionsField == null) {
      this.radioButtonOptionsField = new ArrayList<RadioButtonOptionField>();
    }
    this.radioButtonOptionsField.add(radioButtonOptionsFieldItem);
    return this;
  }

   /**
   * Gets collection of radio button options field.
   * @return radioButtonOptionsField
  **/
  @ApiModelProperty(value = "Gets collection of radio button options field.")
  public List<RadioButtonOptionField> getRadioButtonOptionsField() {
    return radioButtonOptionsField;
  }

  public void setRadioButtonOptionsField(List<RadioButtonOptionField> radioButtonOptionsField) {
    this.radioButtonOptionsField = radioButtonOptionsField;
  }

  public RadioButtonField style(BoxStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Style of field box.
   * @return style
  **/
  @ApiModelProperty(value = "Style of field box.")
  public BoxStyle getStyle() {
    return style;
  }

  public void setStyle(BoxStyle style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadioButtonField radioButtonField = (RadioButtonField) o;
    return Objects.equals(this.options, radioButtonField.options) &&
        Objects.equals(this.radioButtonOptionsField, radioButtonField.radioButtonOptionsField) &&
        Objects.equals(this.style, radioButtonField.style) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, radioButtonOptionsField, style, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadioButtonField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    radioButtonOptionsField: ").append(toIndentedString(radioButtonOptionsField)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

