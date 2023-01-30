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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Border;
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
 * Provides ListBoxField.
 */
@ApiModel(description = "Provides ListBoxField.")

public class ListBoxField extends ChoiceField {
  @SerializedName("Options")
  private List<Option> options = null;

  @SerializedName("ActiveState")
  private String activeState = null;

  @SerializedName("TopIndex")
  private Integer topIndex = null;

  @SerializedName("SelectedItems")
  private List<Integer> selectedItems = null;

  public ListBoxField options(List<Option> options) {
    this.options = options;
    return this;
  }

  public ListBoxField addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Option>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Gets collection of options of the listbox.
   * @return options
  **/
  @ApiModelProperty(value = "Gets collection of options of the listbox.")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public ListBoxField activeState(String activeState) {
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

  public ListBoxField topIndex(Integer topIndex) {
    this.topIndex = topIndex;
    return this;
  }

   /**
   * Gets or sets index of the top visible element of the list.
   * @return topIndex
  **/
  @ApiModelProperty(value = "Gets or sets index of the top visible element of the list.")
  public Integer getTopIndex() {
    return topIndex;
  }

  public void setTopIndex(Integer topIndex) {
    this.topIndex = topIndex;
  }

  public ListBoxField selectedItems(List<Integer> selectedItems) {
    this.selectedItems = selectedItems;
    return this;
  }

  public ListBoxField addSelectedItemsItem(Integer selectedItemsItem) {
    if (this.selectedItems == null) {
      this.selectedItems = new ArrayList<Integer>();
    }
    this.selectedItems.add(selectedItemsItem);
    return this;
  }

   /**
   * Gets or sets array of the selected items in the multiselect list. For single-select list returns array with single item.
   * @return selectedItems
  **/
  @ApiModelProperty(value = "Gets or sets array of the selected items in the multiselect list. For single-select list returns array with single item.")
  public List<Integer> getSelectedItems() {
    return selectedItems;
  }

  public void setSelectedItems(List<Integer> selectedItems) {
    this.selectedItems = selectedItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBoxField listBoxField = (ListBoxField) o;
    return Objects.equals(this.options, listBoxField.options) &&
        Objects.equals(this.activeState, listBoxField.activeState) &&
        Objects.equals(this.topIndex, listBoxField.topIndex) &&
        Objects.equals(this.selectedItems, listBoxField.selectedItems) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, activeState, topIndex, selectedItems, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBoxField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    activeState: ").append(toIndentedString(activeState)).append("\n");
    sb.append("    topIndex: ").append(toIndentedString(topIndex)).append("\n");
    sb.append("    selectedItems: ").append(toIndentedString(selectedItems)).append("\n");
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

