
# TextBoxField
Provides TextBoxField.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**multiline** | **Boolean** | Gets or sets multiline flag of the field. If Multiline is true field can contain multiple lines of text. | [optional]
**spellCheck** | **Boolean** | Gets or sets spellcheck flag for field. If true field shall be spell checked. | [optional]
**scrollable** | **Boolean** | Gets or sets scrollable flag of field. If true field can be scrolled. | [optional]
**forceCombs** | **Boolean** | Gets or sets flag which indicates is field divided into spaced positions. | [optional]
**maxLen** | **Integer** | Gets or sets maximum length of text in the field. | [optional]
**barcode** | **String** | Adds barcode 128 into the field. Field value will be changed onto the code and field become read only. | [optional]
**partialName** | **String** | Field name. | [optional]
**rect** | [**Rectangle**](Rectangle.md) | Field rectangle. | [optional]
**value** | **String** | Field value. | [optional]
**pageIndex** | **Integer** | Page index. | 
**height** | **Double** | Gets or sets height of the field. | [optional]
**width** | **Double** | Gets or sets width of the field. | [optional]
**zIndex** | **Integer** | Z index. | [optional]
**isGroup** | **Boolean** | Is group. | [optional]
**parent** | [**FormField**](FormField.md) | Gets field parent. | [optional]
**isSharedField** | **Boolean** | Property for Generator support. Used when field is added to header or footer. If true, this field will created once and it's appearance will be visible on all pages of the document. If false, separated field will be created for every document page. | [optional]
**flags** | [**List&lt;AnnotationFlags&gt;**](AnnotationFlags.md) | Gets Flags of the field. | [optional]
**color** | [**Color**](Color.md) | Color of the annotation. | [optional]
**contents** | **String** | Get the field content. | [optional]
**margin** | [**MarginInfo**](MarginInfo.md) | Gets or sets a outer margin for paragraph (for pdf generation) | [optional]
**highlighting** | [**LinkHighlightingMode**](LinkHighlightingMode.md) | Field highlighting mode. | [optional]
**horizontalAlignment** | [**HorizontalAlignment**](HorizontalAlignment.md) | Gets HorizontalAlignment of the field. | [optional]
**verticalAlignment** | [**VerticalAlignment**](VerticalAlignment.md) | Gets VerticalAlignment of the field. | [optional]
**border** | [**Border**](Border.md) | Gets or sets annotation border characteristics. | [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Link to the document. | [optional]


[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


