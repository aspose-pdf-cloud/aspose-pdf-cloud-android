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
import com.aspose.asposecloudpdfandroid.model.Rectangle;
import com.aspose.asposecloudpdfandroid.model.SignatureCustomAppearance;
import com.aspose.asposecloudpdfandroid.model.SignatureType;
import com.aspose.asposecloudpdfandroid.model.TimestampSettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents signature.
 */
@ApiModel(description = "Represents signature.")

public class Signature {
  @SerializedName("SignaturePath")
  private String signaturePath = null;

  @SerializedName("SignatureType")
  private SignatureType signatureType = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("Appearance")
  private String appearance = null;

  @SerializedName("Reason")
  private String reason = null;

  @SerializedName("Contact")
  private String contact = null;

  @SerializedName("Location")
  private String location = null;

  @SerializedName("Visible")
  private Boolean visible = null;

  @SerializedName("Rectangle")
  private Rectangle rectangle = null;

  @SerializedName("FormFieldName")
  private String formFieldName = null;

  @SerializedName("Authority")
  private String authority = null;

  @SerializedName("Date")
  private String date = null;

  @SerializedName("ShowProperties")
  private Boolean showProperties = null;

  @SerializedName("TimestampSettings")
  private TimestampSettings timestampSettings = null;

  @SerializedName("IsValid")
  private Boolean isValid = null;

  @SerializedName("CustomAppearance")
  private SignatureCustomAppearance customAppearance = null;

  public Signature signaturePath(String signaturePath) {
    this.signaturePath = signaturePath;
    return this;
  }

   /**
   * Gets or sets the signature path.
   * @return signaturePath
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the signature path.")
  public String getSignaturePath() {
    return signaturePath;
  }

  public void setSignaturePath(String signaturePath) {
    this.signaturePath = signaturePath;
  }

  public Signature signatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Gets or sets the type of the signature.
   * @return signatureType
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the type of the signature.")
  public SignatureType getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(SignatureType signatureType) {
    this.signatureType = signatureType;
  }

  public Signature password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Gets or sets the signature password.
   * @return password
  **/
  @ApiModelProperty(value = "Gets or sets the signature password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Signature appearance(String appearance) {
    this.appearance = appearance;
    return this;
  }

   /**
   * Sets or gets a graphic appearance for the signature. Property value represents an image file name.
   * @return appearance
  **/
  @ApiModelProperty(value = "Sets or gets a graphic appearance for the signature. Property value represents an image file name.")
  public String getAppearance() {
    return appearance;
  }

  public void setAppearance(String appearance) {
    this.appearance = appearance;
  }

  public Signature reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Gets or sets the reason of the signature.
   * @return reason
  **/
  @ApiModelProperty(value = "Gets or sets the reason of the signature.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Signature contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Gets or sets the contact of the signature.
   * @return contact
  **/
  @ApiModelProperty(value = "Gets or sets the contact of the signature.")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Signature location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Gets or sets the location of the signature.
   * @return location
  **/
  @ApiModelProperty(value = "Gets or sets the location of the signature.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Signature visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this Signature is visible. Supports only when signing particular page.
   * @return visible
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether this Signature is visible. Supports only when signing particular page.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public Signature rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Gets or sets the visible rectangle of the signature. Supports only when signing particular page.
   * @return rectangle
  **/
  @ApiModelProperty(value = "Gets or sets the visible rectangle of the signature. Supports only when signing particular page.")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public Signature formFieldName(String formFieldName) {
    this.formFieldName = formFieldName;
    return this;
  }

   /**
   * Gets or sets the name of the signature field. Supports only when signing document with particular form field.
   * @return formFieldName
  **/
  @ApiModelProperty(value = "Gets or sets the name of the signature field. Supports only when signing document with particular form field.")
  public String getFormFieldName() {
    return formFieldName;
  }

  public void setFormFieldName(String formFieldName) {
    this.formFieldName = formFieldName;
  }

  public Signature authority(String authority) {
    this.authority = authority;
    return this;
  }

   /**
   * Gets or sets the name of the person or authority signing the document..
   * @return authority
  **/
  @ApiModelProperty(value = "Gets or sets the name of the person or authority signing the document..")
  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public Signature date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Gets or sets the time of signing.
   * @return date
  **/
  @ApiModelProperty(value = "Gets or sets the time of signing.")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Signature showProperties(Boolean showProperties) {
    this.showProperties = showProperties;
    return this;
  }

   /**
   * Gets or sets the showproperties in signature field
   * @return showProperties
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the showproperties in signature field")
  public Boolean isShowProperties() {
    return showProperties;
  }

  public void setShowProperties(Boolean showProperties) {
    this.showProperties = showProperties;
  }

  public Signature timestampSettings(TimestampSettings timestampSettings) {
    this.timestampSettings = timestampSettings;
    return this;
  }

   /**
   * Gets/sets timestamp settings.
   * @return timestampSettings
  **/
  @ApiModelProperty(value = "Gets/sets timestamp settings.")
  public TimestampSettings getTimestampSettings() {
    return timestampSettings;
  }

  public void setTimestampSettings(TimestampSettings timestampSettings) {
    this.timestampSettings = timestampSettings;
  }

  public Signature isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Verify the document regarding this signature and return true if document is valid or otherwise false.
   * @return isValid
  **/
  @ApiModelProperty(value = "Verify the document regarding this signature and return true if document is valid or otherwise false.")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public Signature customAppearance(SignatureCustomAppearance customAppearance) {
    this.customAppearance = customAppearance;
    return this;
  }

   /**
   * Gets/sets the custom appearance.
   * @return customAppearance
  **/
  @ApiModelProperty(value = "Gets/sets the custom appearance.")
  public SignatureCustomAppearance getCustomAppearance() {
    return customAppearance;
  }

  public void setCustomAppearance(SignatureCustomAppearance customAppearance) {
    this.customAppearance = customAppearance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;
    return Objects.equals(this.signaturePath, signature.signaturePath) &&
        Objects.equals(this.signatureType, signature.signatureType) &&
        Objects.equals(this.password, signature.password) &&
        Objects.equals(this.appearance, signature.appearance) &&
        Objects.equals(this.reason, signature.reason) &&
        Objects.equals(this.contact, signature.contact) &&
        Objects.equals(this.location, signature.location) &&
        Objects.equals(this.visible, signature.visible) &&
        Objects.equals(this.rectangle, signature.rectangle) &&
        Objects.equals(this.formFieldName, signature.formFieldName) &&
        Objects.equals(this.authority, signature.authority) &&
        Objects.equals(this.date, signature.date) &&
        Objects.equals(this.showProperties, signature.showProperties) &&
        Objects.equals(this.timestampSettings, signature.timestampSettings) &&
        Objects.equals(this.isValid, signature.isValid) &&
        Objects.equals(this.customAppearance, signature.customAppearance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signaturePath, signatureType, password, appearance, reason, contact, location, visible, rectangle, formFieldName, authority, date, showProperties, timestampSettings, isValid, customAppearance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    signaturePath: ").append(toIndentedString(signaturePath)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    appearance: ").append(toIndentedString(appearance)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    formFieldName: ").append(toIndentedString(formFieldName)).append("\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    showProperties: ").append(toIndentedString(showProperties)).append("\n");
    sb.append("    timestampSettings: ").append(toIndentedString(timestampSettings)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    customAppearance: ").append(toIndentedString(customAppearance)).append("\n");
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

