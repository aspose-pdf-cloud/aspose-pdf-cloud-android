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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the privileges for accessing Pdf file.
 */
@ApiModel(description = "Represents the privileges for accessing Pdf file.")

public class DocumentPrivilege {
  @SerializedName("AllowPrint")
  private Boolean allowPrint = null;

  @SerializedName("AllowDegradedPrinting")
  private Boolean allowDegradedPrinting = null;

  @SerializedName("AllowModifyContents")
  private Boolean allowModifyContents = null;

  @SerializedName("AllowCopy")
  private Boolean allowCopy = null;

  @SerializedName("AllowModifyAnnotations")
  private Boolean allowModifyAnnotations = null;

  @SerializedName("AllowFillIn")
  private Boolean allowFillIn = null;

  @SerializedName("AllowScreenReaders")
  private Boolean allowScreenReaders = null;

  @SerializedName("AllowAssembly")
  private Boolean allowAssembly = null;

  @SerializedName("PrintAllowLevel")
  private Integer printAllowLevel = null;

  @SerializedName("ChangeAllowLevel")
  private Integer changeAllowLevel = null;

  @SerializedName("CopyAllowLevel")
  private Integer copyAllowLevel = null;

  public DocumentPrivilege allowPrint(Boolean allowPrint) {
    this.allowPrint = allowPrint;
    return this;
  }

   /**
   * Sets the permission which allow print or not.  true is allow and false or not set is forbidden.
   * @return allowPrint
  **/
  @ApiModelProperty(value = "Sets the permission which allow print or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowPrint() {
    return allowPrint;
  }

  public void setAllowPrint(Boolean allowPrint) {
    this.allowPrint = allowPrint;
  }

  public DocumentPrivilege allowDegradedPrinting(Boolean allowDegradedPrinting) {
    this.allowDegradedPrinting = allowDegradedPrinting;
    return this;
  }

   /**
   * Sets the permission which allow degraded printing or not.  true is allow and false or not set is forbidden.
   * @return allowDegradedPrinting
  **/
  @ApiModelProperty(value = "Sets the permission which allow degraded printing or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowDegradedPrinting() {
    return allowDegradedPrinting;
  }

  public void setAllowDegradedPrinting(Boolean allowDegradedPrinting) {
    this.allowDegradedPrinting = allowDegradedPrinting;
  }

  public DocumentPrivilege allowModifyContents(Boolean allowModifyContents) {
    this.allowModifyContents = allowModifyContents;
    return this;
  }

   /**
   * Sets the permission which allow modify contents or not.  true is allow and false or not set is forbidden.
   * @return allowModifyContents
  **/
  @ApiModelProperty(value = "Sets the permission which allow modify contents or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowModifyContents() {
    return allowModifyContents;
  }

  public void setAllowModifyContents(Boolean allowModifyContents) {
    this.allowModifyContents = allowModifyContents;
  }

  public DocumentPrivilege allowCopy(Boolean allowCopy) {
    this.allowCopy = allowCopy;
    return this;
  }

   /**
   * Sets the permission which allow copy or not.  true is allow and false or not set is forbidden.
   * @return allowCopy
  **/
  @ApiModelProperty(value = "Sets the permission which allow copy or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowCopy() {
    return allowCopy;
  }

  public void setAllowCopy(Boolean allowCopy) {
    this.allowCopy = allowCopy;
  }

  public DocumentPrivilege allowModifyAnnotations(Boolean allowModifyAnnotations) {
    this.allowModifyAnnotations = allowModifyAnnotations;
    return this;
  }

   /**
   * Sets the permission which allow modify annotations or not.  true is allow and false or not set is forbidden.
   * @return allowModifyAnnotations
  **/
  @ApiModelProperty(value = "Sets the permission which allow modify annotations or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowModifyAnnotations() {
    return allowModifyAnnotations;
  }

  public void setAllowModifyAnnotations(Boolean allowModifyAnnotations) {
    this.allowModifyAnnotations = allowModifyAnnotations;
  }

  public DocumentPrivilege allowFillIn(Boolean allowFillIn) {
    this.allowFillIn = allowFillIn;
    return this;
  }

   /**
   * Sets the permission which allow fill in forms or not.  true is allow and false or not set is forbidden.
   * @return allowFillIn
  **/
  @ApiModelProperty(value = "Sets the permission which allow fill in forms or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowFillIn() {
    return allowFillIn;
  }

  public void setAllowFillIn(Boolean allowFillIn) {
    this.allowFillIn = allowFillIn;
  }

  public DocumentPrivilege allowScreenReaders(Boolean allowScreenReaders) {
    this.allowScreenReaders = allowScreenReaders;
    return this;
  }

   /**
   * Sets the permission which allow screen readers or not.  true is allow and false or not set is forbidden.
   * @return allowScreenReaders
  **/
  @ApiModelProperty(value = "Sets the permission which allow screen readers or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowScreenReaders() {
    return allowScreenReaders;
  }

  public void setAllowScreenReaders(Boolean allowScreenReaders) {
    this.allowScreenReaders = allowScreenReaders;
  }

  public DocumentPrivilege allowAssembly(Boolean allowAssembly) {
    this.allowAssembly = allowAssembly;
    return this;
  }

   /**
   * Sets the permission which allow assembly or not.  true is allow and false or not set is forbidden.
   * @return allowAssembly
  **/
  @ApiModelProperty(value = "Sets the permission which allow assembly or not.  true is allow and false or not set is forbidden.")
  public Boolean isAllowAssembly() {
    return allowAssembly;
  }

  public void setAllowAssembly(Boolean allowAssembly) {
    this.allowAssembly = allowAssembly;
  }

  public DocumentPrivilege printAllowLevel(Integer printAllowLevel) {
    this.printAllowLevel = printAllowLevel;
    return this;
  }

   /**
   * Sets the print level of  document&#39;s privilege. Just as the Adobe Professional&#39;s Printing Allowed settings. 0: None. 1: Low Resolution (150 dpi). 2: High Resolution.
   * @return printAllowLevel
  **/
  @ApiModelProperty(value = "Sets the print level of  document's privilege. Just as the Adobe Professional's Printing Allowed settings. 0: None. 1: Low Resolution (150 dpi). 2: High Resolution.")
  public Integer getPrintAllowLevel() {
    return printAllowLevel;
  }

  public void setPrintAllowLevel(Integer printAllowLevel) {
    this.printAllowLevel = printAllowLevel;
  }

  public DocumentPrivilege changeAllowLevel(Integer changeAllowLevel) {
    this.changeAllowLevel = changeAllowLevel;
    return this;
  }

   /**
   * Sets the change level of  document&#39;s privilege. Just as the Adobe Professional&#39;s Changes Allowed settings. 0: None. 1: Inserting, Deleting and Rotating pages. 2: Filling in form fields and signing existing signature fields. 3: Commenting, filling in form fields, and signing existing signature fields. 4: Any except extracting pages.
   * @return changeAllowLevel
  **/
  @ApiModelProperty(value = "Sets the change level of  document's privilege. Just as the Adobe Professional's Changes Allowed settings. 0: None. 1: Inserting, Deleting and Rotating pages. 2: Filling in form fields and signing existing signature fields. 3: Commenting, filling in form fields, and signing existing signature fields. 4: Any except extracting pages.")
  public Integer getChangeAllowLevel() {
    return changeAllowLevel;
  }

  public void setChangeAllowLevel(Integer changeAllowLevel) {
    this.changeAllowLevel = changeAllowLevel;
  }

  public DocumentPrivilege copyAllowLevel(Integer copyAllowLevel) {
    this.copyAllowLevel = copyAllowLevel;
    return this;
  }

   /**
   * Sets the copy level of  document&#39;s privilege. Just as the Adobe Professional&#39;s permission settings. 0: None. 1: Enable text access for screen reader devices for the visually impaired. 2: Enable copying of text, images and other content.
   * @return copyAllowLevel
  **/
  @ApiModelProperty(value = "Sets the copy level of  document's privilege. Just as the Adobe Professional's permission settings. 0: None. 1: Enable text access for screen reader devices for the visually impaired. 2: Enable copying of text, images and other content.")
  public Integer getCopyAllowLevel() {
    return copyAllowLevel;
  }

  public void setCopyAllowLevel(Integer copyAllowLevel) {
    this.copyAllowLevel = copyAllowLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPrivilege documentPrivilege = (DocumentPrivilege) o;
    return Objects.equals(this.allowPrint, documentPrivilege.allowPrint) &&
        Objects.equals(this.allowDegradedPrinting, documentPrivilege.allowDegradedPrinting) &&
        Objects.equals(this.allowModifyContents, documentPrivilege.allowModifyContents) &&
        Objects.equals(this.allowCopy, documentPrivilege.allowCopy) &&
        Objects.equals(this.allowModifyAnnotations, documentPrivilege.allowModifyAnnotations) &&
        Objects.equals(this.allowFillIn, documentPrivilege.allowFillIn) &&
        Objects.equals(this.allowScreenReaders, documentPrivilege.allowScreenReaders) &&
        Objects.equals(this.allowAssembly, documentPrivilege.allowAssembly) &&
        Objects.equals(this.printAllowLevel, documentPrivilege.printAllowLevel) &&
        Objects.equals(this.changeAllowLevel, documentPrivilege.changeAllowLevel) &&
        Objects.equals(this.copyAllowLevel, documentPrivilege.copyAllowLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPrint, allowDegradedPrinting, allowModifyContents, allowCopy, allowModifyAnnotations, allowFillIn, allowScreenReaders, allowAssembly, printAllowLevel, changeAllowLevel, copyAllowLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPrivilege {\n");
    
    sb.append("    allowPrint: ").append(toIndentedString(allowPrint)).append("\n");
    sb.append("    allowDegradedPrinting: ").append(toIndentedString(allowDegradedPrinting)).append("\n");
    sb.append("    allowModifyContents: ").append(toIndentedString(allowModifyContents)).append("\n");
    sb.append("    allowCopy: ").append(toIndentedString(allowCopy)).append("\n");
    sb.append("    allowModifyAnnotations: ").append(toIndentedString(allowModifyAnnotations)).append("\n");
    sb.append("    allowFillIn: ").append(toIndentedString(allowFillIn)).append("\n");
    sb.append("    allowScreenReaders: ").append(toIndentedString(allowScreenReaders)).append("\n");
    sb.append("    allowAssembly: ").append(toIndentedString(allowAssembly)).append("\n");
    sb.append("    printAllowLevel: ").append(toIndentedString(printAllowLevel)).append("\n");
    sb.append("    changeAllowLevel: ").append(toIndentedString(changeAllowLevel)).append("\n");
    sb.append("    copyAllowLevel: ").append(toIndentedString(copyAllowLevel)).append("\n");
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

