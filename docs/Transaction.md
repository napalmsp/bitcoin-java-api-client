
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creationdate** | [**DateTime**](DateTime.md) | API register creation date. |  [optional]
**confirmationdate** | [**DateTime**](DateTime.md) | first confirmation date. |  [optional]
**blockchaincreationdate** | [**DateTime**](DateTime.md) | blockchain creation date. |  [optional]
**txid** | **String** | hash ID of blockchain transaction. |  [optional]
**amount** | **Float** | amount sended, 0 if OP_RETURN. |  [optional]
**fee** | **Float** | fee spended in the blockchain transaction. |  [optional]
**txsize** | **Integer** | tx size. |  [optional]
**txhex** | **String** | tx hexadecimal. |  [optional]
**data** | **String** | file or string hash or address |  [optional]
**feepriority** | **Integer** | account fee priority |  [optional]
**confirmations** | **Integer** | actual transaction confirmations count |  [optional]
**errormessage** | **String** | error message in case of errors |  [optional]
**coin** | **String** | coin |  [optional]
**test** | **Integer** | test |  [optional]



