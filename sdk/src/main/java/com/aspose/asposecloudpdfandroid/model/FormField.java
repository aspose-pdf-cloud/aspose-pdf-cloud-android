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
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.FormField;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
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
 * Provides form field.
 */
@ApiModel(description = "Provides form field.")

public class FormField extends LinkElement {
  @SerializedName("PartialName")
  private String partialName = null;

  @SerializedName("FullName")
  private String fullName = null;

  @SerializedName("Rect")
  private Rectangle rect = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("Height")
  private Double height = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("ZIndex")
  private Integer zindex = null;

  @SerializedName("IsGroup")
  private Boolean isGroup = null;

  @SerializedName("Parent")
  private FormField parent = null;

  @SerializedName("IsSharedField")
  private Boolean isSharedField = null;

  @SerializedName("Flags")
  private List<AnnotationFlags> flags = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Contents")
  private String contents = null;

  @SerializedName("Margin")
  private MarginInfo margin = null;

  @SerializedName("Highlighting")
  private LinkHighlightingMode highlighting = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("Border")
  private Border border = null;

  public FormField partialName(String partialName) {
    this.partialName = partialName;
    return this;
  }

   /**
   * Field name.
   * @return partialName
  **/
  @ApiModelProperty(value = "Field name.")
  public String getPartialName() {
    return partialName;
  }

  public void setPartialName(String partialName) {
    this.partialName = partialName;
  }

  public FormField fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full Field name.
   * @return fullName
  **/
  @ApiModelProperty(value = "Full Field name.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public FormField rect(Rectangle rect) {
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

  public FormField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Field value.
   * @return value
  **/
  @ApiModelProperty(value = "Field value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FormField pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Page index.
   * @return pageIndex
  **/
  @ApiModelProperty(required = true, value = "Page index.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public FormField height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets height of the field.
   * @return height
  **/
  @ApiModelProperty(value = "Gets or sets height of the field.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public FormField width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets width of the field.
   * @return width
  **/
  @ApiModelProperty(value = "Gets or sets width of the field.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public FormField zindex(Integer zindex) {
    this.zindex = zindex;
    return this;
  }

   /**
   * Z index.
   * @return zindex
  **/
  @ApiModelProperty(value = "Z index.")
  public Integer getZindex() {
    return zindex;
  }

  public void setZindex(Integer zindex) {
    this.zindex = zindex;
  }

  public FormField isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

   /**
   * Is group.
   * @return isGroup
  **/
  @ApiModelProperty(value = "Is group.")
  public Boolean isIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public FormField parent(FormField parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Gets field parent.
   * @return parent
  **/
  @ApiModelProperty(value = "Gets field parent.")
  public FormField getParent() {
    return parent;
  }

  public void setParent(FormField parent) {
    this.parent = parent;
  }

  public FormField isSharedField(Boolean isSharedField) {
    this.isSharedField = isSharedField;
    return this;
  }

   /**
   * Property for Generator support. Used when field is added to header or footer. If true, this field will created once and it&#39;s appearance will be visible on all pages of the document. If false, separated field will be created for every document page.
   * @return isSharedField
  **/
  @ApiModelProperty(value = "Property for Generator support. Used when field is added to header or footer. If true, this field will created once and it's appearance will be visible on all pages of the document. If false, separated field will be created for every document page.")
  public Boolean isIsSharedField() {
    return isSharedField;
  }

  public void setIsSharedField(Boolean isSharedField) {
    this.isSharedField = isSharedField;
  }

  public FormField flags(List<AnnotationFlags> flags) {
    this.flags = flags;
    return this;
  }

  public FormField addFlagsItem(AnnotationFlags flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<AnnotationFlags>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Gets Flags of the field.
   * @return flags
  **/
  @ApiModelProperty(value = "Gets Flags of the field.")
  public List<AnnotationFlags> getFlags() {
    return flags;
  }

  public void setFlags(List<AnnotationFlags> flags) {
    this.flags = flags;
  }

  public FormField color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Color of the annotation.
   * @return color
  **/
  @ApiModelProperty(value = "Color of the annotation.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public FormField contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get the field content.
   * @return contents
  **/
  @ApiModelProperty(value = "Get the field content.")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public FormField margin(MarginInfo margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Gets or sets a outer margin for paragraph (for pdf generation)
   * @return margin
  **/
  @ApiModelProperty(value = "Gets or sets a outer margin for paragraph (for pdf generation)")
  public MarginInfo getMargin() {
    return margin;
  }

  public void setMargin(MarginInfo margin) {
    this.margin = margin;
  }

  public FormField highlighting(LinkHighlightingMode highlighting) {
    this.highlighting = highlighting;
    return this;
  }

   /**
   * Field highlighting mode.
   * @return highlighting
  **/
  @ApiModelProperty(value = "Field highlighting mode.")
  public LinkHighlightingMode getHighlighting() {
    return highlighting;
  }

  public void setHighlighting(LinkHighlightingMode highlighting) {
    this.highlighting = highlighting;
  }

  public FormField horizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets HorizontalAlignment of the field.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets HorizontalAlignment of the field.")
  public HorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public FormField verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets VerticalAlignment of the field.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets VerticalAlignment of the field.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public FormField border(Border border) {
    this.border = border;
    return this;
  }

   /**
   * Gets or sets annotation border characteristics.
   * @return border
  **/
  @ApiModelProperty(value = "Gets or sets annotation border characteristics.")
  public Border getBorder() {
    return border;
  }

  public void setBorder(Border border) {
    this.border = border;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormField formField = (FormField) o;
    return Objects.equals(this.partialName, formField.partialName) &&
        Objects.equals(this.fullName, formField.fullName) &&
        Objects.equals(this.rect, formField.rect) &&
        Objects.equals(this.value, formField.value) &&
        Objects.equals(this.pageIndex, formField.pageIndex) &&
        Objects.equals(this.height, formField.height) &&
        Objects.equals(this.width, formField.width) &&
        Objects.equals(this.zindex, formField.zindex) &&
        Objects.equals(this.isGroup, formField.isGroup) &&
        Objects.equals(this.parent, formField.parent) &&
        Objects.equals(this.isSharedField, formField.isSharedField) &&
        Objects.equals(this.flags, formField.flags) &&
        Objects.equals(this.color, formField.color) &&
        Objects.equals(this.contents, formField.contents) &&
        Objects.equals(this.margin, formField.margin) &&
        Objects.equals(this.highlighting, formField.highlighting) &&
        Objects.equals(this.horizontalAlignment, formField.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, formField.verticalAlignment) &&
        Objects.equals(this.border, formField.border) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partialName, fullName, rect, value, pageIndex, height, width, zindex, isGroup, parent, isSharedField, flags, color, contents, margin, highlighting, horizontalAlignment, verticalAlignment, border, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    partialName: ").append(toIndentedString(partialName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    zindex: ").append(toIndentedString(zindex)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    isSharedField: ").append(toIndentedString(isSharedField)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    highlighting: ").append(toIndentedString(highlighting)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
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

