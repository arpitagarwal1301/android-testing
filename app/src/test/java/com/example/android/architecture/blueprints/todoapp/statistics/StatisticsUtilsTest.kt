package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by arpitagarwal on 26,September,2020
 */
class StatisticsUtilsTest {

    @Test
    fun all_test_completed() {
        val list = listOf<Task>(
                Task("", "", true)
        )
        val result = getActiveAndCompletedStats(list)
        assertEquals(0f,result.activeTasksPercent)
        assertThat(result.completedTasksPercent, `is`(0f))

    }
}