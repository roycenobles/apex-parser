package com.roycenobles.apex.parser.ast.parsing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InputStreamTest {

    @Test
    public void testEof_givenInputIsEmptyString_returnsTrue() throws Exception {
        InputStream st = new InputStream("");
        Assert.assertEquals(st.eof(), (Boolean) true);
    }

    @Test
    public void testEof_givenInputIsNull_returnsTrue() throws Exception {
        InputStream st = new InputStream(null);
        Assert.assertEquals(st.eof(), (Boolean) true);
    }

    @Test
    public void testEof_givenInputIsString_returnsFalse() throws Exception {
        InputStream st = new InputStream("a");
        Assert.assertEquals(st.eof(), (Boolean) false);
    }

    @Test
    public void testNext_givenInputIsEmptyString_returnsNull() throws Exception {
        InputStream st = new InputStream("");
        Assert.assertEquals(st.next(), null);
    }

    @Test
    public void testNext_givenInputIsNull_returnsNull() throws Exception {
        InputStream st = new InputStream(null);
        Assert.assertEquals(st.next(), null);
    }

    @Test
    public void testNext_givenInputIsString_iteratesOverString() throws Exception {
        InputStream st = new InputStream("abcd");
        Assert.assertEquals(st.next(), (Character) 'a');
        Assert.assertEquals(st.next(), (Character) 'b');
        Assert.assertEquals(st.next(), (Character) 'c');
        Assert.assertEquals(st.next(), (Character) 'd');
        Assert.assertEquals(st.next(), null);
    }

    @Test
    public void testPeek_givenInputIsEmptyString_returnsNull() throws Exception {
        InputStream st = new InputStream("");
        Assert.assertEquals(st.peek(), null);
    }

    @Test
    public void testPeek_givenInputIsNull_returnsNull() throws Exception {
        InputStream st = new InputStream(null);
        Assert.assertEquals(st.peek(), null);
    }

    @Test
    public void testPeek_givenInputIsString_doesNotIterateString() throws Exception {
        InputStream st = new InputStream("abcd");
        Assert.assertEquals(st.peek(), (Character) 'a');
        Assert.assertEquals(st.peek(), (Character) 'a');
    }
}