import org.ccil.cowan.tagsoup.Parser;
import java.net.URLEncoder;

String ENCODING = "UTF-8"

def PARSER = new XmlSlurper(new Parser())

def query = URLEncoder.encode(args[0], ENCODING)

println "Searching for ${query}"

def url = "http://www.bing.com/search?q=${query}"

new URL(url).withReader (ENCODING) { reader -> 
    def document = PARSER.parse(reader)

    document.'**'.find{ it['@id'] == 'b_tween' }.span[0].each{ println it.text() }
} 
