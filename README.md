# ResponseFormat

#### Description
**This is a package providing a format way to wrap up the return value between methods and response content of a request from client.**

#### Software Architecture
Software architecture description

This software has 4 parts:
1. ActionResult<br/>
This class defines a package of return fields regarding method callings, fields included are: 
 
Fields|Description
:--:|--
|**code**|*error code value*|
|**result**|*result of the method action*|
|**msg**|*description of the error type according to error code*|
|**detail**|*detail information message*           
|**exception**|*exception*|         
|**data**|*value or object returned*|
                           
set the value of each field as you need, usually *code*, *msg* and *data* are the most common fields I would choose to fill out, it's all up to you.
<br/>
<br/>  
2. CommonMessage<br/>
This class defines a package of return fields of response content from a request, fields included are:  

Fields|Description
:--:|--
|**code**|*self-defined return code or HTTP status code*|
|**desc**|*description of the code*|
<br/>
<br/>  
3. ActionMessage<br/>
This class extends CommonMessage and provides extra important content, which are:

Fields|Description
:--:|--
|**responseContent**|*response content*|
|**msg**|*extra message of response*|
<br/>
<br/>  
4. Instances of ActionMessage<br/>
These are some portable instances of ActionMessage, which are ActionSuccMessage, ActionFailedMessage and ActionErrorMessage. They help you construct your response easier.

#### Maven

```xml
<dependency>
    <groupId>com.github.ericpeng1027</groupId>
    <artifactId>ResponseFormat</artifactId>
    <version>0.1</version>
</dependency>
```

#### Contribution

1. Fork the repository
2. Create Feat_xxx branch
3. Commit your code
4. Create Pull Request

