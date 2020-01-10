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
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.Color;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Link;
import com.aspose.asposecloudpdfandroid.model.MarkupAnnotation;
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.SoundEncoding;
import com.aspose.asposecloudpdfandroid.model.SoundIcon;
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
 * Provides SoundAnnotation.
 */
@ApiModel(description = "Provides SoundAnnotation.")

public class SoundAnnotation extends MarkupAnnotation {
  @SerializedName("FilePath")
  private String filePath = null;

  @SerializedName("Icon")
  private SoundIcon icon = null;

  @SerializedName("Rate")
  private Integer rate = null;

  @SerializedName("Channels")
  private Integer channels = null;

  @SerializedName("Bits")
  private Integer bits = null;

  @SerializedName("Encoding")
  private SoundEncoding encoding = null;

  public SoundAnnotation filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * A sound file path defining the sound to be played when the annotation is activated.
   * @return filePath
  **/
  @ApiModelProperty(required = true, value = "A sound file path defining the sound to be played when the annotation is activated.")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public SoundAnnotation icon(SoundIcon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Gets or sets an icon to be used in displaying the annotation.
   * @return icon
  **/
  @ApiModelProperty(value = "Gets or sets an icon to be used in displaying the annotation.")
  public SoundIcon getIcon() {
    return icon;
  }

  public void setIcon(SoundIcon icon) {
    this.icon = icon;
  }

  public SoundAnnotation rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Gets or sets the sampling rate, in samples per second.
   * @return rate
  **/
  @ApiModelProperty(value = "Gets or sets the sampling rate, in samples per second.")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public SoundAnnotation channels(Integer channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Gets or sets the number of sound channels.
   * @return channels
  **/
  @ApiModelProperty(value = "Gets or sets the number of sound channels.")
  public Integer getChannels() {
    return channels;
  }

  public void setChannels(Integer channels) {
    this.channels = channels;
  }

  public SoundAnnotation bits(Integer bits) {
    this.bits = bits;
    return this;
  }

   /**
   * Gets or sets the number of bits per sample value per channel.
   * @return bits
  **/
  @ApiModelProperty(value = "Gets or sets the number of bits per sample value per channel.")
  public Integer getBits() {
    return bits;
  }

  public void setBits(Integer bits) {
    this.bits = bits;
  }

  public SoundAnnotation encoding(SoundEncoding encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Gets or sets the encoding format for the sample data.
   * @return encoding
  **/
  @ApiModelProperty(value = "Gets or sets the encoding format for the sample data.")
  public SoundEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(SoundEncoding encoding) {
    this.encoding = encoding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoundAnnotation soundAnnotation = (SoundAnnotation) o;
    return Objects.equals(this.filePath, soundAnnotation.filePath) &&
        Objects.equals(this.icon, soundAnnotation.icon) &&
        Objects.equals(this.rate, soundAnnotation.rate) &&
        Objects.equals(this.channels, soundAnnotation.channels) &&
        Objects.equals(this.bits, soundAnnotation.bits) &&
        Objects.equals(this.encoding, soundAnnotation.encoding) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, icon, rate, channels, bits, encoding, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoundAnnotation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

