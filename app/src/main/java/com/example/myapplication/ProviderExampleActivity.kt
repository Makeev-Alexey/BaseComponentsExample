package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.MyContentProvider.Companion.CONTENT_URI
import com.example.myapplication.MyContentProvider.Companion.URL
import com.example.myapplication.MyContentProvider.Companion.id
import com.example.myapplication.MyContentProvider.Companion.name
import com.example.myapplication.databinding.ActivityProviderExampleBinding

class ProviderExampleActivity : AppCompatActivity() {

    private val REQUEST_CODE_READ_CONTACTS = 1
    private val READ_CONTACTS_GRANTED = false
    private lateinit var binding: ActivityProviderExampleBinding

    /*
    Контент провайдер позволяет с помощью sqlite делиться данными приложения с другими приложениями,
    но в данном случае просто записывает в базу данных устройства информацию
    Может также использоваться для формирования единой базы данных в приложении
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProviderExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val projection = arrayOf(id, name)
        val cursor = contentResolver.query(CONTENT_URI, projection, null, null, name)
        println(cursor?.columnNames)
        if(cursor != null){
            println(cursor.columnNames)
        }
        else{
            println("error")
        }
        }
}