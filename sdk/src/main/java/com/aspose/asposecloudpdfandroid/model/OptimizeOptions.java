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
import com.aspose.asposecloudpdfandroid.model.ImageCompressionVersion;
import com.aspose.asposecloudpdfandroid.model.ImageEncoding;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents Pdf optimize options.
 */
@ApiModel(description = "Represents Pdf optimize options.")

public class OptimizeOptions {
  @SerializedName("Password")
  private String password = null;

  @SerializedName("AllowReusePageContent")
  private Boolean allowReusePageContent = null;

  @SerializedName("CompressImages")
  private Boolean compressImages = null;

  @SerializedName("ImageQuality")
  private Integer imageQuality = null;

  @SerializedName("LinkDuplcateStreams")
  private Boolean linkDuplcateStreams = null;

  @SerializedName("RemoveUnusedObjects")
  private Boolean removeUnusedObjects = null;

  @SerializedName("RemoveUnusedStreams")
  private Boolean removeUnusedStreams = null;

  @SerializedName("UnembedFonts")
  private Boolean unembedFonts = null;

  @SerializedName("ResizeImages")
  private Boolean resizeImages = null;

  @SerializedName("MaxResolution")
  private Integer maxResolution = null;

  @SerializedName("SubsetFonts")
  private Boolean subsetFonts = null;

  @SerializedName("RemovePrivateInfo")
  private Boolean removePrivateInfo = null;

  @SerializedName("ImageEncoding")
  private ImageEncoding imageEncoding = null;

  @SerializedName("ImageCompressionVersion")
  private ImageCompressionVersion imageCompressionVersion = null;

  public OptimizeOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Specifies document password (if any) encoded with base-64.
   * @return password
  **/
  @ApiModelProperty(value = "Specifies document password (if any) encoded with base-64.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public OptimizeOptions allowReusePageContent(Boolean allowReusePageContent) {
    this.allowReusePageContent = allowReusePageContent;
    return this;
  }

   /**
   * If true page contents will be reused when document is optimized for equal pages.
   * @return allowReusePageContent
  **/
  @ApiModelProperty(value = "If true page contents will be reused when document is optimized for equal pages.")
  public Boolean isAllowReusePageContent() {
    return allowReusePageContent;
  }

  public void setAllowReusePageContent(Boolean allowReusePageContent) {
    this.allowReusePageContent = allowReusePageContent;
  }

  public OptimizeOptions compressImages(Boolean compressImages) {
    this.compressImages = compressImages;
    return this;
  }

   /**
   * If this flag is set to true images will be compressed in the document. Compression level is specified with ImageQuality property.
   * @return compressImages
  **/
  @ApiModelProperty(value = "If this flag is set to true images will be compressed in the document. Compression level is specified with ImageQuality property.")
  public Boolean isCompressImages() {
    return compressImages;
  }

  public void setCompressImages(Boolean compressImages) {
    this.compressImages = compressImages;
  }

  public OptimizeOptions imageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Specifies level of image compression when CompressImages flag is used.
   * @return imageQuality
  **/
  @ApiModelProperty(value = "Specifies level of image compression when CompressImages flag is used.")
  public Integer getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  public OptimizeOptions linkDuplcateStreams(Boolean linkDuplcateStreams) {
    this.linkDuplcateStreams = linkDuplcateStreams;
    return this;
  }

   /**
   * If this flag is set to true, Resource streams will be analyzed. If duplicate streams are found (i.e. if stream contents is equal), then thees streams will be stored as one object.  This allows to decrease document size in some cases (for example, when same document was concatenated multiple times).
   * @return linkDuplcateStreams
  **/
  @ApiModelProperty(value = "If this flag is set to true, Resource streams will be analyzed. If duplicate streams are found (i.e. if stream contents is equal), then thees streams will be stored as one object.  This allows to decrease document size in some cases (for example, when same document was concatenated multiple times).")
  public Boolean isLinkDuplcateStreams() {
    return linkDuplcateStreams;
  }

  public void setLinkDuplcateStreams(Boolean linkDuplcateStreams) {
    this.linkDuplcateStreams = linkDuplcateStreams;
  }

  public OptimizeOptions removeUnusedObjects(Boolean removeUnusedObjects) {
    this.removeUnusedObjects = removeUnusedObjects;
    return this;
  }

   /**
   * If this flag is set to true, all document objects will be checked and unused objects (i.e. objects which does not have any reference) are removed from document.
   * @return removeUnusedObjects
  **/
  @ApiModelProperty(value = "If this flag is set to true, all document objects will be checked and unused objects (i.e. objects which does not have any reference) are removed from document.")
  public Boolean isRemoveUnusedObjects() {
    return removeUnusedObjects;
  }

  public void setRemoveUnusedObjects(Boolean removeUnusedObjects) {
    this.removeUnusedObjects = removeUnusedObjects;
  }

  public OptimizeOptions removeUnusedStreams(Boolean removeUnusedStreams) {
    this.removeUnusedStreams = removeUnusedStreams;
    return this;
  }

   /**
   * If this flag set to true, every resource is checked on it&#39;s usage. If resource is never used, then resources is removed. This may decrease document size for example when pages were extracted from document. 
   * @return removeUnusedStreams
  **/
  @ApiModelProperty(value = "If this flag set to true, every resource is checked on it's usage. If resource is never used, then resources is removed. This may decrease document size for example when pages were extracted from document. ")
  public Boolean isRemoveUnusedStreams() {
    return removeUnusedStreams;
  }

  public void setRemoveUnusedStreams(Boolean removeUnusedStreams) {
    this.removeUnusedStreams = removeUnusedStreams;
  }

  public OptimizeOptions unembedFonts(Boolean unembedFonts) {
    this.unembedFonts = unembedFonts;
    return this;
  }

   /**
   * Make fonts not embedded if set to true. 
   * @return unembedFonts
  **/
  @ApiModelProperty(value = "Make fonts not embedded if set to true. ")
  public Boolean isUnembedFonts() {
    return unembedFonts;
  }

  public void setUnembedFonts(Boolean unembedFonts) {
    this.unembedFonts = unembedFonts;
  }

  public OptimizeOptions resizeImages(Boolean resizeImages) {
    this.resizeImages = resizeImages;
    return this;
  }

   /**
   * If this flag set to true and CompressImages is true images will be resized if image resolution is greater then specified MaxResolution parameter.
   * @return resizeImages
  **/
  @ApiModelProperty(value = "If this flag set to true and CompressImages is true images will be resized if image resolution is greater then specified MaxResolution parameter.")
  public Boolean isResizeImages() {
    return resizeImages;
  }

  public void setResizeImages(Boolean resizeImages) {
    this.resizeImages = resizeImages;
  }

  public OptimizeOptions maxResolution(Integer maxResolution) {
    this.maxResolution = maxResolution;
    return this;
  }

   /**
   * Specifies maximum resolution of images. If image has higher resolution it will be scaled.
   * @return maxResolution
  **/
  @ApiModelProperty(value = "Specifies maximum resolution of images. If image has higher resolution it will be scaled.")
  public Integer getMaxResolution() {
    return maxResolution;
  }

  public void setMaxResolution(Integer maxResolution) {
    this.maxResolution = maxResolution;
  }

  public OptimizeOptions subsetFonts(Boolean subsetFonts) {
    this.subsetFonts = subsetFonts;
    return this;
  }

   /**
   * Fonts will be converted into subsets if set to true.
   * @return subsetFonts
  **/
  @ApiModelProperty(value = "Fonts will be converted into subsets if set to true.")
  public Boolean isSubsetFonts() {
    return subsetFonts;
  }

  public void setSubsetFonts(Boolean subsetFonts) {
    this.subsetFonts = subsetFonts;
  }

  public OptimizeOptions removePrivateInfo(Boolean removePrivateInfo) {
    this.removePrivateInfo = removePrivateInfo;
    return this;
  }

   /**
   * Remove private information (page piece info).
   * @return removePrivateInfo
  **/
  @ApiModelProperty(value = "Remove private information (page piece info).")
  public Boolean isRemovePrivateInfo() {
    return removePrivateInfo;
  }

  public void setRemovePrivateInfo(Boolean removePrivateInfo) {
    this.removePrivateInfo = removePrivateInfo;
  }

  public OptimizeOptions imageEncoding(ImageEncoding imageEncoding) {
    this.imageEncoding = imageEncoding;
    return this;
  }

   /**
   * Image encode which will be used.
   * @return imageEncoding
  **/
  @ApiModelProperty(value = "Image encode which will be used.")
  public ImageEncoding getImageEncoding() {
    return imageEncoding;
  }

  public void setImageEncoding(ImageEncoding imageEncoding) {
    this.imageEncoding = imageEncoding;
  }

  public OptimizeOptions imageCompressionVersion(ImageCompressionVersion imageCompressionVersion) {
    this.imageCompressionVersion = imageCompressionVersion;
    return this;
  }

   /**
   * Version of compression algorithm. Possible values are: \&quot;Standard\&quot; - standard compression, \&quot;Fast\&quot; - fast (improved compression which is faster then standard but may be applicable not for all images), \&quot;Mixed\&quot; - mixed (standard compression is applied to images which can not be compressed by  faster algorithm, this may give best compression but more slow then \&quot;Fast\&quot; algorithm. Version \&quot;Fast\&quot; is not applicable for resizing images (standard method will be used). Default is \&quot;Standard\&quot;.
   * @return imageCompressionVersion
  **/
  @ApiModelProperty(value = "Version of compression algorithm. Possible values are: \"Standard\" - standard compression, \"Fast\" - fast (improved compression which is faster then standard but may be applicable not for all images), \"Mixed\" - mixed (standard compression is applied to images which can not be compressed by  faster algorithm, this may give best compression but more slow then \"Fast\" algorithm. Version \"Fast\" is not applicable for resizing images (standard method will be used). Default is \"Standard\".")
  public ImageCompressionVersion getImageCompressionVersion() {
    return imageCompressionVersion;
  }

  public void setImageCompressionVersion(ImageCompressionVersion imageCompressionVersion) {
    this.imageCompressionVersion = imageCompressionVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizeOptions optimizeOptions = (OptimizeOptions) o;
    return Objects.equals(this.password, optimizeOptions.password) &&
        Objects.equals(this.allowReusePageContent, optimizeOptions.allowReusePageContent) &&
        Objects.equals(this.compressImages, optimizeOptions.compressImages) &&
        Objects.equals(this.imageQuality, optimizeOptions.imageQuality) &&
        Objects.equals(this.linkDuplcateStreams, optimizeOptions.linkDuplcateStreams) &&
        Objects.equals(this.removeUnusedObjects, optimizeOptions.removeUnusedObjects) &&
        Objects.equals(this.removeUnusedStreams, optimizeOptions.removeUnusedStreams) &&
        Objects.equals(this.unembedFonts, optimizeOptions.unembedFonts) &&
        Objects.equals(this.resizeImages, optimizeOptions.resizeImages) &&
        Objects.equals(this.maxResolution, optimizeOptions.maxResolution) &&
        Objects.equals(this.subsetFonts, optimizeOptions.subsetFonts) &&
        Objects.equals(this.removePrivateInfo, optimizeOptions.removePrivateInfo) &&
        Objects.equals(this.imageEncoding, optimizeOptions.imageEncoding) &&
        Objects.equals(this.imageCompressionVersion, optimizeOptions.imageCompressionVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, allowReusePageContent, compressImages, imageQuality, linkDuplcateStreams, removeUnusedObjects, removeUnusedStreams, unembedFonts, resizeImages, maxResolution, subsetFonts, removePrivateInfo, imageEncoding, imageCompressionVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizeOptions {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    allowReusePageContent: ").append(toIndentedString(allowReusePageContent)).append("\n");
    sb.append("    compressImages: ").append(toIndentedString(compressImages)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    linkDuplcateStreams: ").append(toIndentedString(linkDuplcateStreams)).append("\n");
    sb.append("    removeUnusedObjects: ").append(toIndentedString(removeUnusedObjects)).append("\n");
    sb.append("    removeUnusedStreams: ").append(toIndentedString(removeUnusedStreams)).append("\n");
    sb.append("    unembedFonts: ").append(toIndentedString(unembedFonts)).append("\n");
    sb.append("    resizeImages: ").append(toIndentedString(resizeImages)).append("\n");
    sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
    sb.append("    subsetFonts: ").append(toIndentedString(subsetFonts)).append("\n");
    sb.append("    removePrivateInfo: ").append(toIndentedString(removePrivateInfo)).append("\n");
    sb.append("    imageEncoding: ").append(toIndentedString(imageEncoding)).append("\n");
    sb.append("    imageCompressionVersion: ").append(toIndentedString(imageCompressionVersion)).append("\n");
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

