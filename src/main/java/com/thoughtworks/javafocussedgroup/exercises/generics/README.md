# Generics Exercise

### Problem statement

**`Fundamentals Tribe File Converters`** is an application which houses various File converters like `Html -> PDF`, `PDF -> Text`, etc...

This list of converters is an ever-growing one. New converters keep getting added everyday and some converters keep getting removed.

The converters are really awesome! HTML gets converted to PDF in a jiffy and effortlessly. But, in the above example, there is no straight-forward way to generate TEXT out of HTML. First, HTML file has to be passed to `HTML -> PDF` converter and the resulting PDF file has to be passed through `PDF -> TEXT` converter. Currently the caller has to do this two-hop conversion manually.

Using Generics, provide a wrapper API to the caller, which internally checks for all the available converters and does the conversion (using straight / multi-hop conversion).

**Example:** 

Consider the following converters.
* HTML -> PDF
* PDF -> TEXT
* TEXT -> WORD

The caller should be able to pass an `HTML file` and request for `WORD` format and our program should do the `3-hop conversion` (in this case) and return the final `WORD` file to the caller.

**Focus on building the following things:**

* APIs to add / remove converters
* Generic API to accept input file of any type and output of any type
* Check the available converters for the given input and output types and go for the conversion
* Once these APIs are built, user should be able to add any converter and request for any conversion, no more code changes should be needed.

Have fun with Generics!!