/**
 *
 *   Copyright (c) 2020 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdfandroid.model.Bookmarks;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.LinkElement;
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
 * Provides link to bookmark.
 */
@ApiModel(description = "Provides link to bookmark.")

public class Bookmark extends LinkElement {
  @SerializedName("Title")
  private String title = null;

  @SerializedName("Italic")
  private Boolean italic = null;

  @SerializedName("Bold")
  private Boolean bold = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Level")
  private Integer level = null;

  @SerializedName("Destination")
  private String destination = null;

  @SerializedName("PageDisplay")
  private String pageDisplay = null;

  @SerializedName("PageDisplay_Bottom")
  private Integer pageDisplayBottom = null;

  @SerializedName("PageDisplay_Left")
  private Integer pageDisplayLeft = null;

  @SerializedName("PageDisplay_Right")
  private Integer pageDisplayRight = null;

  @SerializedName("PageDisplay_Top")
  private Integer pageDisplayTop = null;

  @SerializedName("PageDisplay_Zoom")
  private Integer pageDisplayZoom = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("RemoteFile")
  private String remoteFile = null;

  @SerializedName("Bookmarks")
  private Bookmarks bookmarks = null;

  public Bookmark title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get the Title;
   * @return title
  **/
  @ApiModelProperty(value = "Get the Title;")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Bookmark italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * Is bookmark italic.
   * @return italic
  **/
  @ApiModelProperty(value = "Is bookmark italic.")
  public Boolean isItalic() {
    return italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public Bookmark bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * Is bookmark bold.
   * @return bold
  **/
  @ApiModelProperty(value = "Is bookmark bold.")
  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public Bookmark color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Get the color
   * @return color
  **/
  @ApiModelProperty(value = "Get the color")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Bookmark action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Gets or sets the action bound with the bookmark. If PageNumber is presented the action can not be specified. The action type includes: \&quot;GoTo\&quot;, \&quot;GoToR\&quot;, \&quot;Launch\&quot;, \&quot;Named\&quot;.
   * @return action
  **/
  @ApiModelProperty(value = "Gets or sets the action bound with the bookmark. If PageNumber is presented the action can not be specified. The action type includes: \"GoTo\", \"GoToR\", \"Launch\", \"Named\".")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Bookmark level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Gets or sets bookmark&#39;s hierarchy level.
   * @return level
  **/
  @ApiModelProperty(value = "Gets or sets bookmark's hierarchy level.")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Bookmark destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Gets or sets bookmark&#39;s destination page. Required if action is set as string.Empty.
   * @return destination
  **/
  @ApiModelProperty(value = "Gets or sets bookmark's destination page. Required if action is set as string.Empty.")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Bookmark pageDisplay(String pageDisplay) {
    this.pageDisplay = pageDisplay;
    return this;
  }

   /**
   * Gets or sets the type of display bookmark&#39;s destination page.
   * @return pageDisplay
  **/
  @ApiModelProperty(value = "Gets or sets the type of display bookmark's destination page.")
  public String getPageDisplay() {
    return pageDisplay;
  }

  public void setPageDisplay(String pageDisplay) {
    this.pageDisplay = pageDisplay;
  }

  public Bookmark pageDisplayBottom(Integer pageDisplayBottom) {
    this.pageDisplayBottom = pageDisplayBottom;
    return this;
  }

   /**
   * Gets or sets the bottom coordinate of page display.
   * @return pageDisplayBottom
  **/
  @ApiModelProperty(value = "Gets or sets the bottom coordinate of page display.")
  public Integer getPageDisplayBottom() {
    return pageDisplayBottom;
  }

  public void setPageDisplayBottom(Integer pageDisplayBottom) {
    this.pageDisplayBottom = pageDisplayBottom;
  }

  public Bookmark pageDisplayLeft(Integer pageDisplayLeft) {
    this.pageDisplayLeft = pageDisplayLeft;
    return this;
  }

   /**
   * Gets or sets the left coordinate of page display.
   * @return pageDisplayLeft
  **/
  @ApiModelProperty(value = "Gets or sets the left coordinate of page display.")
  public Integer getPageDisplayLeft() {
    return pageDisplayLeft;
  }

  public void setPageDisplayLeft(Integer pageDisplayLeft) {
    this.pageDisplayLeft = pageDisplayLeft;
  }

  public Bookmark pageDisplayRight(Integer pageDisplayRight) {
    this.pageDisplayRight = pageDisplayRight;
    return this;
  }

   /**
   * Gets or sets the right coordinate of page display.
   * @return pageDisplayRight
  **/
  @ApiModelProperty(value = "Gets or sets the right coordinate of page display.")
  public Integer getPageDisplayRight() {
    return pageDisplayRight;
  }

  public void setPageDisplayRight(Integer pageDisplayRight) {
    this.pageDisplayRight = pageDisplayRight;
  }

  public Bookmark pageDisplayTop(Integer pageDisplayTop) {
    this.pageDisplayTop = pageDisplayTop;
    return this;
  }

   /**
   * Gets or sets the top coordinate of page display.
   * @return pageDisplayTop
  **/
  @ApiModelProperty(value = "Gets or sets the top coordinate of page display.")
  public Integer getPageDisplayTop() {
    return pageDisplayTop;
  }

  public void setPageDisplayTop(Integer pageDisplayTop) {
    this.pageDisplayTop = pageDisplayTop;
  }

  public Bookmark pageDisplayZoom(Integer pageDisplayZoom) {
    this.pageDisplayZoom = pageDisplayZoom;
    return this;
  }

   /**
   * Gets or sets the zoom factor of page display.
   * @return pageDisplayZoom
  **/
  @ApiModelProperty(value = "Gets or sets the zoom factor of page display.")
  public Integer getPageDisplayZoom() {
    return pageDisplayZoom;
  }

  public void setPageDisplayZoom(Integer pageDisplayZoom) {
    this.pageDisplayZoom = pageDisplayZoom;
  }

  public Bookmark pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Gets or sets the number of bookmark&#39;s destination page. 
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Gets or sets the number of bookmark's destination page. ")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Bookmark remoteFile(String remoteFile) {
    this.remoteFile = remoteFile;
    return this;
  }

   /**
   * Gets or sets the file (path) which is required for \&quot;GoToR\&quot; action of bookmark.
   * @return remoteFile
  **/
  @ApiModelProperty(value = "Gets or sets the file (path) which is required for \"GoToR\" action of bookmark.")
  public String getRemoteFile() {
    return remoteFile;
  }

  public void setRemoteFile(String remoteFile) {
    this.remoteFile = remoteFile;
  }

  public Bookmark bookmarks(Bookmarks bookmarks) {
    this.bookmarks = bookmarks;
    return this;
  }

   /**
   * The children bookmarks.
   * @return bookmarks
  **/
  @ApiModelProperty(value = "The children bookmarks.")
  public Bookmarks getBookmarks() {
    return bookmarks;
  }

  public void setBookmarks(Bookmarks bookmarks) {
    this.bookmarks = bookmarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bookmark bookmark = (Bookmark) o;
    return Objects.equals(this.title, bookmark.title) &&
        Objects.equals(this.italic, bookmark.italic) &&
        Objects.equals(this.bold, bookmark.bold) &&
        Objects.equals(this.color, bookmark.color) &&
        Objects.equals(this.action, bookmark.action) &&
        Objects.equals(this.level, bookmark.level) &&
        Objects.equals(this.destination, bookmark.destination) &&
        Objects.equals(this.pageDisplay, bookmark.pageDisplay) &&
        Objects.equals(this.pageDisplayBottom, bookmark.pageDisplayBottom) &&
        Objects.equals(this.pageDisplayLeft, bookmark.pageDisplayLeft) &&
        Objects.equals(this.pageDisplayRight, bookmark.pageDisplayRight) &&
        Objects.equals(this.pageDisplayTop, bookmark.pageDisplayTop) &&
        Objects.equals(this.pageDisplayZoom, bookmark.pageDisplayZoom) &&
        Objects.equals(this.pageNumber, bookmark.pageNumber) &&
        Objects.equals(this.remoteFile, bookmark.remoteFile) &&
        Objects.equals(this.bookmarks, bookmark.bookmarks) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, italic, bold, color, action, level, destination, pageDisplay, pageDisplayBottom, pageDisplayLeft, pageDisplayRight, pageDisplayTop, pageDisplayZoom, pageNumber, remoteFile, bookmarks, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bookmark {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    pageDisplay: ").append(toIndentedString(pageDisplay)).append("\n");
    sb.append("    pageDisplayBottom: ").append(toIndentedString(pageDisplayBottom)).append("\n");
    sb.append("    pageDisplayLeft: ").append(toIndentedString(pageDisplayLeft)).append("\n");
    sb.append("    pageDisplayRight: ").append(toIndentedString(pageDisplayRight)).append("\n");
    sb.append("    pageDisplayTop: ").append(toIndentedString(pageDisplayTop)).append("\n");
    sb.append("    pageDisplayZoom: ").append(toIndentedString(pageDisplayZoom)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    remoteFile: ").append(toIndentedString(remoteFile)).append("\n");
    sb.append("    bookmarks: ").append(toIndentedString(bookmarks)).append("\n");
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

