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
import com.aspose.asposecloudpdfandroid.model.ImageTemplate;
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
 * Create document from images request.
 */
@ApiModel(description = "Create document from images request.")

public class ImageTemplatesRequest {
  @SerializedName("IsOCR")
  private Boolean isOCR = null;

  @SerializedName("OCRLangs")
  private String ocRLangs = null;

  @SerializedName("ImagesList")
  private List<ImageTemplate> imagesList = new ArrayList<ImageTemplate>();

  public ImageTemplatesRequest isOCR(Boolean isOCR) {
    this.isOCR = isOCR;
    return this;
  }

   /**
   * Using OCR function.
   * @return isOCR
  **/
  @ApiModelProperty(required = true, value = "Using OCR function.")
  public Boolean isIsOCR() {
    return isOCR;
  }

  public void setIsOCR(Boolean isOCR) {
    this.isOCR = isOCR;
  }

  public ImageTemplatesRequest ocRLangs(String ocRLangs) {
    this.ocRLangs = ocRLangs;
    return this;
  }

   /**
   * Language for recognition possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra      or thier combination e.g. eng+rus
   * @return ocRLangs
  **/
  @ApiModelProperty(value = "Language for recognition possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra      or thier combination e.g. eng+rus")
  public String getOcRLangs() {
    return ocRLangs;
  }

  public void setOcRLangs(String ocRLangs) {
    this.ocRLangs = ocRLangs;
  }

  public ImageTemplatesRequest imagesList(List<ImageTemplate> imagesList) {
    this.imagesList = imagesList;
    return this;
  }

  public ImageTemplatesRequest addImagesListItem(ImageTemplate imagesListItem) {
    this.imagesList.add(imagesListItem);
    return this;
  }

   /**
   * A List of objects describing images to be added.
   * @return imagesList
  **/
  @ApiModelProperty(required = true, value = "A List of objects describing images to be added.")
  public List<ImageTemplate> getImagesList() {
    return imagesList;
  }

  public void setImagesList(List<ImageTemplate> imagesList) {
    this.imagesList = imagesList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageTemplatesRequest imageTemplatesRequest = (ImageTemplatesRequest) o;
    return Objects.equals(this.isOCR, imageTemplatesRequest.isOCR) &&
        Objects.equals(this.ocRLangs, imageTemplatesRequest.ocRLangs) &&
        Objects.equals(this.imagesList, imageTemplatesRequest.imagesList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOCR, ocRLangs, imagesList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageTemplatesRequest {\n");
    
    sb.append("    isOCR: ").append(toIndentedString(isOCR)).append("\n");
    sb.append("    ocRLangs: ").append(toIndentedString(ocRLangs)).append("\n");
    sb.append("    imagesList: ").append(toIndentedString(imagesList)).append("\n");
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

