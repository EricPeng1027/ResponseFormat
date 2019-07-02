# ResponseFormat

#### Description
**This is a package providing a format way to wrap up the return value between methods and response content of a request from client.**

#### Software Architecture
Software architecture description
This software has two part:
1. ActionResult  
This class defines a package of return fields regarding method callings, fields included are:  
Fields|Description
---|:--:
|**code**|*error code value*|
|**result**|*result of the method action*|
|**msg**|*description of the error type according to error code*|
|**detail**|*detail information message*           
|**exception**|*exception*|         
|**data**|*value or object returned*|                           
set the value of each field as you need, usually *code*, *msg* and *data* are the most common fields I would choose to fill out, it's all up to you.

#### Installation

1. xxxx
2. xxxx
3. xxxx

#### Instructions

1. xxxx
2. xxxx
3. xxxx

#### Contribution

1. Fork the repository
2. Create Feat_xxx branch
3. Commit your code
4. Create Pull Request

