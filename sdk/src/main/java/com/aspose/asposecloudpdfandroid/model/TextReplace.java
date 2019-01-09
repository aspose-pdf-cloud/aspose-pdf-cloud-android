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
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.TextState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Single text replacement setting.
 */
@ApiModel(description = "Single text replacement setting.")

public class TextReplace {
  @SerializedName("OldValue")
  private String oldValue = null;

  @SerializedName("NewValue")
  private String newValue = null;

  @SerializedName("Regex")
  private Boolean regex = null;

  @SerializedName("TextState")
  private TextState textState = null;

  @SerializedName("Rect")
  private Rectangle rect = null;

  public TextReplace oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Original text.
   * @return oldValue
  **/
  @ApiModelProperty(required = true, value = "Original text.")
  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public TextReplace newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * New text.
   * @return newValue
  **/
  @ApiModelProperty(required = true, value = "New text.")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public TextReplace regex(Boolean regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Gets or sets a value indicating whether search text is regular expression.
   * @return regex
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether search text is regular expression.")
  public Boolean isRegex() {
    return regex;
  }

  public void setRegex(Boolean regex) {
    this.regex = regex;
  }

  public TextReplace textState(TextState textState) {
    this.textState = textState;
    return this;
  }

   /**
   * Text properties of a new text.
   * @return textState
  **/
  @ApiModelProperty(value = "Text properties of a new text.")
  public TextState getTextState() {
    return textState;
  }

  public void setTextState(TextState textState) {
    this.textState = textState;
  }

  public TextReplace rect(Rectangle rect) {
    this.rect = rect;
    return this;
  }

   /**
   * Rectangle area where searched original text.
   * @return rect
  **/
  @ApiModelProperty(value = "Rectangle area where searched original text.")
  public Rectangle getRect() {
    return rect;
  }

  public void setRect(Rectangle rect) {
    this.rect = rect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextReplace textReplace = (TextReplace) o;
    return Objects.equals(this.oldValue, textReplace.oldValue) &&
        Objects.equals(this.newValue, textReplace.newValue) &&
        Objects.equals(this.regex, textReplace.regex) &&
        Objects.equals(this.textState, textReplace.textState) &&
        Objects.equals(this.rect, textReplace.rect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue, regex, textState, rect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextReplace {\n");
    
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    textState: ").append(toIndentedString(textState)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
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

