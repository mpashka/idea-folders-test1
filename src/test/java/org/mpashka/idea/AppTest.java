package org.mpashka.idea;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Test for simple App.
 */
public class AppTest {
    @Test
    public void testResourcePresent() {
        assertThat(getClass().getResource("/test-resource.txt"), notNullValue());
    }

    @Test
    public void testResourceEmbedPresent() {
        assertThat(getClass().getResource("test-resource-embed.txt"), notNullValue());
    }
}
