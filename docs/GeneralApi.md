# GeneralApi

All URIs are relative to *https://api.unstructured.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPipeline**](GeneralApi.md#createPipeline) | **POST** /general/v0/general | Pipeline 1 |


<a name="createPipeline"></a>
# **createPipeline**
> List&lt;Object&gt; createPipeline().files(files).strategy(strategy).gzUncompressedContentType(gzUncompressedContentType).outputFormat(outputFormat).coordinates(coordinates).encoding(encoding).hiResModelName(hiResModelName).includePageBreaks(includePageBreaks).languages(languages).pdfInferTableStructure(pdfInferTableStructure).skipInferTableTypes(skipInferTableTypes).xmlKeepTags(xmlKeepTags).chunkingStrategy(chunkingStrategy).multipageSections(multipageSections).combineUnderNChars(combineUnderNChars).newAfterNChars(newAfterNChars).maxCharacters(maxCharacters).overlap(overlap).overlapAll(overlapAll).extractImageBlockTypes(extractImageBlockTypes).partitionParameters(partitionParameters).execute();

Pipeline 1

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **files** | **File**| The file to extract | [optional] |
| **strategy** | **String**| The strategy to use for partitioning PDF/image. Options are fast, hi_res, auto. Default: auto | [optional] |
| **gzUncompressedContentType** | **String**| If file is gzipped, use this content type after unzipping | [optional] |
| **outputFormat** | **String**| The format of the response. Supported formats are application/json and text/csv. Default: application/json. | [optional] |
| **coordinates** | **Boolean**| If true, return coordinates for each element. Default: false | [optional] |
| **encoding** | **String**| The encoding method used to decode the text input. Default: utf-8 | [optional] |
| **hiResModelName** | **String**| The name of the inference model used when strategy is hi_res | [optional] |
| **includePageBreaks** | **Boolean**| If True, the output will include page breaks if the filetype supports it. Default: false | [optional] |
| **languages** | [**List&lt;String&gt;**](String.md)| The languages present in the document, for use in partitioning and/or OCR | [optional] |
| **pdfInferTableStructure** | **Boolean**| If True and strategy&#x3D;hi_res, any Table Elements extracted from a PDF will include an additional metadata field, &#39;text_as_html&#39;, where the value (string) is a just a transformation of the data into an HTML &lt;table&gt;. | [optional] |
| **skipInferTableTypes** | [**List&lt;String&gt;**](String.md)| The document types that you want to skip table extraction with. Default: [&#39;pdf&#39;, &#39;jpg&#39;, &#39;png&#39;] | [optional] |
| **xmlKeepTags** | **Boolean**| If True, will retain the XML tags in the output. Otherwise it will simply extract the text from within the tags. Only applies to partition_xml. | [optional] |
| **chunkingStrategy** | **String**| Use one of the supported strategies to chunk the returned elements. Currently supports: by_title | [optional] |
| **multipageSections** | **Boolean**| If chunking strategy is set, determines if sections can span multiple sections. Default: true | [optional] |
| **combineUnderNChars** | **Integer**| If chunking strategy is set, combine elements until a section reaches a length of n chars. Default: 500 | [optional] |
| **newAfterNChars** | **Integer**| If chunking strategy is set, cut off new sections after reaching a length of n chars (soft max). Default: 1500 | [optional] |
| **maxCharacters** | **Integer**| If chunking strategy is set, cut off new sections after reaching a length of n chars (hard max). Default: 1500 | [optional] |
| **overlap** | **Integer**| A prefix of this many trailing characters from prior text-split chunk is applied to second and later chunks formed from oversized elements by text-splitting. Default: None | [optional] |
| **overlapAll** | **Boolean**| When True, overlap is also applied to &#39;normal&#39; chunks formed by combining whole elements. Use with caution as this can introduce noise into otherwise clean semantic units. Default: None | [optional] |
| **extractImageBlockTypes** | [**List&lt;String&gt;**](String.md)| The types of elements to extract, for use in extracting image blocks as base64 encoded data stored in metadata fields | [optional] |
| **partitionParameters** | [**PartitionParameters**](PartitionParameters.md)|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

