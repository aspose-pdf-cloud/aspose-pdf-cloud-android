/**
 *
 *   Copyright (c) 2019 Aspose.PDF Cloud
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An abstract class which represents signature custon appearance object.
 */
@ApiModel(description = "An abstract class which represents signature custon appearance object.")

public class SignatureCustomAppearance {
  @SerializedName("FontFamilyName")
  private String fontFamilyName = null;

  @SerializedName("FontSize")
  private Double fontSize = null;

  @SerializedName("ShowContactInfo")
  private Boolean showContactInfo = null;

  @SerializedName("ShowReason")
  private Boolean showReason = null;

  @SerializedName("ShowLocation")
  private Boolean showLocation = null;

  @SerializedName("ContactInfoLabel")
  private String contactInfoLabel = null;

  @SerializedName("ReasonLabel")
  private String reasonLabel = null;

  @SerializedName("LocationLabel")
  private String locationLabel = null;

  @SerializedName("DigitalSignedLabel")
  private String digitalSignedLabel = null;

  @SerializedName("DateSignedAtLabel")
  private String dateSignedAtLabel = null;

  @SerializedName("DateTimeLocalFormat")
  private String dateTimeLocalFormat = null;

  @SerializedName("DateTimeFormat")
  private String dateTimeFormat = null;

  public SignatureCustomAppearance fontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
    return this;
  }

   /**
   * Gets/sets font family name. It should be existed in the document. Default value: Arial.
   * @return fontFamilyName
  **/
  @ApiModelProperty(value = "Gets/sets font family name. It should be existed in the document. Default value: Arial.")
  public String getFontFamilyName() {
    return fontFamilyName;
  }

  public void setFontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
  }

  public SignatureCustomAppearance fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets/sets font size. Default value: 10.
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Gets/sets font size. Default value: 10.")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public SignatureCustomAppearance showContactInfo(Boolean showContactInfo) {
    this.showContactInfo = showContactInfo;
    return this;
  }

   /**
   * Gets/sets contact info visibility. Default value: true.
   * @return showContactInfo
  **/
  @ApiModelProperty(required = true, value = "Gets/sets contact info visibility. Default value: true.")
  public Boolean isShowContactInfo() {
    return showContactInfo;
  }

  public void setShowContactInfo(Boolean showContactInfo) {
    this.showContactInfo = showContactInfo;
  }

  public SignatureCustomAppearance showReason(Boolean showReason) {
    this.showReason = showReason;
    return this;
  }

   /**
   * Gets/sets reason visibility. Default value: true.
   * @return showReason
  **/
  @ApiModelProperty(required = true, value = "Gets/sets reason visibility. Default value: true.")
  public Boolean isShowReason() {
    return showReason;
  }

  public void setShowReason(Boolean showReason) {
    this.showReason = showReason;
  }

  public SignatureCustomAppearance showLocation(Boolean showLocation) {
    this.showLocation = showLocation;
    return this;
  }

   /**
   * Gets/sets location visibility. Default value: true.
   * @return showLocation
  **/
  @ApiModelProperty(required = true, value = "Gets/sets location visibility. Default value: true.")
  public Boolean isShowLocation() {
    return showLocation;
  }

  public void setShowLocation(Boolean showLocation) {
    this.showLocation = showLocation;
  }

  public SignatureCustomAppearance contactInfoLabel(String contactInfoLabel) {
    this.contactInfoLabel = contactInfoLabel;
    return this;
  }

   /**
   * Gets/sets contact info label. Default value: \&quot;Contact\&quot;.
   * @return contactInfoLabel
  **/
  @ApiModelProperty(value = "Gets/sets contact info label. Default value: \"Contact\".")
  public String getContactInfoLabel() {
    return contactInfoLabel;
  }

  public void setContactInfoLabel(String contactInfoLabel) {
    this.contactInfoLabel = contactInfoLabel;
  }

  public SignatureCustomAppearance reasonLabel(String reasonLabel) {
    this.reasonLabel = reasonLabel;
    return this;
  }

   /**
   * Gets/sets reason label. Default value: \&quot;Reason\&quot;.
   * @return reasonLabel
  **/
  @ApiModelProperty(value = "Gets/sets reason label. Default value: \"Reason\".")
  public String getReasonLabel() {
    return reasonLabel;
  }

  public void setReasonLabel(String reasonLabel) {
    this.reasonLabel = reasonLabel;
  }

  public SignatureCustomAppearance locationLabel(String locationLabel) {
    this.locationLabel = locationLabel;
    return this;
  }

   /**
   * Gets/sets location label. Default value: \&quot;Location\&quot;.
   * @return locationLabel
  **/
  @ApiModelProperty(value = "Gets/sets location label. Default value: \"Location\".")
  public String getLocationLabel() {
    return locationLabel;
  }

  public void setLocationLabel(String locationLabel) {
    this.locationLabel = locationLabel;
  }

  public SignatureCustomAppearance digitalSignedLabel(String digitalSignedLabel) {
    this.digitalSignedLabel = digitalSignedLabel;
    return this;
  }

   /**
   * Gets/sets digital signed label. Default value: \&quot;Digitally signed by\&quot;.
   * @return digitalSignedLabel
  **/
  @ApiModelProperty(value = "Gets/sets digital signed label. Default value: \"Digitally signed by\".")
  public String getDigitalSignedLabel() {
    return digitalSignedLabel;
  }

  public void setDigitalSignedLabel(String digitalSignedLabel) {
    this.digitalSignedLabel = digitalSignedLabel;
  }

  public SignatureCustomAppearance dateSignedAtLabel(String dateSignedAtLabel) {
    this.dateSignedAtLabel = dateSignedAtLabel;
    return this;
  }

   /**
   * Gets/sets date signed label. Default value: \&quot;Date\&quot;.
   * @return dateSignedAtLabel
  **/
  @ApiModelProperty(value = "Gets/sets date signed label. Default value: \"Date\".")
  public String getDateSignedAtLabel() {
    return dateSignedAtLabel;
  }

  public void setDateSignedAtLabel(String dateSignedAtLabel) {
    this.dateSignedAtLabel = dateSignedAtLabel;
  }

  public SignatureCustomAppearance dateTimeLocalFormat(String dateTimeLocalFormat) {
    this.dateTimeLocalFormat = dateTimeLocalFormat;
    return this;
  }

   /**
   * Gets/sets datetime local format. Default value: \&quot;yyyy.MM.dd HH:mm:ss zzz\&quot;.
   * @return dateTimeLocalFormat
  **/
  @ApiModelProperty(value = "Gets/sets datetime local format. Default value: \"yyyy.MM.dd HH:mm:ss zzz\".")
  public String getDateTimeLocalFormat() {
    return dateTimeLocalFormat;
  }

  public void setDateTimeLocalFormat(String dateTimeLocalFormat) {
    this.dateTimeLocalFormat = dateTimeLocalFormat;
  }

  public SignatureCustomAppearance dateTimeFormat(String dateTimeFormat) {
    this.dateTimeFormat = dateTimeFormat;
    return this;
  }

   /**
   * Gets/sets datetime format. Default value: \&quot;yyyy.MM.dd HH:mm:ss\&quot;.
   * @return dateTimeFormat
  **/
  @ApiModelProperty(value = "Gets/sets datetime format. Default value: \"yyyy.MM.dd HH:mm:ss\".")
  public String getDateTimeFormat() {
    return dateTimeFormat;
  }

  public void setDateTimeFormat(String dateTimeFormat) {
    this.dateTimeFormat = dateTimeFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureCustomAppearance signatureCustomAppearance = (SignatureCustomAppearance) o;
    return Objects.equals(this.fontFamilyName, signatureCustomAppearance.fontFamilyName) &&
        Objects.equals(this.fontSize, signatureCustomAppearance.fontSize) &&
        Objects.equals(this.showContactInfo, signatureCustomAppearance.showContactInfo) &&
        Objects.equals(this.showReason, signatureCustomAppearance.showReason) &&
        Objects.equals(this.showLocation, signatureCustomAppearance.showLocation) &&
        Objects.equals(this.contactInfoLabel, signatureCustomAppearance.contactInfoLabel) &&
        Objects.equals(this.reasonLabel, signatureCustomAppearance.reasonLabel) &&
        Objects.equals(this.locationLabel, signatureCustomAppearance.locationLabel) &&
        Objects.equals(this.digitalSignedLabel, signatureCustomAppearance.digitalSignedLabel) &&
        Objects.equals(this.dateSignedAtLabel, signatureCustomAppearance.dateSignedAtLabel) &&
        Objects.equals(this.dateTimeLocalFormat, signatureCustomAppearance.dateTimeLocalFormat) &&
        Objects.equals(this.dateTimeFormat, signatureCustomAppearance.dateTimeFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontFamilyName, fontSize, showContactInfo, showReason, showLocation, contactInfoLabel, reasonLabel, locationLabel, digitalSignedLabel, dateSignedAtLabel, dateTimeLocalFormat, dateTimeFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureCustomAppearance {\n");
    
    sb.append("    fontFamilyName: ").append(toIndentedString(fontFamilyName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    showContactInfo: ").append(toIndentedString(showContactInfo)).append("\n");
    sb.append("    showReason: ").append(toIndentedString(showReason)).append("\n");
    sb.append("    showLocation: ").append(toIndentedString(showLocation)).append("\n");
    sb.append("    contactInfoLabel: ").append(toIndentedString(contactInfoLabel)).append("\n");
    sb.append("    reasonLabel: ").append(toIndentedString(reasonLabel)).append("\n");
    sb.append("    locationLabel: ").append(toIndentedString(locationLabel)).append("\n");
    sb.append("    digitalSignedLabel: ").append(toIndentedString(digitalSignedLabel)).append("\n");
    sb.append("    dateSignedAtLabel: ").append(toIndentedString(dateSignedAtLabel)).append("\n");
    sb.append("    dateTimeLocalFormat: ").append(toIndentedString(dateTimeLocalFormat)).append("\n");
    sb.append("    dateTimeFormat: ").append(toIndentedString(dateTimeFormat)).append("\n");
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

