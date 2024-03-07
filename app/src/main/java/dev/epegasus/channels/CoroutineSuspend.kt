package dev.epegasus.channels

import android.util.Log
import dev.epegasus.channels.utils.ConstantUtils.TAG_SUSPEND
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * @Author: SOHAIB AHMED
 * @Date: 07/03/2024
 * @Accounts
 *      -> https://github.com/epegasus
 *      -> https://stackoverflow.com/users/20440272/sohaib-ahmed
 */

class CoroutineSuspend {

    fun initSuspendFunctions() {
        CoroutineScope(Dispatchers.Main).launch {
            impFirst()
            impSecond()
        }
    }

    private suspend fun impFirst() {
        Log.d(TAG_SUSPEND, "impFirst: started")
        delay(1000)
        Log.d(TAG_SUSPEND, "impFirst: completed")
    }

    private suspend fun impSecond() {
        Log.d(TAG_SUSPEND, "impSecond: started")
        delay(1000)
        Log.d(TAG_SUSPEND, "impSecond: completed")
    }
}