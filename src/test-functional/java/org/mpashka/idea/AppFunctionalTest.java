package org.mpashka.idea;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Unit test for simple App.
 */
public class AppFunctionalTest {
    @Test
    public void testFunctionalResourcePresent() {
        assertThat(getClass().getResource("/test-functional-resource.txt"), notNullValue());
    }

    @Test
    public void testFunctionalResourceEmbedPresent() {
        assertThat(getClass().getResource("test-functional-resource-embed.txt"), notNullValue());
    }
}
