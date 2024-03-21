<div align="left">

[![Visit Unstructured](./header.png)](https://unstructured.io)

# [Unstructured](https://unstructured.io)

At Unstructured, we're on a mission to give organizations access to all of their data. We know the world runs on documents—from research reports and memos, to quarterly filings and plans of action, documents are the unit of information that companies depend on. And yet, 80% of this information is trapped in inaccessible formats, and businesses have long struggled to unlock this data, leading to information silos, inefficient decision-making, and repetitive work. Until now.

Unstructured captures this unstructured data wherever it lives and transforms it into AI-friendly JSON files for companies who are eager to fold AI into their business.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Unstructured&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>unstructured-java-sdk</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:unstructured-java-sdk:0.0.1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/unstructured-java-sdk-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Unstructured;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GeneralApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.unstructured.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    Unstructured client = new Unstructured(configuration);
    File files = new File("/path/to/file"); // The file to extract
    String strategy = "strategy_example"; // The strategy to use for partitioning PDF/image. Options are fast, hi_res, auto. Default: auto
    String gzUncompressedContentType = "gzUncompressedContentType_example"; // If file is gzipped, use this content type after unzipping
    String outputFormat = "outputFormat_example"; // The format of the response. Supported formats are application/json and text/csv. Default: application/json.
    Boolean coordinates = true; // If true, return coordinates for each element. Default: false
    String encoding = "encoding_example"; // The encoding method used to decode the text input. Default: utf-8
    String hiResModelName = "hiResModelName_example"; // The name of the inference model used when strategy is hi_res
    Boolean includePageBreaks = true; // If True, the output will include page breaks if the filetype supports it. Default: false
    List<String> languages = Arrays.asList(); // The languages present in the document, for use in partitioning and/or OCR
    Boolean pdfInferTableStructure = true; // If True and strategy=hi_res, any Table Elements extracted from a PDF will include an additional metadata field, 'text_as_html', where the value (string) is a just a transformation of the data into an HTML <table>.
    List<String> skipInferTableTypes = Arrays.asList(); // The document types that you want to skip table extraction with. Default: ['pdf', 'jpg', 'png']
    Boolean xmlKeepTags = true; // If True, will retain the XML tags in the output. Otherwise it will simply extract the text from within the tags. Only applies to partition_xml.
    String chunkingStrategy = "chunkingStrategy_example"; // Use one of the supported strategies to chunk the returned elements. Currently supports: by_title
    Boolean multipageSections = true; // If chunking strategy is set, determines if sections can span multiple sections. Default: true
    Integer combineUnderNChars = 56; // If chunking strategy is set, combine elements until a section reaches a length of n chars. Default: 500
    Integer newAfterNChars = 56; // If chunking strategy is set, cut off new sections after reaching a length of n chars (soft max). Default: 1500
    Integer maxCharacters = 56; // If chunking strategy is set, cut off new sections after reaching a length of n chars (hard max). Default: 1500
    Integer overlap = 56; // A prefix of this many trailing characters from prior text-split chunk is applied to second and later chunks formed from oversized elements by text-splitting. Default: None
    Boolean overlapAll = true; // When True, overlap is also applied to 'normal' chunks formed by combining whole elements. Use with caution as this can introduce noise into otherwise clean semantic units. Default: None
    List<String> extractImageBlockTypes = Arrays.asList(); // The types of elements to extract, for use in extracting image blocks as base64 encoded data stored in metadata fields
    try {
      List<Object> result = client
              .general
              .createPipeline()
              .files(files)
              .strategy(strategy)
              .gzUncompressedContentType(gzUncompressedContentType)
              .outputFormat(outputFormat)
              .coordinates(coordinates)
              .encoding(encoding)
              .hiResModelName(hiResModelName)
              .includePageBreaks(includePageBreaks)
              .languages(languages)
              .pdfInferTableStructure(pdfInferTableStructure)
              .skipInferTableTypes(skipInferTableTypes)
              .xmlKeepTags(xmlKeepTags)
              .chunkingStrategy(chunkingStrategy)
              .multipageSections(multipageSections)
              .combineUnderNChars(combineUnderNChars)
              .newAfterNChars(newAfterNChars)
              .maxCharacters(maxCharacters)
              .overlap(overlap)
              .overlapAll(overlapAll)
              .extractImageBlockTypes(extractImageBlockTypes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#createPipeline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Object>> response = client
              .general
              .createPipeline()
              .files(files)
              .strategy(strategy)
              .gzUncompressedContentType(gzUncompressedContentType)
              .outputFormat(outputFormat)
              .coordinates(coordinates)
              .encoding(encoding)
              .hiResModelName(hiResModelName)
              .includePageBreaks(includePageBreaks)
              .languages(languages)
              .pdfInferTableStructure(pdfInferTableStructure)
              .skipInferTableTypes(skipInferTableTypes)
              .xmlKeepTags(xmlKeepTags)
              .chunkingStrategy(chunkingStrategy)
              .multipageSections(multipageSections)
              .combineUnderNChars(combineUnderNChars)
              .newAfterNChars(newAfterNChars)
              .maxCharacters(maxCharacters)
              .overlap(overlap)
              .overlapAll(overlapAll)
              .extractImageBlockTypes(extractImageBlockTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#createPipeline");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.unstructured.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralApi* | [**createPipeline**](docs/GeneralApi.md#createPipeline) | **POST** /general/v0/general | Pipeline 1


## Documentation for Models

 - [PartitionParameters](docs/PartitionParameters.md)
 - [ValidationError](docs/ValidationError.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
