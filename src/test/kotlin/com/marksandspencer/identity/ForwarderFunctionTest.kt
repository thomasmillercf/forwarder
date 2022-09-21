package com.marksandspencer.identity;
import com.microsoft.azure.functions.HttpStatus
import io.micronaut.azure.function.http.HttpRequestMessageBuilder
import io.micronaut.http.HttpMethod
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class ForwarderFunctionTest {

    @Test
    fun testFunction() {
        Function().use { function ->
           val response = function.request(HttpMethod.GET, "/forwarder")
                                  .invoke()
           Assertions.assertEquals(HttpStatus.OK, response.status)
        }
    }
}
