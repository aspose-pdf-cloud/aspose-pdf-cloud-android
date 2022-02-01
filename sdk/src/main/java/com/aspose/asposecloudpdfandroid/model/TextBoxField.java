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
import java.util.List;

/**
 * Provides TextBoxField.
 */
@ApiModel(description = "Provides TextBoxField.")

public class TextBoxField extends FormField {
  @SerializedName("Multiline")
  private Boolean multiline = null;

  @SerializedName("SpellCheck")
  private Boolean spellCheck = null;

  @SerializedName("Scrollable")
  private Boolean scrollable = null;

  @SerializedName("ForceCombs")
  private Boolean forceCombs = null;

  @SerializedName("MaxLen")
  private Integer maxLen = null;

  @SerializedName("Barcode")
  private String barcode = null;

  public TextBoxField multiline(Boolean multiline) {
    this.multiline = multiline;
    return this;
  }

   /**
   * Gets or sets multiline flag of the field. If Multiline is true field can contain multiple lines of text.
   * @return multiline
  **/
  @ApiModelProperty(value = "Gets or sets multiline flag of the field. If Multiline is true field can contain multiple lines of text.")
  public Boolean isMultiline() {
    return multiline;
  }

  public void setMultiline(Boolean multiline) {
    this.multiline = multiline;
  }

  public TextBoxField spellCheck(Boolean spellCheck) {
    this.spellCheck = spellCheck;
    return this;
  }

   /**
   * Gets or sets spellcheck flag for field. If true field shall be spell checked.
   * @return spellCheck
  **/
  @ApiModelProperty(value = "Gets or sets spellcheck flag for field. If true field shall be spell checked.")
  public Boolean isSpellCheck() {
    return spellCheck;
  }

  public void setSpellCheck(Boolean spellCheck) {
    this.spellCheck = spellCheck;
  }

  public TextBoxField scrollable(Boolean scrollable) {
    this.scrollable = scrollable;
    return this;
  }

   /**
   * Gets or sets scrollable flag of field. If true field can be scrolled.
   * @return scrollable
  **/
  @ApiModelProperty(value = "Gets or sets scrollable flag of field. If true field can be scrolled.")
  public Boolean isScrollable() {
    return scrollable;
  }

  public void setScrollable(Boolean scrollable) {
    this.scrollable = scrollable;
  }

  public TextBoxField forceCombs(Boolean forceCombs) {
    this.forceCombs = forceCombs;
    return this;
  }

   /**
   * Gets or sets flag which indicates is field divided into spaced positions.
   * @return forceCombs
  **/
  @ApiModelProperty(value = "Gets or sets flag which indicates is field divided into spaced positions.")
  public Boolean isForceCombs() {
    return forceCombs;
  }

  public void setForceCombs(Boolean forceCombs) {
    this.forceCombs = forceCombs;
  }

  public TextBoxField maxLen(Integer maxLen) {
    this.maxLen = maxLen;
    return this;
  }

   /**
   * Gets or sets maximum length of text in the field.
   * @return maxLen
  **/
  @ApiModelProperty(value = "Gets or sets maximum length of text in the field.")
  public Integer getMaxLen() {
    return maxLen;
  }

  public void setMaxLen(Integer maxLen) {
    this.maxLen = maxLen;
  }

  public TextBoxField barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Adds barcode 128 into the field. Field value will be changed onto the code and field become read only.
   * @return barcode
  **/
  @ApiModelProperty(value = "Adds barcode 128 into the field. Field value will be changed onto the code and field become read only.")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBoxField textBoxField = (TextBoxField) o;
    return Objects.equals(this.multiline, textBoxField.multiline) &&
        Objects.equals(this.spellCheck, textBoxField.spellCheck) &&
        Objects.equals(this.scrollable, textBoxField.scrollable) &&
        Objects.equals(this.forceCombs, textBoxField.forceCombs) &&
        Objects.equals(this.maxLen, textBoxField.maxLen) &&
        Objects.equals(this.barcode, textBoxField.barcode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiline, spellCheck, scrollable, forceCombs, maxLen, barcode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBoxField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    multiline: ").append(toIndentedString(multiline)).append("\n");
    sb.append("    spellCheck: ").append(toIndentedString(spellCheck)).append("\n");
    sb.append("    scrollable: ").append(toIndentedString(scrollable)).append("\n");
    sb.append("    forceCombs: ").append(toIndentedString(forceCombs)).append("\n");
    sb.append("    maxLen: ").append(toIndentedString(maxLen)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
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

