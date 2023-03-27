package ua.bvar.bootcounter.presentation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import ua.bvar.bootcounter.domain.usecase.IncrementBootCountUseCase
import javax.inject.Inject

@AndroidEntryPoint
class BootCompletedBroadcastReceiver : BroadcastReceiver() {

    @Inject
    lateinit var incrementBootCountUseCase: IncrementBootCountUseCase

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("BootCompletedBroadcastReceiver", "onReceive")
        runBlocking { withContext(Dispatchers.IO) { incrementBootCountUseCase.execute() } }
    }
}