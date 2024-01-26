/**
 *
 * Copyright (c) 2024 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
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
 * Provides annotation.
 */
@ApiModel(description = "Provides annotation.")

public class Annotation extends LinkElement {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Contents")
  private String contents = null;

  @SerializedName("Modified")
  private String modified = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Flags")
  private List<AnnotationFlags> flags = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Rect")
  private Rectangle rect = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("ZIndex")
  private Integer zindex = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  public Annotation color(Color color) {
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

  public Annotation contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get the annotation content.
   * @return contents
  **/
  @ApiModelProperty(value = "Get the annotation content.")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public Annotation modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time when the annotation was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time when the annotation was last modified.")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public Annotation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Gets ID of the annotation.
   * @return id
  **/
  @ApiModelProperty(value = "Gets ID of the annotation.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Annotation flags(List<AnnotationFlags> flags) {
    this.flags = flags;
    return this;
  }

  public Annotation addFlagsItem(AnnotationFlags flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<AnnotationFlags>();
    }
    this.flags.add(flagsItem);
    return this;
  }

   /**
   * Gets Flags of the annotation.
   * @return flags
  **/
  @ApiModelProperty(value = "Gets Flags of the annotation.")
  public List<AnnotationFlags> getFlags() {
    return flags;
  }

  public void setFlags(List<AnnotationFlags> flags) {
    this.flags = flags;
  }

  public Annotation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets Name of the annotation.
   * @return name
  **/
  @ApiModelProperty(value = "Gets Name of the annotation.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Annotation rect(Rectangle rect) {
    this.rect = rect;
    return this;
  }

   /**
   * Gets Rect of the annotation.
   * @return rect
  **/
  @ApiModelProperty(required = true, value = "Gets Rect of the annotation.")
  public Rectangle getRect() {
    return rect;
  }

  public void setRect(Rectangle rect) {
    this.rect = rect;
  }

  public Annotation pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Gets PageIndex of the annotation.
   * @return pageIndex
  **/
  @ApiModelProperty(value = "Gets PageIndex of the annotation.")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Annotation zindex(Integer zindex) {
    this.zindex = zindex;
    return this;
  }

   /**
   * Gets ZIndex of the annotation.
   * @return zindex
  **/
  @ApiModelProperty(value = "Gets ZIndex of the annotation.")
  public Integer getZindex() {
    return zindex;
  }

  public void setZindex(Integer zindex) {
    this.zindex = zindex;
  }

  public Annotation horizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets HorizontalAlignment of the annotation.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets HorizontalAlignment of the annotation.")
  public HorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public Annotation verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets VerticalAlignment of the annotation.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets VerticalAlignment of the annotation.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.color, annotation.color) &&
        Objects.equals(this.contents, annotation.contents) &&
        Objects.equals(this.modified, annotation.modified) &&
        Objects.equals(this.id, annotation.id) &&
        Objects.equals(this.flags, annotation.flags) &&
        Objects.equals(this.name, annotation.name) &&
        Objects.equals(this.rect, annotation.rect) &&
        Objects.equals(this.pageIndex, annotation.pageIndex) &&
        Objects.equals(this.zindex, annotation.zindex) &&
        Objects.equals(this.horizontalAlignment, annotation.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, annotation.verticalAlignment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, contents, modified, id, flags, name, rect, pageIndex, zindex, horizontalAlignment, verticalAlignment, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    zindex: ").append(toIndentedString(zindex)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
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

