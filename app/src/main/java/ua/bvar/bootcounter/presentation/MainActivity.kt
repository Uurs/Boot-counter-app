package ua.bvar.bootcounter.presentation

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ua.bvar.bootcounter.R
import ua.bvar.bootcounter.domain.usecase.GetAllBootEventsUseCase
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var getAllBootEventsUseCase: GetAllBootEventsUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateText()
    }

    private fun updateText() {

        lifecycleScope.launch {
            val count = withContext(Dispatchers.IO) {
                getAllBootEventsUseCase.execute().size
            }
            findViewById<TextView>(R.id.text).text = "Boot count: $count"
        }
    }
}