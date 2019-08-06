
# Bookmark
Provides link to bookmark.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Get the Title; | [optional]
**italic** | **Boolean** | Is bookmark italic. | [optional]
**bold** | **Boolean** | Is bookmark bold. | [optional]
**color** | [**Color**](Color.md) | Get the color | [optional]
**action** | **String** | Gets or sets the action bound with the bookmark. If PageNumber is presented the action can not be specified. The action type includes: "GoTo", "GoToR", "Launch", "Named". | [optional]
**level** | **Integer** | Gets or sets bookmark's hierarchy level. | [optional]
**destination** | **String** | Gets or sets bookmark's destination page. Required if action is set as string.Empty. | [optional]
**pageDisplay** | **String** | Gets or sets the type of display bookmark's destination page. | [optional]
**pageDisplay_Bottom** | **Integer** | Gets or sets the bottom coordinate of page display. | [optional]
**pageDisplay_Left** | **Integer** | Gets or sets the left coordinate of page display. | [optional]
**pageDisplay_Right** | **Integer** | Gets or sets the right coordinate of page display. | [optional]
**pageDisplay_Top** | **Integer** | Gets or sets the top coordinate of page display. | [optional]
**pageDisplay_Zoom** | **Integer** | Gets or sets the zoom factor of page display. | [optional]
**pageNumber** | **Integer** | Gets or sets the number of bookmark's destination page.  | [optional]
**remoteFile** | **String** | Gets or sets the file (path) which is required for "GoToR" action of bookmark. | [optional]
**bookmarks** | [**Bookmarks**](Bookmarks.md) | The children bookmarks. | [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Link to the document. | [optional]


[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


