package com.abdul.bhaiya.secureapiusingndk

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abdul.bhaiya.secureapiusingndk.ui.theme.SecureAPIUsingNDKTheme

class MainActivity : ComponentActivity() {

    //In java
   /* static{
        System.loadLibrary("keys")
    }*/
    companion object {
        init {
            System.loadLibrary("keys")
        }
    }

    // In java
    //public native String GetApi();
    external fun getApi(): String

    //get Base Url
    external fun getBaseUrl() : String
    //get End Point
    external fun getEndPoint() : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //In java
        //String key2 = new String(Base64.decode(getApi(), Base64.DEFAULT))
        val key2 = String(android.util.Base64.decode(getApi(), android.util.Base64.DEFAULT))

        Log.d("SECRET_KEY", "Simple Api : " + getApi())
        Log.d("SECRET_KEY", "Encrypted Api : " + key2)

        Log.d("SECRET_KEY", "Base URL : " + getBaseUrl())
        Log.d("SECRET_KEY", "End Point : " + getEndPoint())

        setContent {
            SecureAPIUsingNDKTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SecureAPIUsingNDKTheme {
        Greeting("Android")
    }
}