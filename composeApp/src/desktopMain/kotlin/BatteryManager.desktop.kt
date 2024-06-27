import oshi.SystemInfo
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        val systemInfo = SystemInfo()
        val batterLevel = systemInfo.hardware.powerSources.firstOrNull()

        return batterLevel?.remainingCapacityPercent?.times(100)?.roundToInt() ?: -1

    }

}