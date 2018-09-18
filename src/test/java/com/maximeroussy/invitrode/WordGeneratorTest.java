package com.maximeroussy.invitrode;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitQuickcheck.class)
public class WordGeneratorTest {
    private WordGenerator sut;

    @Before
    public void setUp() {
        sut = new WordGenerator();
    }

    @Property
    public void generatesWordsOfSpecifiedLength(@InRange(min = "3", max = "500") int wordLength) {
        String wordResult = sut.newWord(wordLength);

        assertThat(wordResult.length(), is(wordLength));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsIllegalArgumentExceptionForArgumentLowerThanThree() {
        int wordLength = 2;

        sut.newWord(wordLength);
    }
}
