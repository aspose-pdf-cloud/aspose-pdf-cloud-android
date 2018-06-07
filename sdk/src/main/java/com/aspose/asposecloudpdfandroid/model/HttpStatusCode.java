/**
 *
 *   Copyright (c) 2018 Aspose.Pdf for Cloud
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(HttpStatusCode.Adapter.class)
public enum HttpStatusCode {
  
  CONTINUE(100),
  SWITCHING_PROTOCOLS(101),
  OK(200),
  CREATED(201),
  ACCEPTED(202),
  NON_AUTHORITATIVE_INFORMATION(203),
  NO_CONTENT(204),
  RESET_CONTENT(205),
  PARTIAL_CONTENT(206),
  MULTIPLE_CHOICES(300),
  AMBIGUOUS(300),
  MOVED_PERMANENTLY(301),
  MOVED(301),
  FOUND(302),
  REDIRECT(302),
  SEE_OTHER(303),
  REDIRECT_METHOD(303),
  NOT_MODIFIED(304),
  USE_PROXY(305),
  UNUSED(306),
  TEMPORARY_REDIRECT(307),
  REDIRECT_KEEP_VERB(307),
  BAD_REQUEST(400),
  UNAUTHORIZED(401),
  PAYMENT_REQUIRED(402),
  FORBIDDEN(403),
  NOT_FOUND(404),
  METHOD_NOT_ALLOWED(405),
  NOT_ACCEPTABLE(406),
  PROXY_AUTHENTICATION_REQUIRED(407),
  REQUEST_TIMEOUT(408),
  CONFLICT(409),
  GONE(410),
  LENGTH_REQUIRED(411),
  PRECONDITION_FAILED(412),
  REQUEST_ENTITY_TOO_LARGE(413),
  REQUEST_URI_TOO_LONG(414),
  UNSUPPORTED_MEDIA_TYPE(415),
  REQUESTED_RANGE_NOT_SATISFIABLE(416),
  EXPECTATION_FAILED(417),
  UPGRADE_REQUIRED(426),
  INTERNAL_SERVER_ERROR(500),
  NOT_IMPLEMENTED(501),
  BAD_GATEWAY(502),
  SERVICE_UNAVAILABLE(503),
  GATEWAY_TIMEOUT(504),
  HTTP_VERSION_NOT_SUPPORTED(505);

  private Integer value;

  HttpStatusCode(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HttpStatusCode fromValue(String text) {
    for (HttpStatusCode b : HttpStatusCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HttpStatusCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final HttpStatusCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HttpStatusCode read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return HttpStatusCode.fromValue(String.valueOf(value));
    }
  }
}

