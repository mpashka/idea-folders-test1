package org.mpashka.idea;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Unit test for simple App.
 */
public class AppUnitTest {
    @Test
    public void testUnitResourcePresent() {
        assertThat(getClass().getResource("/test-unit-resource.txt"), notNullValue());
    }

    @Test
    public void testUnitResourceEmbedPresent() {
        assertThat(getClass().getResource("test-unit-resource-embed.txt"), notNullValue());
    }
}
