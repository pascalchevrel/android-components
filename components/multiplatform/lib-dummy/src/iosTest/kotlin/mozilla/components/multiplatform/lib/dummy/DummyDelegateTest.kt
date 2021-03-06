/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.multiplatform.lib.dummy

import kotlin.test.Test
import kotlin.test.assertEquals

class DummyDelegateTest {
    @Test
    fun getValue() {
        val dummy = Dummy(DummyDelegate())
        assertEquals("Dummy iOS", dummy.getValue())
    }
}
