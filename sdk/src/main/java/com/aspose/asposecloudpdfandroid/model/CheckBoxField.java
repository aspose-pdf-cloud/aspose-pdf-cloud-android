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
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.FormField;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkHighlightingMode;
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
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
 * Provides CheckBoxField.
 */
@ApiModel(description = "Provides CheckBoxField.")

public class CheckBoxField extends FormField {
  @SerializedName("AllowedStates")
  private List<String> allowedStates = null;

  @SerializedName("Style")
  private BoxStyle style = null;

  @SerializedName("ActiveState")
  private String activeState = null;

  @SerializedName("Checked")
  private Boolean checked = null;

  @SerializedName("ExportValue")
  private String exportValue = null;

  public CheckBoxField allowedStates(List<String> allowedStates) {
    this.allowedStates = allowedStates;
    return this;
  }

  public CheckBoxField addAllowedStatesItem(String allowedStatesItem) {
    if (this.allowedStates == null) {
      this.allowedStates = new ArrayList<String>();
    }
    this.allowedStates.add(allowedStatesItem);
    return this;
  }

   /**
   * Returns list of allowed states.
   * @return allowedStates
  **/
  @ApiModelProperty(value = "Returns list of allowed states.")
  public List<String> getAllowedStates() {
    return allowedStates;
  }

  public void setAllowedStates(List<String> allowedStates) {
    this.allowedStates = allowedStates;
  }

  public CheckBoxField style(BoxStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Gets or sets style of check box.
   * @return style
  **/
  @ApiModelProperty(value = "Gets or sets style of check box.")
  public BoxStyle getStyle() {
    return style;
  }

  public void setStyle(BoxStyle style) {
    this.style = style;
  }

  public CheckBoxField activeState(String activeState) {
    this.activeState = activeState;
    return this;
  }

   /**
   * Gets or sets current annotation appearance state.
   * @return activeState
  **/
  @ApiModelProperty(value = "Gets or sets current annotation appearance state.")
  public String getActiveState() {
    return activeState;
  }

  public void setActiveState(String activeState) {
    this.activeState = activeState;
  }

  public CheckBoxField checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Gets or sets state of check box.
   * @return checked
  **/
  @ApiModelProperty(required = true, value = "Gets or sets state of check box.")
  public Boolean isChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }

  public CheckBoxField exportValue(String exportValue) {
    this.exportValue = exportValue;
    return this;
  }

   /**
   * Gets or sets export value of CheckBox field.
   * @return exportValue
  **/
  @ApiModelProperty(value = "Gets or sets export value of CheckBox field.")
  public String getExportValue() {
    return exportValue;
  }

  public void setExportValue(String exportValue) {
    this.exportValue = exportValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckBoxField checkBoxField = (CheckBoxField) o;
    return Objects.equals(this.allowedStates, checkBoxField.allowedStates) &&
        Objects.equals(this.style, checkBoxField.style) &&
        Objects.equals(this.activeState, checkBoxField.activeState) &&
        Objects.equals(this.checked, checkBoxField.checked) &&
        Objects.equals(this.exportValue, checkBoxField.exportValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedStates, style, activeState, checked, exportValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckBoxField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowedStates: ").append(toIndentedString(allowedStates)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    activeState: ").append(toIndentedString(activeState)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    exportValue: ").append(toIndentedString(exportValue)).append("\n");
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

