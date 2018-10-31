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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.CaptionPosition;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.LineEnding;
import com.aspose.asposecloudpdfandroid.model.LineIntent;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Point;
import com.aspose.asposecloudpdfandroid.model.RectanglePdf;
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
 * Provides LineAnnotation.
 */
@ApiModel(description = "Provides LineAnnotation.")

public class LineAnnotation extends MarkupAnnotation {
  @SerializedName("Starting")
  private Point starting = null;

  @SerializedName("StartingStyle")
  private LineEnding startingStyle = null;

  @SerializedName("Ending")
  private Point ending = null;

  @SerializedName("EndingStyle")
  private LineEnding endingStyle = null;

  @SerializedName("InteriorColor")
  private Color interiorColor = null;

  @SerializedName("LeaderLine")
  private Double leaderLine = null;

  @SerializedName("LeaderLineExtension")
  private Double leaderLineExtension = null;

  @SerializedName("LeaderLineOffset")
  private Double leaderLineOffset = null;

  @SerializedName("ShowCaption")
  private Boolean showCaption = null;

  @SerializedName("CaptionOffset")
  private Point captionOffset = null;

  @SerializedName("CaptionPosition")
  private CaptionPosition captionPosition = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("Intent")
  private LineIntent intent = null;

  public LineAnnotation starting(Point starting) {
    this.starting = starting;
    return this;
  }

   /**
   * Gets or sets starting point of line.
   * @return starting
  **/
  @ApiModelProperty(value = "Gets or sets starting point of line.")
  public Point getStarting() {
    return starting;
  }

  public void setStarting(Point starting) {
    this.starting = starting;
  }

  public LineAnnotation startingStyle(LineEnding startingStyle) {
    this.startingStyle = startingStyle;
    return this;
  }

   /**
   * Gets or sets line ending style for line starting point.
   * @return startingStyle
  **/
  @ApiModelProperty(value = "Gets or sets line ending style for line starting point.")
  public LineEnding getStartingStyle() {
    return startingStyle;
  }

  public void setStartingStyle(LineEnding startingStyle) {
    this.startingStyle = startingStyle;
  }

  public LineAnnotation ending(Point ending) {
    this.ending = ending;
    return this;
  }

   /**
   * Gets or sets ending point of line.
   * @return ending
  **/
  @ApiModelProperty(value = "Gets or sets ending point of line.")
  public Point getEnding() {
    return ending;
  }

  public void setEnding(Point ending) {
    this.ending = ending;
  }

  public LineAnnotation endingStyle(LineEnding endingStyle) {
    this.endingStyle = endingStyle;
    return this;
  }

   /**
   * Gets or sets ending style for end point of line.
   * @return endingStyle
  **/
  @ApiModelProperty(value = "Gets or sets ending style for end point of line.")
  public LineEnding getEndingStyle() {
    return endingStyle;
  }

  public void setEndingStyle(LineEnding endingStyle) {
    this.endingStyle = endingStyle;
  }

  public LineAnnotation interiorColor(Color interiorColor) {
    this.interiorColor = interiorColor;
    return this;
  }

   /**
   * Gets or sets interior color of the annotation.
   * @return interiorColor
  **/
  @ApiModelProperty(value = "Gets or sets interior color of the annotation.")
  public Color getInteriorColor() {
    return interiorColor;
  }

  public void setInteriorColor(Color interiorColor) {
    this.interiorColor = interiorColor;
  }

  public LineAnnotation leaderLine(Double leaderLine) {
    this.leaderLine = leaderLine;
    return this;
  }

   /**
   * Gets or sets leader line length.
   * @return leaderLine
  **/
  @ApiModelProperty(value = "Gets or sets leader line length.")
  public Double getLeaderLine() {
    return leaderLine;
  }

  public void setLeaderLine(Double leaderLine) {
    this.leaderLine = leaderLine;
  }

  public LineAnnotation leaderLineExtension(Double leaderLineExtension) {
    this.leaderLineExtension = leaderLineExtension;
    return this;
  }

   /**
   * Gets or sets length of leader line extension.
   * @return leaderLineExtension
  **/
  @ApiModelProperty(value = "Gets or sets length of leader line extension.")
  public Double getLeaderLineExtension() {
    return leaderLineExtension;
  }

  public void setLeaderLineExtension(Double leaderLineExtension) {
    this.leaderLineExtension = leaderLineExtension;
  }

  public LineAnnotation leaderLineOffset(Double leaderLineOffset) {
    this.leaderLineOffset = leaderLineOffset;
    return this;
  }

   /**
   * Gets or sets leader line offset.
   * @return leaderLineOffset
  **/
  @ApiModelProperty(value = "Gets or sets leader line offset.")
  public Double getLeaderLineOffset() {
    return leaderLineOffset;
  }

  public void setLeaderLineOffset(Double leaderLineOffset) {
    this.leaderLineOffset = leaderLineOffset;
  }

  public LineAnnotation showCaption(Boolean showCaption) {
    this.showCaption = showCaption;
    return this;
  }

   /**
   * Gets or sets boolean flag which determinies is contents must be shown as caption.
   * @return showCaption
  **/
  @ApiModelProperty(value = "Gets or sets boolean flag which determinies is contents must be shown as caption.")
  public Boolean isShowCaption() {
    return showCaption;
  }

  public void setShowCaption(Boolean showCaption) {
    this.showCaption = showCaption;
  }

  public LineAnnotation captionOffset(Point captionOffset) {
    this.captionOffset = captionOffset;
    return this;
  }

   /**
   * Gets or sets caption text offset from its normal position.
   * @return captionOffset
  **/
  @ApiModelProperty(value = "Gets or sets caption text offset from its normal position.")
  public Point getCaptionOffset() {
    return captionOffset;
  }

  public void setCaptionOffset(Point captionOffset) {
    this.captionOffset = captionOffset;
  }

  public LineAnnotation captionPosition(CaptionPosition captionPosition) {
    this.captionPosition = captionPosition;
    return this;
  }

   /**
   * Gets or sets annotation caption position.
   * @return captionPosition
  **/
  @ApiModelProperty(value = "Gets or sets annotation caption position.")
  public CaptionPosition getCaptionPosition() {
    return captionPosition;
  }

  public void setCaptionPosition(CaptionPosition captionPosition) {
    this.captionPosition = captionPosition;
  }

  public LineAnnotation color(Color color) {
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

  public LineAnnotation intent(LineIntent intent) {
    this.intent = intent;
    return this;
  }

   /**
   * Gets or sets the intent of the line annotation.
   * @return intent
  **/
  @ApiModelProperty(value = "Gets or sets the intent of the line annotation.")
  public LineIntent getIntent() {
    return intent;
  }

  public void setIntent(LineIntent intent) {
    this.intent = intent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineAnnotation lineAnnotation = (LineAnnotation) o;
    return Objects.equals(this.starting, lineAnnotation.starting) &&
        Objects.equals(this.startingStyle, lineAnnotation.startingStyle) &&
        Objects.equals(this.ending, lineAnnotation.ending) &&
        Objects.equals(this.endingStyle, lineAnnotation.endingStyle) &&
        Objects.equals(this.interiorColor, lineAnnotation.interiorColor) &&
        Objects.equals(this.leaderLine, lineAnnotation.leaderLine) &&
        Objects.equals(this.leaderLineExtension, lineAnnotation.leaderLineExtension) &&
        Objects.equals(this.leaderLineOffset, lineAnnotation.leaderLineOffset) &&
        Objects.equals(this.showCaption, lineAnnotation.showCaption) &&
        Objects.equals(this.captionOffset, lineAnnotation.captionOffset) &&
        Objects.equals(this.captionPosition, lineAnnotation.captionPosition) &&
        Objects.equals(this.color, lineAnnotation.color) &&
        Objects.equals(this.intent, lineAnnotation.intent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starting, startingStyle, ending, endingStyle, interiorColor, leaderLine, leaderLineExtension, leaderLineOffset, showCaption, captionOffset, captionPosition, color, intent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    starting: ").append(toIndentedString(starting)).append("\n");
    sb.append("    startingStyle: ").append(toIndentedString(startingStyle)).append("\n");
    sb.append("    ending: ").append(toIndentedString(ending)).append("\n");
    sb.append("    endingStyle: ").append(toIndentedString(endingStyle)).append("\n");
    sb.append("    interiorColor: ").append(toIndentedString(interiorColor)).append("\n");
    sb.append("    leaderLine: ").append(toIndentedString(leaderLine)).append("\n");
    sb.append("    leaderLineExtension: ").append(toIndentedString(leaderLineExtension)).append("\n");
    sb.append("    leaderLineOffset: ").append(toIndentedString(leaderLineOffset)).append("\n");
    sb.append("    showCaption: ").append(toIndentedString(showCaption)).append("\n");
    sb.append("    captionOffset: ").append(toIndentedString(captionOffset)).append("\n");
    sb.append("    captionPosition: ").append(toIndentedString(captionPosition)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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

