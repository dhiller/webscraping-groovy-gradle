Bing Scraper
===

Minimal Webscraping example using groovy and gradle.

Queries the Bing search engine (google delivers 403 on querying it) and 
retrieves the number of search results by selecting the html element 
containing it.

Example:

    $ gradle -Pquery="Jason Newsted" runScript
    ...
    Searching for Jason+Newsted
    685.000 Ergebnisse

