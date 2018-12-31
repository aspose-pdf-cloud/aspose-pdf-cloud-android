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
import com.aspose.asposecloudpdfandroid.model.FieldType;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
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
 * Represents form field.
 */
@ApiModel(description = "Represents form field.")

public class Field extends LinkElement {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("SelectedItems")
  private List<Integer> selectedItems = null;

  @SerializedName("Type")
  private FieldType type = null;

  @SerializedName("Rect")
  private Rectangle rect = null;

  @SerializedName("Values")
  private List<String> values = null;

  public Field name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Field name.
   * @return name
  **/
  @ApiModelProperty(value = "Field name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field selectedItems(List<Integer> selectedItems) {
    this.selectedItems = selectedItems;
    return this;
  }

  public Field addSelectedItemsItem(Integer selectedItemsItem) {
    if (this.selectedItems == null) {
      this.selectedItems = new ArrayList<Integer>();
    }
    this.selectedItems.add(selectedItemsItem);
    return this;
  }

   /**
   * Selected items.
   * @return selectedItems
  **/
  @ApiModelProperty(value = "Selected items.")
  public List<Integer> getSelectedItems() {
    return selectedItems;
  }

  public void setSelectedItems(List<Integer> selectedItems) {
    this.selectedItems = selectedItems;
  }

  public Field type(FieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Field type.
   * @return type
  **/
  @ApiModelProperty(value = "Field type.")
  public FieldType getType() {
    return type;
  }

  public void setType(FieldType type) {
    this.type = type;
  }

  public Field rect(Rectangle rect) {
    this.rect = rect;
    return this;
  }

   /**
   * Field rectangle.
   * @return rect
  **/
  @ApiModelProperty(value = "Field rectangle.")
  public Rectangle getRect() {
    return rect;
  }

  public void setRect(Rectangle rect) {
    this.rect = rect;
  }

  public Field values(List<String> values) {
    this.values = values;
    return this;
  }

  public Field addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Field values.
   * @return values
  **/
  @ApiModelProperty(value = "Field values.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.name, field.name) &&
        Objects.equals(this.selectedItems, field.selectedItems) &&
        Objects.equals(this.type, field.type) &&
        Objects.equals(this.rect, field.rect) &&
        Objects.equals(this.values, field.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, selectedItems, type, rect, values, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectedItems: ").append(toIndentedString(selectedItems)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

