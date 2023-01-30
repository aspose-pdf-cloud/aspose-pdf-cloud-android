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
import com.aspose.asposecloudpdfandroid.model.AnnotationState;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.TextIcon;
import com.aspose.asposecloudpdfandroid.model.VerticalAlignment;
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
 * Provides TextAnnotation.
 */
@ApiModel(description = "Provides TextAnnotation.")

public class TextAnnotation extends MarkupAnnotation {
  @SerializedName("State")
  private AnnotationState state = null;

  @SerializedName("Open")
  private Boolean open = null;

  @SerializedName("Icon")
  private TextIcon icon = null;

  public TextAnnotation state(AnnotationState state) {
    this.state = state;
    return this;
  }

   /**
   * Gets or sets the state to which the original annotation should be set.
   * @return state
  **/
  @ApiModelProperty(value = "Gets or sets the state to which the original annotation should be set.")
  public AnnotationState getState() {
    return state;
  }

  public void setState(AnnotationState state) {
    this.state = state;
  }

  public TextAnnotation open(Boolean open) {
    this.open = open;
    return this;
  }

   /**
   * Gets or sets is the annotation open.
   * @return open
  **/
  @ApiModelProperty(value = "Gets or sets is the annotation open.")
  public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public TextAnnotation icon(TextIcon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Gets or sets an icon to be used in displaying the annotation.
   * @return icon
  **/
  @ApiModelProperty(value = "Gets or sets an icon to be used in displaying the annotation.")
  public TextIcon getIcon() {
    return icon;
  }

  public void setIcon(TextIcon icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAnnotation textAnnotation = (TextAnnotation) o;
    return Objects.equals(this.state, textAnnotation.state) &&
        Objects.equals(this.open, textAnnotation.open) &&
        Objects.equals(this.icon, textAnnotation.icon) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, open, icon, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

