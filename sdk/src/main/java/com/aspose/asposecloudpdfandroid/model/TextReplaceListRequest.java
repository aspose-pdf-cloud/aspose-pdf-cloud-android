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
import com.aspose.asposecloudpdfandroid.model.TextReplace;
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
 * Multiple text replacements request.
 */
@ApiModel(description = "Multiple text replacements request.")

public class TextReplaceListRequest {
  @SerializedName("TextReplaces")
  private List<TextReplace> textReplaces = new ArrayList<TextReplace>();

  @SerializedName("DefaultFont")
  private String defaultFont = null;

  @SerializedName("StartIndex")
  private Integer startIndex = null;

  @SerializedName("CountReplace")
  private Integer countReplace = null;

  public TextReplaceListRequest textReplaces(List<TextReplace> textReplaces) {
    this.textReplaces = textReplaces;
    return this;
  }

  public TextReplaceListRequest addTextReplacesItem(TextReplace textReplacesItem) {
    this.textReplaces.add(textReplacesItem);
    return this;
  }

   /**
   * A list of text replacement settings.
   * @return textReplaces
  **/
  @ApiModelProperty(required = true, value = "A list of text replacement settings.")
  public List<TextReplace> getTextReplaces() {
    return textReplaces;
  }

  public void setTextReplaces(List<TextReplace> textReplaces) {
    this.textReplaces = textReplaces;
  }

  public TextReplaceListRequest defaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
    return this;
  }

   /**
   * Get defaultFont
   * @return defaultFont
  **/
  @ApiModelProperty(value = "")
  public String getDefaultFont() {
    return defaultFont;
  }

  public void setDefaultFont(String defaultFont) {
    this.defaultFont = defaultFont;
  }

  public TextReplaceListRequest startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public TextReplaceListRequest countReplace(Integer countReplace) {
    this.countReplace = countReplace;
    return this;
  }

   /**
   * Get countReplace
   * @return countReplace
  **/
  @ApiModelProperty(value = "")
  public Integer getCountReplace() {
    return countReplace;
  }

  public void setCountReplace(Integer countReplace) {
    this.countReplace = countReplace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextReplaceListRequest textReplaceListRequest = (TextReplaceListRequest) o;
    return Objects.equals(this.textReplaces, textReplaceListRequest.textReplaces) &&
        Objects.equals(this.defaultFont, textReplaceListRequest.defaultFont) &&
        Objects.equals(this.startIndex, textReplaceListRequest.startIndex) &&
        Objects.equals(this.countReplace, textReplaceListRequest.countReplace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textReplaces, defaultFont, startIndex, countReplace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextReplaceListRequest {\n");
    
    sb.append("    textReplaces: ").append(toIndentedString(textReplaces)).append("\n");
    sb.append("    defaultFont: ").append(toIndentedString(defaultFont)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    countReplace: ").append(toIndentedString(countReplace)).append("\n");
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

