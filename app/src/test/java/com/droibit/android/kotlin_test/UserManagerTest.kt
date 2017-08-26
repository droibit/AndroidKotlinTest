package com.droibit.android.kotlin_test

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.assertj.core.api.Java6Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE, sdk = intArrayOf(19))
class UserManagerTest {

    private lateinit var userManager: UserManager

    @Before
    fun setUp() {
        userManager = UserManager()
    }

    @Test
    fun join() {
        val user = mock<User> {
            on { introduce() } doReturn "Test"
        }

        val introduced = userManager.join(user)
        assertThat(introduced).isEqualTo("Test")

        verify(user).introduce()
    }
}