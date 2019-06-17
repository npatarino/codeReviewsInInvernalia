package snippets

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


// jons-code
fun main() {
    val url = ""
    val obj = URL(url)
    val con = obj.openConnection() as HttpURLConnection
    con.requestMethod = "GET"
    val `in` = BufferedReader(InputStreamReader(con.getInputStream()))
    var inputLine: String
    val response = StringBuffer()
}
// jons-code