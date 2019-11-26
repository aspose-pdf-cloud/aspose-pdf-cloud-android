/**
 *
 *   Copyright (c) 2019 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.ChoiceField;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.FormField;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkHighlightingMode;
import com.aspose.asposecloudpdfandroid.model.MarginInfo;
import com.aspose.asposecloudpdfandroid.model.Option;
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
 * Provides ComboBoxField.
 */
@ApiModel(description = "Provides ComboBoxField.")

public class ComboBoxField extends ChoiceField {
  @SerializedName("Options")
  private List<Option> options = null;

  @SerializedName("ActiveState")
  private String activeState = null;

  @SerializedName("Editable")
  private Boolean editable = null;

  @SerializedName("SpellCheck")
  private Boolean spellCheck = null;

  @SerializedName("Selected")
  private Integer selected = null;

  public ComboBoxField options(List<Option> options) {
    this.options = options;
    return this;
  }

  public ComboBoxField addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Option>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Gets collection of options of the combobox.
   * @return options
  **/
  @ApiModelProperty(value = "Gets collection of options of the combobox.")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public ComboBoxField activeState(String activeState) {
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

  public ComboBoxField editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Gets or sets editable status of the field.
   * @return editable
  **/
  @ApiModelProperty(value = "Gets or sets editable status of the field.")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public ComboBoxField spellCheck(Boolean spellCheck) {
    this.spellCheck = spellCheck;
    return this;
  }

   /**
   * Gets or sets spellchaeck activiity status.
   * @return spellCheck
  **/
  @ApiModelProperty(value = "Gets or sets spellchaeck activiity status.")
  public Boolean isSpellCheck() {
    return spellCheck;
  }

  public void setSpellCheck(Boolean spellCheck) {
    this.spellCheck = spellCheck;
  }

  public ComboBoxField selected(Integer selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Gets or sets index of selected item. Numbering of items is started from 1.
   * @return selected
  **/
  @ApiModelProperty(required = true, value = "Gets or sets index of selected item. Numbering of items is started from 1.")
  public Integer getSelected() {
    return selected;
  }

  public void setSelected(Integer selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComboBoxField comboBoxField = (ComboBoxField) o;
    return Objects.equals(this.options, comboBoxField.options) &&
        Objects.equals(this.activeState, comboBoxField.activeState) &&
        Objects.equals(this.editable, comboBoxField.editable) &&
        Objects.equals(this.spellCheck, comboBoxField.spellCheck) &&
        Objects.equals(this.selected, comboBoxField.selected) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, activeState, editable, spellCheck, selected, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComboBoxField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    activeState: ").append(toIndentedString(activeState)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    spellCheck: ").append(toIndentedString(spellCheck)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

